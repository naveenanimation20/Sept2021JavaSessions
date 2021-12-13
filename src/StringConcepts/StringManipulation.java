package StringConcepts;


public class StringManipulation {

	public static void main(String[] args) {

		String s = "This is my java code and I am so happy";
		
		System.out.println(s.length());//38
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(37));
		//System.out.println(s.charAt(38));//StringIndexOutOfBoundsException
		//System.out.println(s.charAt(-1));//StringIndexOutOfBoundsException
		
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('i'));//2 //1st occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i')+1));//2nd occurrence of i
		
		System.out.println(s.indexOf("code"));//16
		System.out.println(s.indexOf("python"));//-1
		
		String mesg = "Welcome Admin";
		if(mesg.indexOf("Admin") >0) {
			System.out.println("PASS");
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String str = "    hello world     ";
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace('-', '/'));
		
		//contains:
		String s1 = "your user id is naveenautomation";
		System.out.println(s1.contains("naveenautomation"));
		if(s1.contains("naveenautomation")) {
			System.out.println("PASS");
		}
		
		//comparison:
		String t1 = "hello java";//String literals
		String t2 = "hello java";
		//t2 = "hello python";
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);//true
		
		String t5 = new String("hello ruby");//new keyword--object ib heap - 2 objects (SCP + HEAP)
		String t6 = "hello ruby";//0
		String t7 = new String("hello ruby");//1(heap)
		
		System.out.println(t5==t7);//false
		System.out.println(t5==t6);//false
		
		
		//split:
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String langArr[] = lang.split("_");
		System.out.println(langArr[0]);
		//System.out.println(langArr[4]);
		for(String e : langArr) {
			System.out.println(e);
		}
		
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArr[] = name.split("xX");
		System.out.println(nameArr.length);
		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
		System.out.println(nameArr[3]);
		System.out.println(nameArr[4]);
		
		String empData = "Hiren;Patel;40;NY;USA;01-01-1970;selenium;QA";
		String emp[] = empData.split(";");
		for(String e : emp) {
			System.out.println(e);
		}

		String credentials = "admin;admin123";
		System.out.println(credentials.split(";")[0]);	
		System.out.println(credentials.split(";")[1]);	

		//substring:
		String message = "your order id is 12345";
		System.out.println(message.substring(8));
		System.out.println(message.substring(17));
		System.out.println(message.substring(0, 10));
		System.out.println(message.substring(message.indexOf("is")+3, message.length()));
		String orderId = message.substring(message.indexOf("is")+3, message.length());
		System.out.println(orderId);
		
		
	}

}
