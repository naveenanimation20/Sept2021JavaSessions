package ConstructorConcept;

public class TestCustomer {

	public static void main(String[] args) {

		
		Customer c1 = new Customer("Tom", 30, "IBM");
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getComp());
		
		c1.setComp("MS");
		c1.setAge(33);
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getComp());
		
		Customer c2 = new Customer();
		c2.setName("Poornima");
		c2.setAge(35);
		c2.setComp("Google");
		
		System.out.println(c2.getComp());
	}

}
