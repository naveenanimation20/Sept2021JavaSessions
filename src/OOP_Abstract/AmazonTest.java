package OOP_Abstract;

public class AmazonTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.header();
		lp.doLogin("admin", "admin");
		
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.logout();
		
		//top casting:
		//child class object can be referred by parent abs.. class ref variable
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		
		//down casting: CT Not allowed
		//LoginPage l1 = new Page();
		
	}

}
