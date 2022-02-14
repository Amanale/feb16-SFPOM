package salesForce.pages.UserMenuDropDownPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class MySettingsPage extends BasePage{
	
public  MySettingsPage (WebDriver driver1) {
		super(driver1); 
}
@FindBy(id= "PersonalInfo_font") WebElement personallink;
@FindBy(id= "LoginHistory_font") WebElement loginhistory;

public void mysettingtitle() {
	report.logTestInfo(getTitleofThePage());
}
public void getloginhistory() {
clickElement(personallink);
report.logTestInfo("personal link is clicked");
clickElement(loginhistory);
report.logTestInfo("login history link is clicked");
}
}