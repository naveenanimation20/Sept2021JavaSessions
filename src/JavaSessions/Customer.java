package JavaSessions;

import java.util.ArrayList;

public class Customer {

	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("searching the product: " + categoryName);
		ArrayList<String> prodList = new ArrayList<String>();

		switch (categoryName) {
		case "Apple":
			prodList.add("iph12");
			prodList.add("macbook pro");
			prodList.add("ipad mini");
			break;

		case "Samsung":
			prodList.add("s8");
			prodList.add("samsung tablet");
			break;

		case "HP":
			prodList.add("headphone");
			prodList.add("HP laptop");
			break;

		default:
			System.out.println("product cateogy not found...." + categoryName);
			break;
		}
		
		return prodList;
	}
	
	
	//WAF - launch the browser (cross browser logic)
	//input param: browserName (String)
	//return: void
	
	public void lauchBrowser(String browserName, int version) {
		
		System.out.println("the browser name is:" + browserName);
		
		if(browserName.equals("chrome")) {
			System.out.println("launch chrome");
		}
		
		else if(browserName.equals("firefox")) {
			System.out.println("launch ff");
		}
		
		else if(browserName.equals("safari")) {
			System.out.println("launch safari");
		}
		
		else {
			System.out.println("please pass the right browser: " + browserName);
		}
		
		
	}
	
	//WAF : register a user: 
	//params: fn, ln, email, ph, password, age, dob, city, address, country
	//we will pass the class object
	public void register(String fn, String ln, String ph, String pwd, int age) {
		
	}
	
	
	

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.lauchBrowser("chrome", 90);	
		
		
		
		
		ArrayList<String> appleList = c1.doSearch("Apple");
		System.out.println(appleList.size());
		System.out.println(appleList);
		
		ArrayList<String> samsungList = c1.doSearch("Samsung");
		System.out.println(samsungList.size());
		System.out.println(samsungList);
		for(String e : samsungList) {
			System.out.println(e);
		}
		
		ArrayList<String> nokiaList = c1.doSearch("Nokia");
		System.out.println(nokiaList.size());
		System.out.println(nokiaList);
		
		
	}

}
