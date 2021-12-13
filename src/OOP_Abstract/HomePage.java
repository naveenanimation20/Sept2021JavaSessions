package OOP_Abstract;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("Hp -- title");
	}

	@Override
	public void url() {
		System.out.println("Hp -- url");
	}
	
	@Override
	public void header() {
		System.out.println("HP --  header");
	}
	
	public void logout() {
		System.out.println("user is logged out");
	}

}
