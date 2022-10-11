package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.CheckOutPage;
import pageObject.CompleteCheckoutPage;
import pageObject.LoginPage;
import pageObject.OverviewCheckoutPage;
import pageObject.ProductsPage;
import pageObject.YourCartPage;

public class BuyProductsTest2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		//login page
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");

		//products page
		//adding to cart from the products page
		ProductsPage pp = new ProductsPage(driver);
		pp.addToCartFast("Sauce Labs Bolt T-Shirt");
		pp.addToCartFast("Test.allTheThings() T-Shirt (Red)");
		Thread.sleep(2000);
		pp.openCart();
		
		//cart page
		YourCartPage ycp = new YourCartPage(driver);
		ycp.checkOut();
		
		//checkout
		CheckOutPage cop = new CheckOutPage(driver);
		cop.fillCheckOutInfo("yarin", "raz", "125487");
		
		//overview
		OverviewCheckoutPage ocop = new OverviewCheckoutPage(driver);
		ocop.finishCheckout();
		
		//completed
		CompleteCheckoutPage ccop = new CompleteCheckoutPage(driver);
		ccop.completeCheckout();
		
		
		
		
	}

}
