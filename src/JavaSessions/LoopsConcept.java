package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//1 to 10:
		
		//1. while loop:
		
		int i = 1;//start
		while(i<=10) {//conditinoal
			System.out.println(i);//1 2 3 .......9 10
			//i++;
			//++i;
			i=i+1;//incremental/decreemntal
		}
		
		int k=1;
		while(true) {
			System.out.println(k);//12
			k++;
			if(k==20) {
				break;
			}
		}
		
		//infinite loop:
//		while(true) {
//			System.out.println("welcome to Hotel Taz ....");
//		}
		
		//facebook/linkedin app/swiggy -- lazy page loading
		//use cases: wwe have to use while loop when we are not sure about number of cycles/iterations
		//pagination
		//Carousel
		//calendar
		
		System.out.println("----------");
		
		//2. for loop:
		//use cases:
		//we have to use for loop when we are sure number of cycles/iterations
		//menu items -- 10 --> 20 --> 30
		//total number of links/images on the page
		//drop down values
		//webtable -- rows/cols
		
		
		//typical for loop: (index based for loop)
		//1 to 10:
//		for(int p=1; p<=10; p++) {
//			System.out.println(p);//12345..10
//		}
//		int p=1;
//		for( ;p<=10; p++) {
//			System.out.println(p);//12345..10
//		}
		
		int p=1;
		for( ;p<=10; ) {
			System.out.println(p);//12345..10
			//p++;
			//++p;
			p=p+1;
		}
		
//		for(int g=1;g<=10; ) {
//			System.out.println(g);
//		}
		
//		for(;;) {
//			System.out.println("welcome to hotel taj");
//		}
			
		System.out.println("-----");
		//even numbers upto 10:
		//2 4 6 8 10
		for(int even=2; even<=10; even=even+2) {
			System.out.println(even);//2 4 6 8 10
		}
			
		//odd: 1 3 5 7 9
		//
		
		System.out.println("-----");

		for(double d=1.0; d<=10.0; d++) {
			System.out.println(d);
		}
			
		System.out.println("-----");
		//A-Z
		for(char c='A'; c<='Z'; c++) {
			System.out.println(c);
		}
		
		System.out.println("-----");

		for(int as=97; as<=122; as++) {
			System.out.println((char)as);
		}
		
		System.out.println("-----");

		System.out.println(10%2);
		System.out.println(10%3);

		System.out.println("-----");

		for(int t=1; t<=100; t++) {
			System.out.println(t);
			if(t%5==0) {
				System.out.println("hi");
			}
		}
		
		//even//odd numbers with %
		//11 (11%2==1)
		//10 (10%2==0)
		
		System.out.println("-----");
		//do-while loop:
		//wait custom wait
		//element is displayed
		
		int r=1;
		do {
			r++;
			System.out.println(r);
			break;

		} 
		while (r<=10);
		
		
		
		//for each
		//recursion
		//streams
		
		
		
		
		
		
		

			
	}

}
