package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage{
	
	@FindBy(css = "#task")
	WebElement taskField;
	@FindBy(css = "#newtask_submit")
	WebElement addTaskBtn;
	@FindBy(css = "#newtask_adv > span")
	WebElement advTaskBtn;
	@FindBy(css = "#search")
	WebElement searchField;
	@FindBy(css = "#lists > div.tabs-n-button > div > div > span")
	WebElement addListBtn;
	@FindBy(css = "#total")
	WebElement tasksTotal;
	
	
	WebDriver driver;
	public TasksPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	//actions
	public void addSimpleTask(String taskTitle){
		fillText(taskField, taskTitle);
		click(addTaskBtn);
		sleep(1000);
	}
	
	public void openAdvTask() {
		click(advTaskBtn);
	}
	
	public void search(String searchText) {
		fillText(searchField, searchText);
		sleep(1000);
	}
	
	public void addList(String name) {
		click(addListBtn);
		alertOk(name);	
		sleep(1000);
	}
	
	public void chooseList(String name) {
		click(driver.findElement(By.cssSelector("[title='" + name + "']>span")));
		sleep(1000);
	}
	
	
	//validations
	public int getNumOfTasks() {
		String s = getText(tasksTotal);
		int num = Integer.parseInt(s);
		return num;
	}
}
