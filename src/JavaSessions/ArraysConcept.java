package JavaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//two major limitations:
		//1. size is fixed (static array): to overcome this problem, use dynamic array -- ArrayList
		//2. similar type of data: to overcome this problem, use dynamic array -- ArrayList/Static Object Array
		
		//use cases:
		//static data
		//months 12 /days 31
		
		//1. int array:
		int i[] = new int[4];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		//System.out.println(i);
		
		System.out.println(i[0]+i[2]);
		
		int len = i.length;
		System.out.println("Length = " + len);
		System.out.println("Hi = " + (len-1));
		System.out.println("Li = " + 0);
		
		//print all the values from array: for loop:
		for(int k=0; k<len; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		
		for(int k=0; k<=len-1; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		System.out.println("------");
		//for each loop: enhanced for loop:
		for(int e : i) {
			System.out.println(e);
		}
		
		//double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 100;
		d[2] = 34.44;
		//d[3] = 21.33;//ArrayIndexOutOfBoundsException
		//System.out.println(d[3]);
		
		for(double e : d) {
			System.out.println(e);
		}
		
		
		System.out.println("------");

		//char array:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '$';
		c[2] = '1';
		
		for(char e : c) {
			System.out.println(e);
		}
		
		System.out.println("------");
		String lang[] = new String[4];
		lang[0] = "JAVA";
		lang[1] = "PYTHON";
		lang[2] = "JS";
		lang[3] = "RUBY";
		
		System.out.println(lang[0] + lang[1]);

		for(int p=0; p<lang.length; p++) {
			System.out.println(p+":"+lang[p]);
		}
		
		
		for(String e : lang) {
			System.out.println(e);
		}
		
		//Object Array:
		Object emp[] = new Object[4];
		emp[0] = "Tom";
		emp[1] = 25;
		emp[2] = 'm';
		emp[3] = 23.44;
		
		for(Object e : emp) {
			System.out.println(e);
		}
		

		//
		String product[] = new String[100];
		product[0] = "Macbook Pro";
		product[1] = "Macbook Air";
		
		
				
		
	}

}
