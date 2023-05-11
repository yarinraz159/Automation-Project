package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.ForgotPasswordPage;
import pageObject.LoginPage;

public class ForgotPasswordTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://events.eply.com/login/index.aspx");
		
		//login page
		LoginPage lp = new LoginPage(driver);
		lp.forgotPassword();
		
		//forgot password page
		ForgotPasswordPage fpp = new ForgotPasswordPage(driver);
		fpp.insertUsername("yarinraz");
		fpp.sleep(1000);
		String message = fpp.getForgotPasswordMsg();
		if (message.toLowerCase().contains("instructions on how to reset your password")) {
			System.out.println("Done");
		}
		else {
			System.out.println("Test failed");
		}
	}

}
