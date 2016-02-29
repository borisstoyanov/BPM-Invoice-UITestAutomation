package browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	public static WebDriver instance;

	public static void init() {
		instance = new FirefoxDriver();
			
		instance.get("http://www.google.com");
		
	}

	public static void quit() {
		instance.quit();
	}
	
	public static void waitForXpath(String xpath, int timeout){
		WebDriverWait wait = new WebDriverWait(Browser.instance, timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));	
	}

	
	 public static void handleMultipleWindows(String windowTitle) {
         Set<String> windows = instance.getWindowHandles();

         for (String window : windows) {
        	 instance.switchTo().window(window);
             if (instance.getTitle().contains(windowTitle)) {
                 return;
             }
         }
     }
}
