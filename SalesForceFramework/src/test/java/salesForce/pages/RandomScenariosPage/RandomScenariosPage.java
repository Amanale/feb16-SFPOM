package salesForce.pages.RandomScenariosPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.salesForce.Base.BasePage;

public class RandomScenariosPage extends BasePage {

	public RandomScenariosPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name="customize") WebElement customizemytabs;
 public void customizetab() {
	 clickElement(customizemytabs);
	 report.logTestInfo("customize my tabs clicked");
	 report.logTestInfo(getTitleofThePage());
 }
}
