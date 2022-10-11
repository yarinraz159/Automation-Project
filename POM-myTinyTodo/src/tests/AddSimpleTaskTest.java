package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.TasksPage;

public class AddSimpleTaskTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mytinytodo.net/demo/");

		TasksPage tp = new TasksPage(driver);
		tp.addSimpleTask("My first task");
		tp.addSimpleTask("My second task");
		
		
	}		
}
