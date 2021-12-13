package OOP_Inheritance;

public class Car extends Vehicle{

	
	//final class -- can not be a parent
	//final method - can not be ovverriden
	
	public final void logo() {
		
	}
	
	@Override
	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void drive() {
		System.out.println("Car --drive");
	}
	

}
