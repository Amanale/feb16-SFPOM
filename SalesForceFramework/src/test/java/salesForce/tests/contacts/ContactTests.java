package salesForce.tests.contacts;

import org.testng.annotations.Test;

import salesForce.Base.BaseTest;

public class ContactTests extends BaseTest {
	@Test
	public void tc25() {
		loginpage.loginToSF();
		contactspage.getcontactstab();
		contactspage.getnewcontact();
		editcontactpage.getnewaccount();
	}
	@Test
	public void tc26() {
		loginpage.loginToSF();
		contactspage.getcontactstab();
		contactspage.getnewview();
		contactnewvpage.createnewview();
	}
	@Test
	public void tc27() {
		loginpage.loginToSF();
		contactspage.getcontactstab();
		contactspage.getrecentlycreated();
	}
	@Test
	public void tc28() {
		loginpage.loginToSF();
		contactspage.getcontactstab();
		contactspage.getmycontacts();
	}
	@Test
	public void tc29() {
		loginpage.loginToSF();
		contactspage.getcontactstab();
		contactspage.getcontactinfo();
	}
	@Test
	public void tc30() {
		loginpage.loginToSF();
		contactspage.getcontactstab();
		contactspage.getnewview();
		contactnewvpage.newviewerrormsg();
	}
	@Test
	public void tc31() {
		loginpage.loginToSF();
		contactspage.getcontactstab();
		contactspage.getnewview();
		contactnewvpage.cancelnewview();
	}
	@Test
	public void tc32() {
		loginpage.loginToSF();
		contactspage.getcontactstab();
		contactspage.getnewcontact();
		editcontactpage.editnewcontact();
	}
}
