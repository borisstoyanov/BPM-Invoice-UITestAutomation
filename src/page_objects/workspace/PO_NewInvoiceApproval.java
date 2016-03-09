package page_objects.workspace;

import org.openqa.selenium.By;

import browser.Browser;
import enums.InvoiceType;
import utils.Util;

public class PO_NewInvoiceApproval {
	
	public PO_NewInvoiceApproval(){
		PO_NewInvoiceApprovalFluent createInvoice = new PO_NewInvoiceApprovalFluent();
		createInvoice.addFile("C:\\Dreamix\\bpm\\InvoiceManagement\\BPM-Invoice-UITestAutomation\\testFile.pdf");
		createInvoice.addEntity("0200");
		createInvoice.addVendorNumber("0000100924");
		createInvoice.selectInvoiceType(InvoiceType.INVOICE);
		createInvoice.addInvoiceNumber(Util.getInvoiceNumber());
		createInvoice.addInvoiceDate(Util.getDate());
		createInvoice.addInvoiceDescription("Some Description");
		createInvoice.addCurrency("USD");
		createInvoice.addTotal("455");
		
	}
	
	public PO_NewInvoiceApprovalFluent createinvoice(){
		return new PO_NewInvoiceApprovalFluent();
	}

	public PO_Workspace submitSuccessfullInvoice() {
		Browser.instance.findElement(By.id("ctb2")).click();
		
		Browser.handleMultipleWindows("Business Process Workspace");
		
		return new PO_Workspace();
	}

	public PO_NewInvoiceVerifications submitAndVerify() {
		
		return new PO_NewInvoiceVerifications();
	}
	
}
