package browser;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	public static WebDriver instance;

	public static void init() {
		
		FirefoxProfile profile = new FirefoxProfile(new File("C:\\Users\\boris\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\me4atb4i.default"));                  
		instance = new FirefoxDriver(profile);

	}

	public static void quit() {
		instance.quit();
	}

	public static void waitForXpath(String xpath, int timeout) {
		WebDriverWait wait = new WebDriverWait(Browser.instance, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public static void handleMultipleWindows(String windowTitle) {
		
		Set<String> windows;
		do {
			
			windows = instance.getWindowHandles();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
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
