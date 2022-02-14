package salesForce.pages.RandomScenariosPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.salesForce.Base.BasePage;

public class CustomizeTabsPage extends BasePage {

	public CustomizeTabsPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//option[@value='Workspace']") WebElement libraries;
@FindBy(xpath="//img[@title='Remove']") WebElement remove;
@FindBy(xpath="//select[@id='duel_select_0']") WebElement menu;

public void removeatab() {
	clickElement(libraries);
	clickElement(remove);
	report.logTestInfo("Libraries is removed");
	Select select= new Select(menu);
	List<WebElement> allElements= select.getOptions();
	report.logTestInfo("Values present in single value dropdown");
	for(WebElement element: allElements) {
		String dropdownOptionValue= element.getText();
		if(dropdownOptionValue.equalsIgnoreCase("libraries")) {
			report.logTestInfo("Libraries is present");
		}
	}
}
}
