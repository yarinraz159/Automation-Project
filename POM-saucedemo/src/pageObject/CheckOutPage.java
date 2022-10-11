package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
	
	@FindBy(css = "#first-name")
	WebElement firstNameField;
	@FindBy(css = "#last-name")
	WebElement lastNameField;
	@FindBy(css = "#postal-code")
	WebElement zipCodeField;
	@FindBy(css = "#continue")
	WebElement continueBtn;
	@FindBy(css = "#cancel")
	WebElement cancelBtn;
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	public void fillCheckOutInfo(String firstName, String lastName, String zipCode) {
		fillText(firstNameField, firstName);
		fillText(lastNameField, lastName);
		fillText(zipCodeField, zipCode);
		click(continueBtn);
	}

	public void cancelCheckout() {
		click(cancelBtn);
	}


}
