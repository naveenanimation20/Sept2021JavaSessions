package JavaSessions;

public class TestBlock {
	
	static {
		System.out.println("static block");
	}
	
	public static void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {

		System.out.println("this is main");
		test();
		
	}

}
