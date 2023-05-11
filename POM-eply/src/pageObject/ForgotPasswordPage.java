package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ForgotPasswordPage extends BasePage{
	
	@FindBy(css = "#body_Username")
	WebElement username;
	@FindBy(css = "#body_SubmitButton")
	WebElement submit;
	@FindBy(css = "#body_Message")
	WebElement message;
	
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	//actions
	public void insertUsername(String user) {
		fillText(username, user);
		click(submit);
	}
	
	//validations
	public String getForgotPasswordMsg() {
		return message.getText();
	}	
	
}
