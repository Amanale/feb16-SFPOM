package salesForce.pages.AccountsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class MergeMyAccountPage extends BasePage {

	public MergeMyAccountPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="srch") WebElement search;
@FindBy (name="srchbutton") WebElement findacct;
@FindBy(id="cid0") WebElement choice1;
@FindBy(id="cid1") WebElement choice2;
@FindBy (name="goNext") WebElement nextbtn;
@FindBy (name="save") WebElement savebtn;

public void chooseaccouts() {
	waitUntilVisible(search);
	report.logTestInfo(getTitleofThePage());
	clickElement(search);
	enterText(search, "un");
	report.logTestInfo("search button clicked and un entered");
	clickElement(findacct);
	report.logTestInfo("find accounts clicked");
	//clickElement(choice1);
	//clickElement(choice2);
	report.logTestInfo("first and second choices clicked");
	clickElement(nextbtn);
	report.logTestInfo("next button clicked");
	clickElement(savebtn);
	report.logTestInfo("merge button clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}

}
