package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.TasksPage;

public class AddListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mytinytodo.net/demo/");

		TasksPage tp = new TasksPage(driver);
		tp.addList("yarinList");
		tp.chooseList("yarinList");
		tp.addSimpleTask("task 1");
		tp.addSimpleTask("task 2");
		int num = tp.getNumOfTasks();
		if (num == 2) {
			System.out.println("DONE");
		}

	}

}
