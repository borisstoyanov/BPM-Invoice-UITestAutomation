package enums;

public enum WorkspaceUsers {
	ADMINISTRATOR(""),
	TESTAPUK_USER("testapuk"),
	DIMITROV("dimitrov");

	private String username;

	private WorkspaceUsers(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}
}
