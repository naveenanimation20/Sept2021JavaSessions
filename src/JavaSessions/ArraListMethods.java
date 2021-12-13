package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));

		System.out.println(numbers);

		int i[] = { 10, 20, 30, 40, 50, 60 }; // array literals
		System.out.println(i);
		System.out.println(Arrays.toString(i));

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS"));
		System.out.println(names);

		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B", "A", "C", "D", "F"));

		System.out.println(l1.equals(l3));

		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);

		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));

		if (l1.equals(l3)) {
			System.out.println("PASS");
		}

		// web page --> drop down --> 5 elements ---actlist
		// explist --> 5 elements

		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

//		l4.removeAll(l5);
//		System.out.println(l4);

		l5.removeAll(l4);
		System.out.println(l5);

		// find out the common elements:

		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "Algo"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "PHP"));

		lang1.retainAll(lang2);
		System.out.println(lang1);

		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("p", "q", "r"));

//		l6.addAll(l7);
//		System.out.println(l6);
//		System.out.println(l7);
//
////		l7.clear();
////		System.out.println(l7);
//
//		ArrayList<String> cloneList =  (ArrayList<String>) l7.clone();
//		System.out.println(cloneList);
//
//		
//		ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
////		l8.add(0, "T");
////		System.out.println(l8);
//		l8.add(10, "N");
//		System.out.println(l8);
		
		ArrayList<String> lang4 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "Algo"));
		ArrayList<String> lang5 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "Algo", "PHP"));

		System.out.println(lang4.contains("JAVA"));
		System.out.println(lang5.containsAll(lang4));
		
		if(lang5.containsAll(lang4)) {
			System.out.println("PASS");
		}
	}

}
