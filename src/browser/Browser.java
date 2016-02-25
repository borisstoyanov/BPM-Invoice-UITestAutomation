package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver instance;

	public static void init() {
		instance = new FirefoxDriver();
			
		instance.get("http://www.google.com");
		
	}

	public static void quit() {
		instance.quit();
	}

}
