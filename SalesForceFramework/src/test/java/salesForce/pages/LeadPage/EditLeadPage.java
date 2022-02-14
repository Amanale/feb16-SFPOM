package salesForce.pages.LeadPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class EditLeadPage extends BasePage {

	public EditLeadPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="name_lastlea2") WebElement lastname;
@FindBy(id="lea3") WebElement companyname;
@FindBy(name="save") WebElement savebtn;

public void editlead() {
	report.logTestInfo(getTitleofThePage());
	enterText(lastname, "ABCD");
	report.logTestInfo("ABCD entered in last name field");
	enterText(companyname, "ABCD");
	report.logTestInfo("ABCD entered in company name field");
	clickElement(savebtn);
	report.logTestInfo("save button clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
}
