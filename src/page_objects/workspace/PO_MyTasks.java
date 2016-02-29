package page_objects.workspace;

import org.openqa.selenium.By;

import browser.Browser;

public class PO_MyTasks {

	public PO_MyTasks(){
		Browser.waitForXpath("//a[contains(text(),'My Tasks')]", 20);
	}

	public PO_Applications goToApplications() {
		
		Browser.waitForXpath("//a[@title='Applications']", 20);
		Browser.instance.findElement(By.xpath("//a[@title='Applications']")).click();
		return new PO_Applications();
	}
}
