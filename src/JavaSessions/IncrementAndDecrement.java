package JavaSessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		//++ 
		//-- 

		//1. post increment:
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int g = -99;
		int h = g++;
		System.out.println(g);//-98
		System.out.println(h);//-99
		
		//2. pre increment:
		int c = 1;
		int d = ++c;
		System.out.println(c);//2
		System.out.println(d);//2
		
		int m = -97;
		int n = ++m;
		System.out.println(m);//-96
		System.out.println(n);//-96
		
		//3. post decrement:
		int p = 2;
		int q = p--;
		System.out.println(p);//1
		System.out.println(q);//2
		
		//4. pre decrement:
		int u = 2;
		int y = --u;
		System.out.println(u);//1
		System.out.println(y);//1
		
		
		int t1 = 2;
		System.out.println(t1++);
		System.out.println(t1);
		
		int l = 5;
		System.out.println(++l);
		System.out.println(l);
		
		
	}

}
