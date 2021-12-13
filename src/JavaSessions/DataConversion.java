package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {

		//Wrapper classes: Integer, Double
		String x = "100";
		System.out.println(x+20);
		
		//string to int:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
//		String y = "100A";
//		int j = Integer.parseInt(y);//NumberFormatException: For input string: "100A"
//		System.out.println(j);
		
		//String to double:
		String p = "12.33";
		System.out.println(p+20);
		
		double d = Double.parseDouble(p);//12.33
		System.out.println(d+20);
		//int to String:
		int total = 100;
		String t = String.valueOf(total);//"100"
		System.out.println(t+20);
		
		String g = "true";
		if(Boolean.parseBoolean(g)) {
			System.out.println("PASS");
		}
		
		if(g.equals("true")) {
			
		}
		
	}

}
