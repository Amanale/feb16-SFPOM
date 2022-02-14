package salesForce.pages.RandomScenariosPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class CalendarPage extends BasePage{

	public CalendarPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[normalize-space()='8:00 PM']") WebElement time;
@FindBy(xpath="//a[normalize-space()='4:00 PM']") WebElement time1;
public void get8pmtime() {
	clickElement(time);
	report.logTestInfo("8:00 PM clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
public void get4pmtime() {
	clickElement(time1);
	report.logTestInfo("4:00 PM clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
}
