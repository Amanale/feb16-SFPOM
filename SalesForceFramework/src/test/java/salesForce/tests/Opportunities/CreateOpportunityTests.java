package salesForce.tests.Opportunities;

import org.testng.annotations.Test;

import salesForce.Base.BaseTest;

public class CreateOpportunityTests extends BaseTest{
	
@Test
public void tc15() {
	loginpage.loginToSF(); 
	opporpage.getoppotunitytab();
	opporpage.getdropdown();
}
@Test
public void tc16() {
	loginpage.loginToSF(); 
	opporpage.getoppotunitytab();
	opporpage.createnewopp();
	editoppage.editopp();
}
	@Test
public void tc17() {
	loginpage.loginToSF(); 
	opporpage.getoppotunitytab();
	opporpage.opppipeline();
	
}
	@Test
public void tc18() {
	loginpage.loginToSF(); 
	opporpage.getoppotunitytab();
	opporpage.stuckopp();
	}
	@Test
public void tc19() {
	loginpage.loginToSF(); 
	opporpage.getoppotunitytab();	
	opporpage.quarterlysummary();
	}
}
