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

	public void addEntity(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addVendorNumber(String string) {
		// TODO Auto-generated method stub
		
	}

	public void selectInvoiceType(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addInvoiceNumber(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addInvoiceDescription(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addCurrency(String string) {
		// TODO Auto-generated method stub
		
	}

	public void addTotal(String string) {
		// TODO Auto-generated method stub
		
	}

	public void submit() {
		// TODO Auto-generated method stub
		
	}
}
