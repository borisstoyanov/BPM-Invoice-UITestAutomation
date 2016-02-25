package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.Browser;
import enums.WorspacePasswords;
import enums.WorkspaceUsers;
import page_objects.workspace.*;

public class Login {
	
	@BeforeTest
	public void setup(){
		Browser.init();
	}
	
	@Test
	public void loginTest(){
		PO_LoginPage login = PO_LoginPage.goTo();
		
		login.loginWith(WorkspaceUsers.TESTAPUK_USER)
			.withPass(WorspacePasswords.TESTAPUK_PASS)
			.login();
	}
	
	@AfterTest
	public void tearDown(){
		Browser.quit();
	}

}
