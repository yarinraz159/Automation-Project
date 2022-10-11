package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdvTaskPage extends BasePage{
	
	@FindBy(css = "[name='prio']")
	WebElement priorityField;
	@FindBy(css = "#duedate")
	WebElement dateField;
	@FindBy(css = "[name='task'].in500")
	WebElement taskTitleField;
	@FindBy(css = "[name='note']")
	WebElement noteField;
	@FindBy(css = "#edittags")
	WebElement tagsField;
	@FindBy(css = "[value='Save']")
	WebElement saveBtn;
	
	public AdvTaskPage(WebDriver driver) {
		super(driver);	
	}
	
	public void fillForm(String priority, String date, String taskTitle, String note, String tags) {
		Select s = new Select(priorityField);
		s.selectByValue(priority);
		
		fillText(dateField, date);
		fillText(taskTitleField, taskTitle);
		fillText(noteField, note);
		fillText(tagsField, tags);
		click(saveBtn);
		sleep(1000);
	}
	
}
