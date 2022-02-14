package salesForce.pages.RandomScenariosPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.salesForce.Base.BasePage;

public class NewEventPage extends BasePage {

	public NewEventPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//img[@title='Subject Combo (New Window)']") WebElement subjectcombo;
@FindBy(xpath=" //body") WebElement window;
@FindBy(css= "a[href=javascript:pickValue(4);']") WebElement other;
@FindBy(id="EndDateTime_time") WebElement endtime;
@FindBy(id="IsRecurrence") WebElement recurrence;
@FindBy(id="rectypeftw") WebElement weekly;
@FindBy(id="RecurrenceEndDateOnly") WebElement recurrenceEndDate;
@FindBy(name="save") WebElement savebtn;

public void subjectcombolink() {
	clickElement(subjectcombo);
	report.logTestInfo("subject combo link clicked");
	switchToNewWindow(window);
	clickElement(other);
	report.logTestInfo("other clicked");
	clickElement(endtime);
	Select select= new Select(endtime);
    select.selectByVisibleText("9:00 PM");
    report.logTestInfo("9:00 PM selected");
    clickElement(savebtn);
    report.logTestInfo("save button clicked");
}
public void eventwithrecurrence() {
	clickElement(endtime);
     Select select= new Select(endtime);
     select.selectByVisibleText("7:00 PM");
     report.logTestInfo("7:00PM selected");
     clickElement(recurrence);
     clickElement(weekly);
     clickElement(recurrenceEndDate);
     enterText(recurrenceEndDate, "");
     clickElement(savebtn);
     report.logTestInfo("save button clicked");
}
}
