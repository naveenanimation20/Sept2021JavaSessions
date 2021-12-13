package ExceptionHandling;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj = new TryCatchBlock();
		obj.name = "Tom";
		//obj = null;
		
		try {
			System.out.println(obj.name);//NPE
			int i = 9/0;
			System.out.println("hiii");
			System.out.println("hiii");
			System.out.println("hiii");

		}
//		catch(Error e) {
//			System.out.println("some exception is coming....");
//			e.printStackTrace();
//		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception is coming....");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

		
	}

}
