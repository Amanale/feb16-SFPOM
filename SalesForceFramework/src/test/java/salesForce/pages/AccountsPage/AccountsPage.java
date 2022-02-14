package salesForce.pages.AccountsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class AccountsPage extends BasePage {

	public AccountsPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="Account_Tab") WebElement accounts;
@FindBy(name ="new") WebElement newbtn;
@FindBy(xpath="//a[normalize-space()='Create New View']")WebElement createnewview;
@FindBy (xpath="//a[normalize-space()='Merge Accounts']") WebElement mergeacct;
@FindBy(xpath="//a[normalize-space()='Accounts with last activity > 30 days']") WebElement acctreport;

public void getaccounts() {
	clickElement(accounts);
	popupWindowHandeling();
	report.logTestInfo("accounts is selected");
	report.logTestInfo(getTitleofThePage());
}
public void newaccount() {
	popupWindowHandeling();
	clickElement(newbtn);
	report.logTestInfo("new button clicked");
}
public void getnewview() {
	clickElement(createnewview);
	report.logTestInfo("create new view clicked");
}
public void mergeaccount() {
	clickElement(mergeacct);
	report.logTestInfo("merge account clicked");
}
public void getreportlesthan30() {
	clickElement(acctreport);
	report.logTestInfo("account report with activity less than 30 days clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
	}


