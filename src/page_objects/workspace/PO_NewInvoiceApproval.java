package page_objects.workspace;

import org.openqa.selenium.By;

import browser.Browser;

public class PO_NewInvoiceApproval {

	public void addFile() {
		Browser.instance.findElement(By.xpath("//label[text()='Select your invoice file']//..//..//..//input")).sendKeys("C:\\Dreamix\\bpm\\InvoiceManagement\\BPM-Invoice-UITestAutomation\\testFile.pdf");
	}

	public void addFile(String filePath) {
		Browser.instance.findElement(By.xpath("//label[text()='Select your invoice file']//..//..//..//input")).sendKeys(filePath);
	}
}
