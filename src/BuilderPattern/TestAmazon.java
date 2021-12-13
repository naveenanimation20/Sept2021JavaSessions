package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {

		EcommApp user = new EcommApp();
		
		//UC1
		user.login("kaur@gmail.com", "kaur123")
					.search("Nike Tshirt")
							.addToCart("Nike Tshirt")
								.doPayment("6565b 64646 76767 8777", 989)
									.generateOrderId()
										.logout();
		
		//UC2:
		user.login("kaur@gmail.com", "kaur123")
				.addToCart("MacBook Pro")
					.doPayment("test@okicici")
						.generateOrderId()
							.logout();
		
		//UC3:
		user.login()
			.addToCart("Puma Shoes")
				.logout();
		
		//UC4:
		user.login("naveen@gmail.com", "naveen123")
				.search("GYM Equp", 4)
					.logout();
		
		//UC5:
		user.login("Dhara@gmail.com", "dhara345")
			.logout();
		
	}

}
