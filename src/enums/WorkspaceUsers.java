package enums;

public enum WorkspaceUsers {
	ADMINISTRATOR(""),
	TESTAPUK_USER("testapuk"),
	TESTAPAT("testapat"),
	DIMITROV("dimitrov");

	private String username;

	private WorkspaceUsers(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}
}
