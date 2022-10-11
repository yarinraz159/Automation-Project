package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	private WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	
	public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
	}
	
	public void click(WebElement el) {
		el.click();
	}
	
	public String getText(WebElement el) {
		return  el.getText();
	}
	
	public void sleep(long milles) {
		try {
			Thread.sleep(milles);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
