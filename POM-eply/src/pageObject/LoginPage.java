package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(css = "#body_ForgotPasswordButton")
	WebElement forgotPasswordLink;

	public LoginPage(WebDriver driver) {
		super(driver);
		forgotPasswordLink = driver.findElement(By.cssSelector("#body_ForgotPasswordButton"));
	}
	
	//actions
	public void forgotPassword() {
		click(forgotPasswordLink);
	}

}
//gal2@informup.com
//a1234567