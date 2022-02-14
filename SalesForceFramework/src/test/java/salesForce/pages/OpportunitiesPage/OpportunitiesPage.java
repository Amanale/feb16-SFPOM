package salesForce.pages.OpportunitiesPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.salesForce.Base.BasePage;

public class OpportunitiesPage extends BasePage {

	public OpportunitiesPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[@title='Opportunities Tab']") WebElement opportunitytab;
@FindBy(id="fcf") WebElement dropdown;
@FindBy(xpath="//option[@value='00B8c000009pgLb']") WebElement allOpportunities;
@FindBy(xpath="//option[@value='00B8c000009pgO1']") WebElement closingNextMonth;
@FindBy(xpath="//option[@value='00B8c000009pgNv']") WebElement closingThisMonth;
@FindBy(xpath="//option[@value='00B8c000009pgOx']") WebElement myOpportunities;
@FindBy(xpath="//option[@value='00B8c000009pgO8']") WebElement newThisWeek;
@FindBy(xpath="//option[@value='00B8c000009pgOu']") WebElement recentlyViewed;
@FindBy(xpath="//option[@value='00B8c000009pgOF']") WebElement won;
@FindBy(name="new") WebElement newbtn;
@FindBy(xpath="//a[normalize-space()='Opportunity Pipeline']") WebElement opppipeline;
@FindBy(xpath="//a[normalize-space()='Stuck Opportunities']") WebElement stuckopp;
@FindBy (id="quarter_q") WebElement selectinterval;
@FindBy(id="open") WebElement selectinclude ;
@FindBy(name="go") WebElement run;

public void getoppotunitytab() {
	clickElement(opportunitytab);
	report.logTestInfo(getTitleofThePage());
	popupWindowHandeling();
}
public void getdropdown() {
	clickElement(dropdown);
	report.logTestInfo("the dropdown is present");
	popupWindowHandeling();
	String[] elements= {"All Opportunities", "Closing Next Month", "Closing This Month", "My Opportunities", "New This Week", "Recently Viewed Opportunities", "Won"};
	String[] elementsfound= { allOpportunities.getText(),closingNextMonth.getText(), closingThisMonth.getText(), myOpportunities.getText(), newThisWeek.getText(), recentlyViewed.getText(), won.getText()} ;
	for (String dropdown: elementsfound) {
		boolean match= false;
		for(int i=0; i<elements.length;i++) {
			if (dropdown.equalsIgnoreCase(elements[i])) {
				match=true;
			}
		}
		Assert.assertTrue(match);
	} 
	for (String dropdown: elementsfound) {
		System.out.println(dropdown);
		
	}
	report.logTestInfo("All the drop down elements are displayed");
}
public void createnewopp(){
	clickElement(newbtn);
	report.logTestInfo("new button clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
public void opppipeline() {
	clickElement(opppipeline);
	report.logTestInfo("opportunity pipe line clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
public void stuckopp() {
	clickElement(stuckopp);
	report.logTestInfo("stuck opportunity clicked");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	report.logTestInfo(getTitleofThePage());
}
public void quarterlysummary() {
	clickElement(selectinterval);
	 Select select = new Select(selectinterval); 
     select.selectByVisibleText("Current FQ");
     report.logTestInfo("selected interval");
     clickElement(selectinterval);
     Select select1 = new Select(selectinclude); 
     select1.selectByVisibleText("All Opportunities");
     report.logTestInfo("selected include");
     clickElement(run);
     report.logTestInfo("run report clicked");
     try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     report.logTestInfo(getTitleofThePage());
}
}
