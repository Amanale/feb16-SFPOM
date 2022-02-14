package salesForce.pages.UserMenuDropDownPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class LoginHistoryPage extends BasePage{
	
public  LoginHistoryPage (WebDriver driver1) {
		super(driver1);  
}
@FindBy(xpath="//a[contains(text(),'Download login history for last six months, includ')]") WebElement downloadformat;
@FindBy(id="DisplayAndLayout_font") WebElement displayAndlayout;
@FindBy(id="CustomizeTabs_font") WebElement customizemytabs;

public void gettitleanddownload(){
	report.logTestInfo(getTitleofThePage());
	String s= downloadformat.getText();
	if(s.contains("csv")){
	    System.out.println("download format is csv file");
	}
	report.logTestInfo("download format is csv file");
	}
public void getcustomizetabs() {
	clickElement(displayAndlayout);
	report.logTestInfo("display layout clicked");
	clickElement(customizemytabs);
	report.logTestInfo("customize my tabs clicked");
}
}

