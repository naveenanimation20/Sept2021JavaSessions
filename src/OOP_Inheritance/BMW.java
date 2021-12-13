package OOP_Inheritance;

public class BMW extends Car{
	
	//Method Overloading: only within the same class
	//Poly (Many)+Morphism (forms) --> (Static )Compile Time PolyMorphism

	//overrridden method
	//Method Overriding: Poly (Many)+Morphism (forms) --> (Dynamic) RunTime PolyMorphism
	
	//when you have a method in the parent class and the same method you have in the
	//child class with:
	//the same name
	//same number of parameters
	//with the same signature
	//private methods can not be overridden
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
//	public static void drive() {
//		System.out.println("BMW --drive");
//	}
	
}
