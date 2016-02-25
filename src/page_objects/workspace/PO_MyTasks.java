package page_objects.workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Browser;

public class PO_MyTasks {

	public PO_MyTasks(){
		WebDriverWait wait = new WebDriverWait(Browser.instance, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Tasks')]")));	}
}
