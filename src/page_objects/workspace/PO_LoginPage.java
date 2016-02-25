package page_objects.workspace;

import org.testng.Assert;

import browser.Browser;
import enums.WorkspaceUsers;

public class PO_LoginPage {
	
	public PO_LoginPage(){
		Assert.assertTrue(isAt());
	}
	
	public static boolean isAt() {
		return Browser.instance.getTitle().equalsIgnoreCase("Business Process Workspace");
	}

	public static PO_LoginPage goTo() {
		Browser.instance.get("http://bpmuat115.vistajet.local:8001/bpm/workspace/");
		return new PO_LoginPage();
	}

	public PO_LoginPageFluent loginWith(WorkspaceUsers user) {

		return new PO_LoginPageFluent(user);
	}

}
