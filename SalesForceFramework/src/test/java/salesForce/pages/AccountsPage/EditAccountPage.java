package salesForce.pages.AccountsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class EditAccountPage extends BasePage{

	public EditAccountPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="acc2") WebElement acctname;
@FindBy(name = "save") WebElement save;
public void createnewaccount() {
	clickElement(acctname);
	enterText(acctname, "Account name");
	report.logTestInfo("account name entered");
	clickElement(save);
	report.logTestInfo("save button clicked");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
}
