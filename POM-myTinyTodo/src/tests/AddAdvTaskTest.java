package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.AdvTaskPage;
import pageObject.TasksPage;

public class AddAdvTaskTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mytinytodo.net/demo/");

		TasksPage tp = new TasksPage(driver);
		tp.addSimpleTask("My first task");
		tp.openAdvTask();

		AdvTaskPage atp = new AdvTaskPage(driver);
		atp.fillForm("1", "12/17/2021", "Adv task #1", "note#1", "first adv task");
		
		tp.openAdvTask();
		atp.fillForm("2", "15/17/2021", "Adv task #2", "note#2", "yarin");
	}
}
