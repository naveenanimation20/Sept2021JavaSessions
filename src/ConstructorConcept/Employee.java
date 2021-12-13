package ConstructorConcept;

public class Employee {
	
	String name;
	int id;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	//constructor:
	//name of the const... will be same as the class name
	//const.. can not have any return type, no void, no return
	//const... will be called when you create the object of the class
	
	//func may or may not return value but const.. will never return any value
	//func name can be anything, but const.. name will be same as the class name
	//func will have the buss logic/feature logic...but const... will be helping to create the object
	//to call the function, we need to create the object and use object ref variable.
	///but to call the const...just create the object and supply the values
	
	
	public Employee() {//0 param/default const...
		System.out.println("default const....");
		
	}
	
	public Employee(int a) {//1 param const...
		System.out.println(a);
	}
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Employee(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}	
	
	public Employee(String name, boolean isPerm) {
		this.name = name;
		this.isPerm = isPerm;
	}

	public Employee(String name, int id, int age, double salary, boolean isPerm, char gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}

	public Employee(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	
	
	
	

}
