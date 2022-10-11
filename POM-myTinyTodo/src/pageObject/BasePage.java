package pageObject;

import java.util.Set;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	String mainWindow;
	Actions action;
	WebDriverWait wait; 
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		action = new Actions(driver);
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	WebDriver getDriver() {
		return driver;
	}

	void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	//methods
	
	void fillText(WebElement el, String text) {
		highlightElement(el, "red", "yellow");
		el.clear();
		el.sendKeys(text);
	}
	
	void click(WebElement el) {
		highlightElement(el, "red", "yellow");
		el.click();
	}
	
	String getText(WebElement el) {
		highlightElement(el, "red", "yellow");
		return  el.getText();
	}
	
	//sleep / waiting
	
	void sleep(long milles) {
		try {
			Thread.sleep(milles);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Alerts
	
	void alertOk(String text) {
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	void alertOK() {
		driver.switchTo().alert().accept();
	}

	void alertCancel() {
		driver.switchTo().alert().dismiss();
	}
	
	//Mouse
	
	void dragAndDrop(WebElement src, WebElement target) {
		highlightElement(src, "red", "yellow");
		highlightElement(target, "blue","orange");
		action.moveToElement(src).clickAndHold().build().perform();
		sleep(1000);
		action.moveToElement(target).release().build().perform();

	}
	
	//Windows
	
	void moveToNewWindow() {
		mainWindow = driver.getWindowHandle();
		Set<String> list = driver.getWindowHandles();
		for (String win : list) {
			System.out.println(win);
			driver.switchTo().window(win);
		}
	}

	void moveToMainWindow() {
		driver.close();
		driver.switchTo().window(mainWindow);
	}
	
	//colors
	
	private void highlightElement(WebElement element, String color, String background) {
		String originalStyle = element.getAttribute("style");
		String newStyle = "background-color:" + background + "; border: 1px solid " + color + ";" + originalStyle;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//change the style
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + newStyle + "');},0);", element);
		
		//change the style back (after few miliseconds)
		js.executeScript("var tmpArguments = arguments;setTimeout(function () {tmpArguments[0].setAttribute('style', '" + originalStyle + "');},400);", element);
	}
}
