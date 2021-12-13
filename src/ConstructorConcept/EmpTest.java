package ConstructorConcept;

public class EmpTest {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Poornima";
		e1.age = 25;
		e1.id = 100;
		e1.isPerm = true;
		e1.gender = 'f';
		
		Employee e2 = new Employee(10);
		
		Employee e3 = new Employee("Tom", 201);
		System.out.println(e3.name + " " + e3.id + " " + e3.age  + " " + e3.isPerm + " " + e3.gender);
		
		Employee e4 = new Employee("Peter", 202, 30, 13.44, true, 'm');
		System.out.println(e4.isPerm);
		
		
		//
		Users u1 = new Users("Naveen", "Bangalore");
		Users u2 = new Users("Tom", 100, "NY");
		Users u3 = new Users("Rahul", 102, true, "Pune");
		//Users u4 = new Users();
		
		//
//		MySystem sys = new MySystem();
//		
//		System s = new System();
		
	}

}
