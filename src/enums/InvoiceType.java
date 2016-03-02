package enums;

public enum InvoiceType {
	INVOICE("Invoice"),
	CREDIT_MEMO("Credit Memo");

	private String value;

	private InvoiceType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
