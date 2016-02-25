package page_objects.workspace;

import org.openqa.selenium.By;

import browser.Browser;
import enums.WorkspaceUsers;
import enums.WorspacePasswords;

public class PO_LoginPageFluent {
	
	private String username;
	private String password;

	public PO_LoginPageFluent(WorkspaceUsers user){
		this.username = user.getUsername();
				
				
	}
	
	public PO_LoginPageFluent withPass(WorspacePasswords regularUserPassword) {
		this.password = regularUserPassword.getPassword();
		return this;
	}
	
	public PO_MyTasks login() {
		Browser.instance.findElement(By.id("j_username::content")).sendKeys(this.username);
		Browser.instance.findElement(By.id("j_password::content")).sendKeys(this.password);
		Browser.instance.findElement(By.id("loginButton")).click();
		return new PO_MyTasks();
	}

}
