package OOP_Abstract;

public class LoginPage extends Page{

	//default const...hidden const.... by Java
	
	public LoginPage() {
		System.out.println("LP -- default const....");
	}
	
	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	@Override
	public void url() {
		System.out.println("LP -- url");		
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with: " + un + ":"+ pwd);
	}
	
	public void doLogin(String un, String pwd, long ph) {
		System.out.println("login with: " + un + ":"+ pwd + ":" + ph);
	}

}
