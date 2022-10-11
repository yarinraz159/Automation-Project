package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	@FindBy(css = "#user-name")
	WebElement userField;
	@FindBy(css = "#password")
	WebElement passwordField;
	@FindBy(css = "#login-button")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void login(String username, String password) {
		fillText(userField, username);
		fillText(passwordField, password);
		click(loginBtn);
	}
}
