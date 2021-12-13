package JavaSessions;

public class ObjectReferenceConcept {
	
	//class data members:
	
	//class vars
	String name;
	int age;
	
	//methods
	public void get() {
		System.out.println("get method");
	}
	

	public static void main(String[] args) {

		ObjectReferenceConcept obj = new ObjectReferenceConcept();
		
//		obj = null;//null ref object
//		
//		obj.name = "Tom";//NPE
//		obj.age = 25;
//		
//		System.out.println(obj.name);
		
		//no reference objects
		new ObjectReferenceConcept().name = "Peter";
		new ObjectReferenceConcept().age = 25;
		new ObjectReferenceConcept().get();

		ObjectReferenceConcept obj1 = new ObjectReferenceConcept();
		
		System.gc();

	}

}
