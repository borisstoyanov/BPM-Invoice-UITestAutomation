package page_objects.workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import browser.Browser;
import enums.InvoiceType;

public class PO_NewInvoiceApprovalFluent {

	private void clear(String xpath) {
		Browser.instance.findElement(By.xpath(xpath)).clear();
		
	}
	
	private void sendKeys(String xpath, String keysToSend){
		Browser.instance.findElement(By.xpath(xpath)).sendKeys(keysToSend);
		Browser.instance.findElement(By.xpath(xpath)).sendKeys(Keys.RETURN);

	}
	
	private void elemetHasText(String xpath) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String text = Browser.instance.findElement(By.xpath(xpath)).getText();
		Assert.assertFalse(text.equals(null));
	}

	public PO_NewInvoiceApprovalFluent addFile(String filePath) {
		Browser.instance.findElement(By.xpath("//label[text()='Select your invoice file']//..//..//..//input"))
				.sendKeys(filePath);
		return this;

	}

	public PO_NewInvoiceApprovalFluent addEntity(String keysToSend) {
		clear("//input[@id='compCodeId::content']");
		sendKeys("//input[@id='compCodeId::content']", keysToSend);
		elemetHasText("//tr[@id='compNameInp']//span");
		return this;

	}



	public PO_NewInvoiceApprovalFluent addVendorNumber(String keysToSend) {
		clear("//input[@id='vendNumSubmitIT::content']");
		sendKeys("//input[@id='compCodeId::content']", keysToSend);
		elemetHasText("//span[@id='vendNmIC']");
		return this;

	}

	public PO_NewInvoiceApprovalFluent selectInvoiceType(InvoiceType type) {
		new Select(Browser.instance.findElement(By.xpath("//select"))).selectByVisibleText(type.toString());		
		return this;

	}

	public PO_NewInvoiceApprovalFluent addInvoiceNumber(String keysToSend) {
		clear("//label[text()='Invoice Number']//..//..//input");
		sendKeys("//label[text()='Invoice Number']//..//..//input", keysToSend);
		
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
