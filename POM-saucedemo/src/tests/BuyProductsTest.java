package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.CheckOutPage;
import pageObject.CompleteCheckoutPage;
import pageObject.ItemPage;
import pageObject.LoginPage;
import pageObject.OverviewCheckoutPage;
import pageObject.ProductsPage;
import pageObject.YourCartPage;

public class BuyProductsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		//login page
		LoginPage lp = new LoginPage(driver);
		lp.login("standard_user", "secret_sauce");

		//products page
		ProductsPage pp = new ProductsPage(driver);
		pp.chooseProduct("Sauce Labs Backpack");


		//item page (product page)
		ItemPage ip = new ItemPage(driver);
		ip.addToCart();
		ip.back();

		//products page
		pp.chooseProduct("Sauce Labs Bike Light");

		//item page
		ip.addToCart();
		ip.back();

		//products page
		pp.openCart();

		//cart page
		YourCartPage ycp = new YourCartPage(driver);
		ycp.checkOut();
		
		//checkout page
		CheckOutPage cop = new CheckOutPage(driver);
		cop.fillCheckOutInfo("Yarin", "Raz", "845679");
		
		//overview checkout page
		OverviewCheckoutPage ocop = new OverviewCheckoutPage(driver);
		ocop.finishCheckout();
		
		//complete checkout page
		CompleteCheckoutPage ccop = new CompleteCheckoutPage(driver);
		ccop.completeCheckout();

	}
}
