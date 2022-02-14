package salesForce.pages.OpportunitiesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.salesForce.Base.BasePage;

public class OpportunityEditPage extends BasePage {

	public OpportunityEditPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="opp3") WebElement oppname;
@FindBy(id="opp4") WebElement acctname;
@FindBy(id="opp9") WebElement closedate;
@FindBy(xpath="//a[contains(text(),'Today')]") WebElement todaydate ;
@FindBy(id="opp12") WebElement probability;
@FindBy(id="opp6") WebElement leadsource;
@FindBy(id="opp11") WebElement stage;
@FindBy(id="opp17") WebElement primarysource;
@FindBy (name="save") WebElement savebtn;

public void editopp() {
	enterText(oppname, "Name 9");
    report.logTestInfo("opportunity name  entered");
	enterText(acctname, "Account Name");
    report.logTestInfo("Account name entered");
	clickElement(closedate);
	mouseOver(todaydate);
	clickElement(todaydate);
    report.logTestInfo("date chosen");
	clearElement(probability);
	enterText(probability, "10");
    report.logTestInfo("probability selected");
	Select select = new Select(leadsource); 
    select.selectByIndex(3);
    report.logTestInfo("lead source selected");
    Select select1 = new Select(stage); 
    select1.selectByIndex(3);
    report.logTestInfo("srage selected");
    enterText(primarysource, "source");
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
