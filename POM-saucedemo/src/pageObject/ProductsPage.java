package pageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductsPage extends BasePage {
	
	@FindBy(css = ".inventory_item_name")
	private List<WebElement> itemslist;
	@FindBy(css = ".shopping_cart_link")
	private WebElement cartBtn;
	
	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void chooseProduct(String name) {
		for (WebElement el : itemslist) {
			if (getText(el).equalsIgnoreCase(name)) {
				click(el);
				break;
			}
		}
	}

	public void openCart() {
		click(cartBtn);
	}
	
	public void addToCartFast(String name) {
		List<WebElement> list = driver.findElements(By.cssSelector(".inventory_item"));
		for (WebElement el : list) {
			WebElement titleEl = el.findElement(By.cssSelector(".inventory_item_name"));
			if (getText(titleEl).equalsIgnoreCase(name)) {
				WebElement addBtn = el.findElement(By.cssSelector(".btn_inventory"));
				click(addBtn);
				break;
			}
		}
	}
}
