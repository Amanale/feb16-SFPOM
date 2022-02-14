package salesForce.pages.AccountsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class ReportPage extends BasePage {

	public ReportPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(id="ext-gen20") WebElement datefield;
@FindBy (xpath="//div[contains(text(),'Created Date')]") WebElement createdate;
@FindBy(id="ext-gen152")WebElement fromdate;
@FindBy(id="ext-gen281")WebElement todaydate;
@FindBy(id="ext-gen154") WebElement todate;
@FindBy(id="ext-comp-1045")WebElement todaydate1;
@FindBy(id="ext-gen49")WebElement savereport;
@FindBy(id="saveReportDlg_reportNameField")WebElement reportname;
@FindBy(id="saveReportDlg_DeveloperName") WebElement reportuniquename;
@FindBy(id="ext-gen321") WebElement saveandrun;

public void createreport() {
	clickElement(datefield);
	clickElement(createdate);
	report.logTestInfo("create date clicked");
	clickElement(fromdate);
	mouseOver(todaydate);
	clickElement(todaydate);
	clickElement(todate);
	mouseOver(todaydate1);
	clickElement(todaydate1);
	report.logTestInfo("today's date is chosen for from and to");
	clickElement(savereport);
	report.logTestInfo("save clicked");
	enterText(reportname, "first trial");
	clickElement(reportuniquename);
	report.logTestInfo("report name given");
	clickElement(saveandrun);
	report.logTestInfo("save and run clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
}
