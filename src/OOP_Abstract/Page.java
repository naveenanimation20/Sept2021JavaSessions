package OOP_Abstract;

//abstract class object can not be created
//but abs... const... can be created
//it will be called when we create the object of child class
public abstract class Page {

	public Page() {
		System.out.println("PAGE -- default const...");
	}

	public Page(int t) {
		System.out.println("PAGE -- one param const... " + t);
	}

	public abstract void title();

	public abstract void url();

	public void header() {
		System.out.println("Page header");
	}

	public final void logo() {
		System.out.println("Page -- logo");
	}

}
