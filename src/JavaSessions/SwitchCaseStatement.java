package JavaSessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		String browser = "CHROME";

		switch (browser.toLowerCase().trim()) {// chrome --> chrome 
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("plz pass the right browser name....");
			break;
		}

		
		//
		int marks = 10;
		switch (marks) {
		case 100:
			System.out.println("GRADE A");
			break;
		case 90:
			System.out.println("GRADE B");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		
		//switch-case is not applicable for boolean expressions
//		int num = 10;
//		switch (num<=10) {
//		case 10:
//			System.out.println("FAIL");
//			break;
//
//		default:
//			break;
//		}
		
		
		double d1 = 12.33;
		double d2 = 12.34;
		
		if(d1==d2) {
			
		}
		
		//< <= >= > == !=
		boolean flag = false;
		
		if(!flag) {
			System.out.println("BYE");
		}
		else {
			System.out.println("PASS");
		}
		
		
		
	}

}
