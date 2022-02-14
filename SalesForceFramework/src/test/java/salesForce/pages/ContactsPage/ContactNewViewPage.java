package salesForce.pages.ContactsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class ContactNewViewPage extends BasePage {

	public ContactNewViewPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="fname") WebElement viewname;
@FindBy(id="devname") WebElement viewuniquename;
@FindBy(name="save") WebElement savebtn;
@FindBy(xpath="//div[@class='requiredInput']//div[@class='errorMsg']") WebElement errormsg;
@FindBy(name="cancel") WebElement cancelbtn;

public void createnewview() {
	enterText(viewname, "Name99");
	report.logTestInfo("View Name entered");
	clickElement(viewuniquename);
	report.logTestInfo("View Unique Name entered");
	clickElement(savebtn);
	report.logTestInfo("save button clicked");
	report.logTestInfo(getTitleofThePage());
}
public void newviewerrormsg() {
	enterText(viewuniquename, "AFGH");
	report.logTestInfo("AFGH is  entered in View Unique Name");
	clickElement(savebtn);
	report.logTestInfo("save button clicked");
	waitUntilVisible(errormsg);
	report.logTestInfo((errormsg.getText())+ " is displayed");
}
public void cancelnewview() {
	enterText(viewname, "ABCD");
	report.logTestInfo("View Name entered");
	clickElement(viewuniquename);
	clearElement(viewuniquename);
	enterText(viewuniquename, "EFGH");
	report.logTestInfo("View Unique Name entered");
	clickElement(cancelbtn);
	report.logTestInfo("cancel button clicked");
	report.logTestInfo(getTitleofThePage());
}
}
