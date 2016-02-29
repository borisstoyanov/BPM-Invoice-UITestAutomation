package page_objects.workspace;

import org.openqa.selenium.By;

import browser.Browser;

public class PO_Applications {

	public PO_NewInvoiceApproval startInvoiceApproval() {
		
		Browser.waitForXpath("//a[text()='InvoiceApproval']", 20);
		
		Browser.instance.findElement(By.xpath("//a[text()='InvoiceApproval']")).click();
		
		switchToInvoiceApprovalWindow();
		return new PO_NewInvoiceApproval();
	}

	private void switchToInvoiceApprovalWindow() {
		Browser.handleMultipleWindows("Submit invoice for approval");
	}
}
