package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.Browser;
import enums.WorkspaceUsers;
import enums.WorspacePasswords;
import page_objects.workspace.PO_Applications;
import page_objects.workspace.PO_LoginPage;
import page_objects.workspace.PO_MyTasks;
import page_objects.workspace.PO_NewInvoiceApproval;

public class CreateInvoice {
	PO_MyTasks myTasks;
	
	@BeforeMethod(alwaysRun = true)
	public void setup(){
		Browser.init();
		PO_LoginPage login = PO_LoginPage.goTo();
		myTasks = login.loginWith(WorkspaceUsers.TESTAPAT).withPass(WorspacePasswords.TESTAPAT).login();
		
	}

	@AfterMethod(alwaysRun = true)
	public void cleanUp(){
		Browser.quit();
	}
	
	@Test(groups = { "UITest" })
	public void createInvoice(){
		
		PO_Applications app = myTasks.goToApplications();
		PO_NewInvoiceApproval newInvoice = app.startInvoiceApproval();
		newInvoice.submitSuccessfullInvoice();
								
	}

}
