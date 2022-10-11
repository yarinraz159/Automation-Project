package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteCheckoutPage extends BasePage{
	
	@FindBy(css = "#back-to-products")
	WebElement completeBtn;
	
	public CompleteCheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public void completeCheckout() {
		click(completeBtn);
	}
}
