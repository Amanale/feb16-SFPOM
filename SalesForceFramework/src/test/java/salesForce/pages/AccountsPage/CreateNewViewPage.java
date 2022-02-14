package salesForce.pages.AccountsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.salesForce.Base.BasePage;

public class CreateNewViewPage extends BasePage{

	public CreateNewViewPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy (id="fname") WebElement viewname ;
@FindBy (id="devname") WebElement viewuniquename ;
@FindBy (name="save") WebElement savebtn;
@FindBy (id= "fcf") WebElement view;
@FindBy (xpath= "//a[normalize-space()='Edit']") WebElement edit;
@FindBy(id="fcol1") WebElement field;
@FindBy(id="fop1") WebElement operator;
@FindBy(id="fval1") WebElement value;
@FindBy(xpath=" //select[@id='colselector_select_0']") WebElement availablefields;
@FindBy(xpath="//a[@id='colselector_select_0_right']//img[@title='Add']") WebElement addbtn;
public void createnewview() {
	clickElement(viewname);
	enterText(viewname, "puygcfoh");
	report.logTestInfo("view name entered");
	clickElement(viewuniquename);
	report.logTestInfo("view unique name entered");
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
public void viewdropdown() {
	clickElement(view);
	report.logTestInfo("view drop down clicked");
	Select select = new Select(view); 
    select.selectByVisibleText("view name");
    report.logTestInfo("view name selected from view drop down");
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    report.logTestInfo(getTitleofThePage());
}
public void editview() {
	clickElement(edit);
	report.logTestInfo("edit view clicked");
	clickElement(viewname);
	clearElement(viewname);
	enterText(viewname, "new view name");
	report.logTestInfo(" new view name entered");
	clickElement(viewuniquename);
	report.logTestInfo("new view unique name entered");
	Select select = new Select(field); 
    select.selectByVisibleText("Account Name");
    report.logTestInfo("account name selected from field drop down");
    Select select1 = new Select(operator); 
    select1.selectByVisibleText("contains");
    report.logTestInfo("contains selected from operator drop down");
    clickElement(value);
    enterText(value, "a");
    report.logTestInfo("a entered in value");
    clickElement(availablefields);
    Select select2 = new Select(availablefields); 
    select2.selectByVisibleText("Last Activity");
    report.logTestInfo("last activity selected from available fields drop down");
    clickElement(addbtn);
    report.logTestInfo("last Activity added");
	clickElement(savebtn);
	report.logTestInfo(" save button clicked");
}
}
