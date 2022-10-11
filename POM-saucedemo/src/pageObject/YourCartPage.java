package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage{
	
	@FindBy(css = "#checkout")
	WebElement checkoutBtn;
	@FindBy(css = "#continue-shopping")
	WebElement backBtn;
	
	WebDriver driver;
	public YourCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void checkOut() {
		click(checkoutBtn);
	}

	public void back() {
		click(backBtn);
	}

	public void removeFromCart(String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item_name"));
		for (WebElement el : list) {
			if (getText(el).equalsIgnoreCase(name)) {
				click(el);
				click(driver.findElement(By.cssSelector(".btn_small.btn_inventory")));
				click(driver.findElement(By.cssSelector(".shopping_cart_link")));
				break;
			}
		}
	}
}
