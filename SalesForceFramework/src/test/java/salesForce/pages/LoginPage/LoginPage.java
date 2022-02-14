package salesForce.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.salesForce.Base.BasePage;
import com.salesForce.utility.CommonUtilities;

public class LoginPage extends BasePage{
	  public LoginPage (WebDriver driver) {
	    	super(driver);
	    }
    @FindBy(id = "username") WebElement username;
    @FindBy(id = "password") WebElement password;
    @FindBy(id = "Login") WebElement loginButton;
    @FindBy(id = "forgot_password_link") WebElement forgotPassword;
    @FindBy(id = "rememberUn") WebElement rememberMe;
    @FindBy(id = "logo") WebElement logo;
    @FindBy(css = "#hint_back_chooser") WebElement savedUserName;
    @FindBy(id = "error") WebElement errorText;
    @FindBy(xpath = "//span[@id='idcard-identity']") WebElement AfterChekingRemMe;
    @FindBy(xpath= "//input[@name='cancel']")WebElement cancel;
 
    public void enterIntoUsername (String usrName) {
    	enterText(username, usrName);
    	report.logTestInfo("the username was entered");
    }
    public void enterIntoPassword (String passWord) {
    	enterText(password, passWord);
    	report.logTestInfo("the password was entered");
    }
    public void clickLoginButton() {
    	clickElement(loginButton);
    }
    public void handleAlert() {
    	AcceptAlert();
    }
    public void clickForgotPasswrd() {
    	clickElement(forgotPassword);
    }
    public void clickRememberMe() {
    	clickElement(rememberMe);
    }
  public String getErrorMessage() {
	  String errorMessage= errorText.getText();
	  return errorMessage;
  }
  public void cancelfgtpass() {
	  waitUntilVisible(cancel);
	  clickElement(cancel);
  }
  public void loginToSF() {
	  String userName= CommonUtilities.getApplicationProperty("username");
	  String passWord= CommonUtilities.getApplicationProperty("password");
	  enterText(username, userName);
	  enterText(password, passWord);
	  clickElement(loginButton);
	  report.logTestInfo("The login was succesful");	
}
 
}
