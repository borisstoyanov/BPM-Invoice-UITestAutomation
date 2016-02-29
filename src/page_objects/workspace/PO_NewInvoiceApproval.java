package page_objects.workspace;

import org.openqa.selenium.By;

import browser.Browser;

public class PO_NewInvoiceApproval {

	public void addFile() {
		Browser.instance.findElement(By.xpath("//input[@value='UPDATE']")).sendKeys("C:\\Dreamix\\bpm\\InvoiceManagement\\BPM-Invoice-UITestAutomation\\testFile.pdf");
	}

}
