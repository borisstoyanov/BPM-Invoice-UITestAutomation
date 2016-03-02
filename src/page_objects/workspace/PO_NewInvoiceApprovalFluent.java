package page_objects.workspace;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import browser.Browser;

public class PO_NewInvoiceApprovalFluent {

	private void clear(String id) {
		Browser.instance.findElement(By.id(id)).clear();
		
	}
	
	private void sendKeys(String id, String keysToSend){
		Browser.instance.findElement(By.id(id)).sendKeys(keysToSend);
		Browser.instance.findElement(By.id(id)).sendKeys(Keys.RETURN);

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
		clear("compCodeId::content");
		sendKeys("compCodeId::content", keysToSend);
		elemetHasText("//tr[@id='compNameInp']//span");
		return this;

	}



	public PO_NewInvoiceApprovalFluent addVendorNumber(String keysToSend) {
		clear("vendNumSubmitIT::content");
		sendKeys("vendNumSubmitIT::content", keysToSend);
		elemetHasText("//span[@id='vendNmIC']");
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
