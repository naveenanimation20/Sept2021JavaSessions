package OOP_Encapsulation;

public class LoginPage {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void login(String username, String password) {
		System.out.println("login with: " + username + ":" + password);
	}
	
	
	
	

}
