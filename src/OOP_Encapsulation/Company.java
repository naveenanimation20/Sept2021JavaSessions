package OOP_Encapsulation;

public class Company {
	
	public String name;
	private int sharePrice;
	public String hq;
	
	
	//setter:
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	
	
	//getter
	public int getSharePrice() {
		return sharePrice;
	}
	

	public static void main(String[] args) {

		Company obj = new Company();
		obj.name = "IBM";
		obj.sharePrice = 100;
		
		
	}

}
