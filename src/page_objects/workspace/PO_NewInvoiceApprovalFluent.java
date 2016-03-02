package page_objects.workspace;

import org.openqa.selenium.By;

import browser.Browser;

public class PO_NewInvoiceApprovalFluent {
	public PO_NewInvoiceApprovalFluent addFile() {
		Browser.instance.findElement(By.xpath("//label[text()='Select your invoice file']//..//..//..//input"))
				.sendKeys("C:\\Dreamix\\bpm\\InvoiceManagement\\BPM-Invoice-UITestAutomation\\testFile.pdf");
		return this;

	}

	public PO_NewInvoiceApprovalFluent addFile(String filePath) {
		Browser.instance.findElement(By.xpath("//label[text()='Select your invoice file']//..//..//..//input"))
				.sendKeys(filePath);
		return this;

	}

	public PO_NewInvoiceApprovalFluent addEntity(String string) {
		// TODO Auto-generated method stub

		return this;

	}

	public PO_NewInvoiceApprovalFluent addVendorNumber(String string) {
		// TODO Auto-generated method stub

		return this;

	}

	public PO_NewInvoiceApprovalFluent selectInvoiceType(String string) {
		// TODO Auto-generated method stub

		return this;

	}

	public PO_NewInvoiceApprovalFluent addInvoiceNumber(String string) {
		// TODO Auto-generated method stub

		return this;

	}

	public PO_NewInvoiceApprovalFluent addInvoiceDescription(String string) {
		// TODO Auto-generated method stub

		return this;

	}

	public PO_NewInvoiceApprovalFluent addCurrency(String string) {
		// TODO Auto-generated method stub

		return this;

	}

	public PO_NewInvoiceApprovalFluent addTotal(String string) {
		// TODO Auto-generated method stub

		return this;

	}

	public PO_NewInvoiceApprovalFluent submit() {
		// TODO Auto-generated method stub

		return this;

	}
}
