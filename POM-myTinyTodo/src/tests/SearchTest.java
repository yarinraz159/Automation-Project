package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.TasksPage;

public class SearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mytinytodo.net/demo/");
		
		TasksPage tp = new TasksPage(driver);
		tp.addSimpleTask("task1");
		tp.addSimpleTask("task125");
		tp.addSimpleTask("yarinTask");
		tp.search("yarin");
		int i = tp.getNumOfTasks();
		if (i == 1) {
			System.out.println("Done");
		}
	}

}
