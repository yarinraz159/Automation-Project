package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage{
	
	@FindBy(css = ".btn_inventory")
	private WebElement addCartBtn;
	@FindBy(css = "#back-to-products")
	private WebElement backBtn;
	@FindBy(css = ".shopping_cart_link")
	private WebElement openCartBtn;
	

	public ItemPage(WebDriver driver) {
		super(driver);	
	}

	public void addToCart() { 
		click(addCartBtn);
	}

	public void back() {
		click(backBtn);
	}

	public void openCart() {
		click(openCartBtn);
	}
}
