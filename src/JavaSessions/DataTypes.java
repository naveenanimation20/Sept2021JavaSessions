package JavaSessions;


public class DataTypes {

	//this is my first java code
	public static void main(String[] args) {
		
		//Data Types:
		//strict type
		
		//1. primitive Data Types: Dont need any object
				//1. Boolean type: boolean (true/false)
				//2. Numeric Type:
					//1. character type: char
					//2. Integral Type: 
							//1. Integer: byte, short, int, long
							//2. Floating-point: float, double
			
		//2. Non primitive Data types: need to create the Object -- OOP
		//String, Array, Interface, Classes	
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		 b = 20;
		 b = 30;
		byte b1 = 40;
		byte b2 = 0;
		byte b3 = 120;
		byte b4 = -50;
		
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b+b1);
		
		//2. short:
		//size: 2 bytes = 16 bits
		//range: -32768 to 32767
		short s1 = 1234;
		System.out.println(s1);
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i = 23450;
		int i1 = -190;
		int k = 1;
		
		//4. long:
		//size: 8 bytes = 64 bits
		//range: -9223372036854775808 to 9223372036854775807
		long pop = 10000020208L;
		long g = 989887654390L;
		System.out.println(g);
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: after . (upto 7 decimal digits)
		float f1 = 12.33f;
		float f2 = (float)34.55;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1+f2);
		
		float f3 = 100;
		System.out.println(f3);
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: after . (upto 16 decimal digits)
		double d = 12.33;
		double d1 = 34.5555;
		double d3 = 1.1;
		
		//7. char:
		//size: 2 bytes = 16 bits
		//single digit value
		char c1 = 'e'; //a-z A-Z
		char c2 = '1'; //0-9
		char c3 = '$'; 
		//chinese, unicode
		System.out.println(c1);
		
		//8. boolean: true/false
		//size: ~1 bit
		boolean flag = true;
		boolean flag1 = false;
		System.out.println(flag);
		
		byte t = 065;//octal number
		System.out.println(t);
		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
		byte t1 = 077;
		System.out.println(t1);
		
		//byte t2 = 0222;
		
		
		//00 01 02 03
		//10 11 12 13
		//20 21 22 23
		//30 31 32 33
		
		for(int m=0; m<=9; m++) {
			for(int n=0; n<=9; n++) {
				System.out.print(m+""+n+" ");
			}
			System.out.println();
		}
		
		

	}

}
