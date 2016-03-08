package browser;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	public static RemoteWebDriver instance;

	public static void init() {
		FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\boris\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\me4atb4i.default"));                  

		new DesiredCapabilities();
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);

		instance = new RemoteWebDriver(capabilities);

	}

	public static void quit() {
		instance.quit();
	}

	public static void waitForXpath(String xpath, int timeout) {
		WebDriverWait wait = new WebDriverWait(Browser.instance, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public static void handleMultipleWindows(String windowTitle) {
		int i = 0;
		Set<String> windows;
		do {
			i++;
			windows = instance.getWindowHandles();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i>=10){
				break;
			}
		} while (windows.size() == 1);

		for (String window : windows) {
			instance.switchTo().window(window);
			if (instance.getTitle().contains(windowTitle)) {
				return;
			}
		}
	}

	public static void waitForID(String id, int timeout) {
		WebDriverWait wait = new WebDriverWait(Browser.instance, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));		
	}
}
