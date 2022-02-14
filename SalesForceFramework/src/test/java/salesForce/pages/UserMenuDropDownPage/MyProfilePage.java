package salesForce.pages.UserMenuDropDownPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.salesForce.Base.BasePage;

public class MyProfilePage extends BasePage{
public MyProfilePage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}

@FindBy(id="moderatorMutton") WebElement arrowdown;
@FindBy(xpath="//a[@title='Edit Profile']") WebElement editprofile;
@FindBy(id = "aboutMeContentId") WebElement editprofilepage;
@FindBy(xpath="//a[normalize-space()='About']") WebElement about;
@FindBy(id="lastName") WebElement lastname;
@FindBy(xpath="//input[@value='Save All']") WebElement saveall;

public void clickUserActionMenu() {
	waitUntilVisible(arrowdown);
    mouseOver(arrowdown);
	clickElement(arrowdown);
	report.logTestInfo("user action menu clicked");
}
public void clickeditprofile() {
	clickElement(editprofile);
	report.logTestInfo("edit profile clicked");
}
public void switchTo() {
	waitUntilVisible(editprofilepage);
	switchToFrame(editprofilepage);
	report.logTestInfo("the edit profile pop up window is displayed");
}
public void editcontactinfo() {
	clickElement(about);
	clickElement(lastname);
	clearElement(lastname);
	enterText(lastname, "Abcd");
	report.logTestInfo("the last name was edited");
	clickElement(saveall);
	report.logTestInfo("save all is clicked");
}
}
