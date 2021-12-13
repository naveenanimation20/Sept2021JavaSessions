package JavaSessions;

public class MainMethodOverloading {

	public static void main(String[] a) {
		System.out.println("Main 1" + a[0]);
	}

	public static void main(int a) {

		System.out.println("Main 2" + a);

	}
	
	public static void main(String a) {

		System.out.println("Main 4" + a);

	}

	public static void main(int a, int b) {

		System.out.println("Main 3" + a + b);

	}

}
