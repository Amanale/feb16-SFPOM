package salesForce.pages.ContactsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.salesForce.Base.BasePage;

public class ContactsPage extends BasePage{

	public ContactsPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[@title='Contacts Tab']") WebElement contactstab;
@FindBy(name="new") WebElement	newbtn;
@FindBy(xpath="//a[normalize-space()='Create New View']") WebElement newview;
@FindBy(id="hotlist_mode") WebElement dropdown;
@FindBy(xpath="//h3[normalize-space()='Recent Contacts']") WebElement recentcontact;
@FindBy(name="fcf") WebElement viewdrop;
@FindBy(linkText = "LastName") WebElement contact;

public void getcontactstab() {
clickElement(contactstab);
report.logTestInfo("Contacts tab clicked");
popupWindowHandeling();
report.logTestInfo(getTitleofThePage());
}
public void getnewcontact() {
	clickElement(newbtn);
	report.logTestInfo("new button clicked");
	report.logTestInfo(getTitleofThePage());
}
public void getnewview() {
	clickElement(newview);
	report.logTestInfo("create new view link clicked");
	report.logTestInfo(getTitleofThePage());
}
public void getrecentlycreated() {
	clickElement(dropdown);
	Select select = new Select(dropdown); 
    select.selectByVisibleText("Recently Created");
    report.logTestInfo("recently created selected");
    report.logTestInfo(getTitleofThePage());
    report.logTestInfo((recentcontact.getText())+" is displayed");
}
public void getmycontacts() {
	 Select select= new Select(viewdrop);
     select.selectByVisibleText("My Contacts");
     report.logTestInfo("My Contacts is selected");
     clickElement(viewdrop);
     report.logTestInfo(getTitleofThePage());  
}
public void getcontactinfo() {
	mouseOver(contact);
	clickElement(contact);
	report.logTestInfo("contact name clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
}