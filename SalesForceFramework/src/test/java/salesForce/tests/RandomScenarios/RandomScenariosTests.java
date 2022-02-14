package salesForce.tests.RandomScenarios;

import org.testng.annotations.Test;

import salesForce.Base.BaseTest;

public class RandomScenariosTests extends BaseTest {
	/*@Test
	public void tc33() {
		loginpage.loginToSF();
		homepage.gethometab();
		homepage.infodisplayed();
	}
	@Test
	public void tc34() {
		loginpage.loginToSF();
		homepage.gethometab();
		homepage.clickmyinfo();
		profilepage.clickeditprofile();
		profilepage.switchTo();
		profilepage.editcontactinfo();
	}
	@Test
	public void tc35() {
		loginpage.loginToSF();
		homepage.gettingalltabs();
		randomscenariospage.customizetab();
		customizetabspage.removeatab();
		homepage.getlogout();
		loginpage.loginToSF();
	}
	@Test
	public void tc36() {
		loginpage.loginToSF();
		homepage.gethometab();
		homepage.date();
		calendarpage.get8pmtime();
		neweventpage.subjectcombolink();
	}*/
	@Test
	public void tc37() {
		loginpage.loginToSF();
		homepage.gethometab();
		homepage.date();
		calendarpage.get4pmtime();
		neweventpage.subjectcombolink();
		neweventpage.eventwithrecurrence();
	}
}
