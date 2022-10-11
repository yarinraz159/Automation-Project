package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewCheckoutPage extends BasePage{
	
	@FindBy(css = "#finish")
	WebElement finishBtn;
	@FindBy(css = "#cancel")
	WebElement cancelBtn;

	public OverviewCheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	public void finishCheckout() {
		click(finishBtn);
	}
	
	public void cancelCheckout() {
		click(cancelBtn);
	}
}
