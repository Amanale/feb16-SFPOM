package salesForce.tests.Leads;

import org.testng.annotations.Test;

import salesForce.Base.BaseTest;

public class LeadsTests extends BaseTest {
	
@Test
public void tc20(){
	loginpage.loginToSF(); 
	leadpage.openleadstab();
	homepage.getlogout();
}
@Test
public void tc21(){
   loginpage.loginToSF(); 
   leadpage.openleadstab();
   leadpage.viewdropdown();
   homepage.getlogout();
}
@Test
public void tc22(){
	loginpage.loginToSF(); 
	leadpage.openleadstab();
	leadpage.selecttodayslead();
	homepage.getlogout();
	loginpage.loginToSF(); 
	leadpage.openleadstab();
	leadpage.getattribute();	
}
@Test
public void tc23(){
	loginpage.loginToSF(); 
	leadpage.openleadstab();
	leadpage.selecttodayslead();
	leadpage.getattribute();
	homepage.getlogout();
}
@Test
public void tc24(){
	loginpage.loginToSF(); 
	leadpage.openleadstab();
	leadpage.getnewlead();
	editleadpage.editlead();
	homepage.getlogout();
	
}
}
