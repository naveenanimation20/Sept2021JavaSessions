package JavaSessions;

public class Ecomm {

	// method overloading:
	// within the same class, when you have number of methods:
	// 1. with the same name
	// 2. different parameters
	// 3. different types of parameters
	// 4. sequence of the params should be different

	public void login() {// 0
		System.out.println("default login");
	}

	public int login(String un, String pwd) {// 2
		System.out.println("login with: " + un + ":" + pwd);
		return 100;
	}

	public void login(String un, int otp) {// 2
		System.out.println("login with: " + un + ":" + otp);
	}

	public void login(int otp, String un) {// 2
		System.out.println("login with: " + un + ":" + otp);
	}

	public void login(String un, String pwd, String otp) {// 3
		System.out.println("login with: " + un + ":" + pwd + ":" + otp);
	}

	public void login(long ph, int otp) {
		System.out.println(ph + ":" + otp);
	}

	public void login(int otp, long ph) {
		System.out.println(ph + ":" + otp);
	}

	public void login(int otp, String username, double num) {
		System.out.println(username + ":" + otp);
	}

	/// feature name: search
	// filters:
	// 1. name
	// 2. name, price
	// 3. seller, name, price
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	public void search(String name, int price, String seller) {

	}

	// payment
	public void doPayment(String cc, int otp) {

	}

	public void doPayment(String debit, int otp, String pwd) {

	}

	public void doPayment(long ph, int otp) {

	}

	public void doPayment(long ph, int otp, String upi) {

	}

	// Uber:
	// booking
	public void booking(String st, String end) {
		System.out.println(st);
		System.out.println(end);
		System.out.println("end booking");
	}

	public void booking(String st, String end, String carType) {

	}

	public void booking(String st, String end, String carType, String couponCode) {

	}
	
	

	public static void main(String[] args) {

		Ecomm e1 = new Ecomm();
		e1.login("admin", "admin");
		
		e1.booking("koramnagla", "whitefield");

	}

}
