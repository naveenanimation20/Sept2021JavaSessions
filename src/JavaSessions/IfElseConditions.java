package JavaSessions;

public class IfElseConditions {

	public static void main(String[] args) {

		int a = 20;
		int b = 20;

		if (a > b) {
			System.out.println("a is gr than b");
		} else {
			System.out.println("b is gr than or eq to a");
		}

		if (a == b) {
			System.out.println("both are equal");
		}

		// dead code:
		if (true) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}

		boolean t = false;
		if (t) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		int number = 101;

		if (number <= 100) {
			if (number >= 90) {
				System.out.println("GRADE A");
			}
			if (number >= 75) {
				System.out.println("GRADE B");
			}
		} else {
			System.out.println("invalid number");
		}

//		String browser = "firefox";
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		if(browser.equals("IE")) {
//			System.out.println("launch IE");
//		}
//		else {
//			System.out.println("plz pass the right browser....");
//		}

		String browser = "firefox";

		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		} 
		else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} 
		else if (browser.equals("safari")) {
			System.out.println("launch safari");
		} 
		else if (browser.equals("IE")) {
			System.out.println("launch IE");
		} 
		else {
			System.out.println("plz pass the right browser....");
		}

	}

}
