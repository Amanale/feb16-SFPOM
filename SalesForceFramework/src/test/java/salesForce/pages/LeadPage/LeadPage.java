package salesForce.pages.LeadPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.salesForce.Base.BasePage;

public class LeadPage extends BasePage {

	public LeadPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[contains(text(),'Leads')]") WebElement leadstab;
@FindBy(xpath="//option[@value='00B8c000009pgLZ']") WebElement allOpenLeads;
@FindBy (xpath="//option[@value='00B8c000009pgO0']") WebElement myUnreadLeads;
@FindBy (xpath="//option[@value='00B8c000009pgOl']") WebElement recentlyViewedLeads;
@FindBy (xpath="//option[@value='00B8c000009pgOE']") WebElement todaysLeads;
@FindBy (id="fcf") WebElement viewdropdown ;
@FindBy(xpath="//input[@title='Go!']") WebElement gobtn;
@FindBy(name="new") WebElement newbtn;

public void openleadstab() {
	clickElement(leadstab);
	report.logTestInfo(getTitleofThePage());
	popupWindowHandeling();
}
public void viewdropdown() {
	clickElement(viewdropdown);
	report.logTestInfo("view drop down clicked");
	String[] elements= {"All Open Leads", "My Unread Leads", "Recently Viewed Leads", "Today's Leads"};
	String[] elementsfound= {allOpenLeads.getText(),myUnreadLeads.getText(), recentlyViewedLeads.getText(), todaysLeads.getText()} ;

	for (String dropdown: elementsfound) {
		boolean match= false;
		for(int i=0; i<elements.length;i++) {
			if (dropdown.equalsIgnoreCase(elements[i])) {
				match=true;
			}
		}
		Assert.assertTrue(match);
	}
		report.logTestInfo("view drop down menu elements are displayed!");
}
public void selecttodayslead() {
	clickElement(viewdropdown);
	clickElement(todaysLeads);
	report.logTestInfo("today's lead selected");
}
public void getattribute() {
	mouseOver(gobtn);
	clickElement(gobtn);
	report.logTestInfo("the default view is today's lead");
	report.logTestInfo("go button clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
public void getnewlead() {
	clickElement(newbtn);
	report.logTestInfo("new button clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
}
