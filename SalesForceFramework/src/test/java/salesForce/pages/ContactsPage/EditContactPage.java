package salesForce.pages.ContactsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class EditContactPage extends BasePage{

	public EditContactPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
		}
@FindBy(id="name_lastcon2") WebElement lastname;
@FindBy(id="con4") WebElement accountname;
@FindBy(name="save") WebElement savebtn;
@FindBy(name="save_new") WebElement saveandnewbtn;
@FindBy(id="errorDiv_ep") WebElement error;

public void getnewaccount() {
	enterText(lastname, "LastName");
	report.logTestInfo("last name is entered");
	enterText(accountname, "AccountName");
	report.logTestInfo("account name is entered");
	clickElement(savebtn);
	report.logTestInfo("save button clicked");
	report.logTestInfo(getTitleofThePage());
}
public void editnewcontact() {
	enterText(lastname, "Indian");
	report.logTestInfo("Indian is entered in last name field");
	enterText(accountname, "Global Media");
	report.logTestInfo("Global Media is entered in account name");
	clickElement(saveandnewbtn);
	report.logTestInfo("save and new button clicked");
	report.logTestInfo((error.getText())+" is displayed");
	report.logTestInfo(getTitleofThePage());
}
}
