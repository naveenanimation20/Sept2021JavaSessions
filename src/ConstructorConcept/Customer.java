package ConstructorConcept;

public class Customer {
	
	private String name;
	private int age;
	private String comp;
	
	public Customer() {
		System.out.println("Defaculy const...");
	}
	
	public Customer(String name, int age, String comp) {
		this.name = name;
		this.age = age;
		this.comp = comp;
	}

	//getter and setter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}
	
	//features/methods:
	public String getCustomerInfo() {
		return name + " " + age + " "+ comp;
	}
	
	
	

}
