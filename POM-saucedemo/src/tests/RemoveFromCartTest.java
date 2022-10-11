package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.LoginPage;
import pageObject.ProductsPage;
import pageObject.YourCartPage;

public class RemoveFromCartTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");
		
		//products page
		ProductsPage pp = new ProductsPage(driver);
		pp.addToCartFast("Sauce Labs Bike Light");
		pp.chooseProduct("Sauce Labs Backpack");
		pp.openCart();
		
		//cart page
		YourCartPage ycp = new YourCartPage(driver);
		ycp.removeFromCart("Sauce Labs Backpack");

	}

}
