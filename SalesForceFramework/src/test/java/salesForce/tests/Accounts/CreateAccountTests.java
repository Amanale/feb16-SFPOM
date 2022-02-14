package salesForce.tests.Accounts;

import org.testng.annotations.Test;

import salesForce.Base.BaseTest;

public class CreateAccountTests extends BaseTest {
@Test
  public void tc10() {
	 loginpage.loginToSF(); 	 
     homepage.getTitleOfTheHomePage();
     report.logTestInfo("the home page is displayed");
     accountpage.getaccounts();
     accountpage.newaccount();
     editaccountpage.createnewaccount();
}
@Test
public void tc11() {
	loginpage.loginToSF(); 	 
    homepage.getTitleOfTheHomePage();
    report.logTestInfo("the home page is displayed");
    accountpage.getaccounts();
    accountpage.getnewview();
    createnewviewpage.createnewview();
}
@Test
public void tc12() {
	loginpage.loginToSF();
	accountpage.getaccounts();
	createnewviewpage.viewdropdown();
	createnewviewpage.editview();
}
@Test
public void tc13() {
	loginpage.loginToSF();
	accountpage.getaccounts();
	accountpage.mergeaccount();
	mergeacctpage.chooseaccouts();
}
@Test
public void tc14() {
	loginpage.loginToSF();
	accountpage.getaccounts();
	accountpage.getreportlesthan30();
	reportpage.createreport();
}
}
