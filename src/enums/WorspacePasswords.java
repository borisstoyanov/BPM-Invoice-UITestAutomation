package enums;

public enum WorspacePasswords {
	ADMINISTRATOR_PASSWORD(""),	TESTAPUK_PASS("Welcome1"),	TESTAPAT("Welcome1"),
DIMITROV("Tainaparola1");

	private String password;

	private WorspacePasswords(String passwords) {
		this.password = passwords;
	}

	public String getPassword() {
		return this.password;
	}
	
}
