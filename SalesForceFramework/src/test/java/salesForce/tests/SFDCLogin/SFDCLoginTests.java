package salesForce.tests.SFDCLogin;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.salesForce.utility.CommonUtilities;
import salesForce.Base.BaseTest;


 public class SFDCLoginTests extends BaseTest {
     @Test
     public void tc01() {
    	 String username=CommonUtilities.getApplicationProperty("username");
    	 loginpage.enterIntoUsername(username);
    	 report.logTestInfo("The username is entered");
    	 loginpage.enterIntoPassword("123");
    	 report.logTestInfo("wrong password entered");
    	 loginpage.clickLoginButton();
    	 report.logTestInfo("login button is clicked");
    	 loginpage.getErrorMessage();
    	 report.logTestInfo("The error displayed message is: Please enter your password.");
}

     @Test 
     public void tc02() {
    	 String username= CommonUtilities.getApplicationProperty("username");
    	 loginpage.enterIntoUsername(username);
    	 report.logTestInfo("The username is entered");
    	 String password= CommonUtilities.getApplicationProperty("password");
    	 loginpage.enterIntoPassword(password);
    	 report.logTestInfo("The password is entered");
    	 loginpage.clickLoginButton();
    	 report.logTestInfo("login button is clicked");
    	 String title= homepage.getTitleOfTheHomePage();
    	 Assert.assertEquals(title, "Home Page ~ Salesforce - Developer Edition");
}
     @Test
     public void tc03() {
    	 String username= CommonUtilities.getApplicationProperty("username");
    	 loginpage.enterIntoUsername(username);
    	 report.logTestInfo("The username is entered");
    	 String password= CommonUtilities.getApplicationProperty("password");
    	 loginpage.enterIntoPassword(password);
    	 report.logTestInfo("The password is entered");
    	 loginpage.clickRememberMe();
    	 report.logTestInfo("RememberMe button is selected");
    	 loginpage.clickLoginButton();
    	 report.logTestInfo("login button is clicked");
     }
     
     @Test
     public void tc04A() {
    	 String username= CommonUtilities.getApplicationProperty("username");
    	 loginpage.enterIntoUsername(username);
    	 report.logTestInfo("The username is entered");
    	 loginpage.clickForgotPasswrd();
    	 report.logTestInfo("forgot password was clicked");
    	 loginpage.clickLoginButton();
    	 report.logTestInfo("login button is clicked");
    	 loginpage.cancelfgtpass();
     }
     
     @Test
     public void tc04B() {
    	 loginpage.enterIntoUsername("123");
    	 report.logTestInfo("The wrong username 123 is entered");
    	 loginpage.enterIntoPassword("22131");
    	 report.logTestInfo("The wrong password 22131 is entered");
    	 loginpage.clickLoginButton();
    	 report.logTestInfo("login button is clicked");
    	 String message=loginpage.getErrorMessage();
    	 report.logTestInfo("error message is displayed");
    	 Assert.assertEquals(message, "Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
     }
     
 }    
     
     
     
     
	
	


