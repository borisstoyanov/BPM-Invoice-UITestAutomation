package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.Browser;
import enums.WorkspaceUsers;
import enums.WorspacePasswords;
import page_objects.workspace.PO_Applications;
import page_objects.workspace.PO_LoginPage;
import page_objects.workspace.PO_MyTasks;

public class CreateInvoice {
	PO_MyTasks myTasks;
	
	@BeforeMethod
	public void setup(){
		Browser.init();
		PO_LoginPage login = PO_LoginPage.goTo();
		myTasks = login.loginWith(WorkspaceUsers.TESTAPUK_USER).withPass(WorspacePasswords.TESTAPUK_PASS).login();
		
	}
	
	@Test
	public void createInvoice(){
		
		PO_Applications app = myTasks.goToApplications();
		app.startInvoiceApproval();
		
	}

}
