package JavaSessions;

public class MethodOverloadingConcept {

	public void start() {

	}

	public void start(int a) {
		System.out.println(a);
	}

	public void start(String a, int b) {

	}

	public static void main(String[] args) {
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.start(10);
		
	}

}
