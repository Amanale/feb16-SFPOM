package salesForce.tests.UserMenuDropDown;
import org.testng.annotations.Test;
import salesForce.Base.BaseTest;

public class UserMenuDropDownTests extends BaseTest{
	   @Test
	     public void tc05() {
   loginpage.loginToSF(); 	 
   homepage.getTitleOfTheHomePage();
   report.logTestInfo("the home page is displayed");
   homepage.getUserMenu();
   homepage.getusermenudropdown();  
}
	     @Test
	     public void tc06() {
	loginpage.loginToSF(); 	
	homepage.selectMyProfile();
	profilepage.clickUserActionMenu();
	profilepage.clickeditprofile();
	profilepage.switchTo();
	profilepage.editcontactinfo();
	homepage.getDisplayedName();
	homepage.posting();
	homepage.uploadFile();
	homepage.uploadphoto();
	     }
	     @Test
	     public void tc07() { 
	loginpage.loginToSF(); 
	homepage.selectMySettings();
	settingpage.mysettingtitle();
	settingpage.getloginhistory();
	loginhistory.gettitleanddownload();
	loginhistory.getcustomizetabs();
	     
	     }
	     @Test
	     public void tc08() { 
	loginpage.loginToSF(); 
	homepage.getDevCons();
	     }
	     @Test
	     public void tc09() { 
	loginpage.loginToSF();  
	homepage.getlogout();
	     }
}