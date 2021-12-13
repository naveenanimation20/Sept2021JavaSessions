package JavaSessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		
		
		//int AL
		ArrayList<Integer> ar = new ArrayList<Integer>();
				
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		//for each:
		for(Integer e : ar) {
			System.out.println(e);
		}
		System.out.println("------");
		for(int e : ar) {
			System.out.println(e);
		}
		
		//double AL:
		ArrayList<Double> ar1 = new ArrayList<Double>();
		ar1.add(12.33);
		ar1.add(100.00);
		
		for(double e : ar1) {
			System.out.println(e);
		}
		
		//String AL:
		ArrayList<String> prodList = new ArrayList<String>();
		prodList.add("Apple");//0
		prodList.add("Samsung");//1
		prodList.add("Nokia");//2
		
		for(String e : prodList) {
			System.out.println(e);
		}
		
		//Object data AL:
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Dhara");
		empData.add(25);
		empData.add('f');
		empData.add(34.55);
		empData.add(true);
		
		System.out.println(empData.size());
		for(Object e : empData) {
			System.out.println(e);
		}


	}

}
