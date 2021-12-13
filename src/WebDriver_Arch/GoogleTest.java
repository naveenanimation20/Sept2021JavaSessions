package WebDriver_Arch;

public class GoogleTest {

	static WebDriver driver;

	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver(); //CD + WD
		// FirefoxDriver driver = new FirefoxDriver();

		// cross browser testing logic:

		String browser = "safari";

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();//WD
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("plz pass the right browser....");
		}

		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement();
		driver.findElements();

		driver.click();
		driver.sendKeys("naveen@gmail.com");
		driver.close();
	}

}
