package salesForce.Base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

import com.salesForce.utility.CommonUtilities;
import com.salesForce.utility.Constants;
import com.salesForce.utility.GenerateReports;
import io.github.bonigarcia.wdm.WebDriverManager;
import salesForce.pages.AccountsPage.AccountsPage;
import salesForce.pages.AccountsPage.CreateNewViewPage;
import salesForce.pages.AccountsPage.EditAccountPage;
import salesForce.pages.AccountsPage.MergeMyAccountPage;
import salesForce.pages.AccountsPage.ReportPage;
import salesForce.pages.ContactsPage.ContactNewViewPage;
import salesForce.pages.ContactsPage.ContactsPage;
import salesForce.pages.ContactsPage.EditContactPage;
import salesForce.pages.LeadPage.EditLeadPage;
import salesForce.pages.LeadPage.LeadPage;
import salesForce.pages.LoginPage.LoginPage;
import salesForce.pages.OpportunitiesPage.OpportunitiesPage;
import salesForce.pages.OpportunitiesPage.OpportunityEditPage;
import salesForce.pages.RandomScenariosPage.CalendarPage;
import salesForce.pages.RandomScenariosPage.CustomizeTabsPage;
import salesForce.pages.RandomScenariosPage.NewEventPage;
import salesForce.pages.RandomScenariosPage.RandomScenariosPage;
import salesForce.pages.UserMenuDropDownPage.LoginHistoryPage;
import salesForce.pages.UserMenuDropDownPage.MyProfilePage;
import salesForce.pages.UserMenuDropDownPage.MySettingsPage;
import salesForce.pages.UserMenuDropDownPage.UserMenuDropDownPage;


public class BaseTest {
	protected static WebDriver driver;
	protected static GenerateReports report= GenerateReports.getInstance();
	protected static LoginPage loginpage;
	protected static LeadPage leadpage;
	protected static AccountsPage accountspage;
	protected static ContactsPage contactspage;
	protected static OpportunitiesPage opportunitiespage;
	protected static RandomScenariosPage randomscenariospage;
	protected static UserMenuDropDownPage homepage;
	protected static MyProfilePage profilepage;
	protected static MySettingsPage settingpage;
	protected static LoginHistoryPage loginhistory;
	protected static AccountsPage accountpage;
	protected static EditAccountPage editaccountpage;
	protected static CreateNewViewPage createnewviewpage;
	protected static MergeMyAccountPage mergeacctpage;
	protected static ReportPage reportpage;
	protected static OpportunitiesPage opporpage;
	protected static OpportunityEditPage editoppage;
	protected static EditLeadPage editleadpage;
	protected static EditContactPage editcontactpage;
	protected static ContactNewViewPage contactnewvpage;
	protected static CustomizeTabsPage customizetabspage;
	protected static CalendarPage  calendarpage;
	protected static NewEventPage  neweventpage;
	
	@BeforeTest
	public void setUp() {
		System.out.println("Before class is executing");
		report.startExtentReport();
		System.out.println("extent report document is created");
	}
	@Parameters({"browser"})
	 @BeforeMethod
	 public void initialSetUp (String browserName, Method method) {
		report.startSingleTestReport(method.getName());
		System.out.println("Before method is executing");
		  if(browserName.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
		  }
		  else if (browserName.equalsIgnoreCase("firefox")) {
				 WebDriverManager.chromedriver().setup();
				 driver= new FirefoxDriver();
	 }
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get(CommonUtilities.getApplicationProperty("url"));
		  loginpage=new LoginPage(driver);
		  leadpage= new LeadPage(driver);
		  accountspage= new AccountsPage(driver);
		  contactspage= new ContactsPage(driver);
		  opportunitiespage= new OpportunitiesPage(driver);
		  randomscenariospage= new RandomScenariosPage(driver);
		  homepage= new UserMenuDropDownPage(driver);
		  profilepage= new MyProfilePage(driver); 
		  settingpage= new MySettingsPage(driver);
		  loginhistory= new LoginHistoryPage(driver);
		  accountpage= new AccountsPage(driver);
		  editaccountpage= new EditAccountPage(driver);
		  createnewviewpage=new CreateNewViewPage(driver);
		  mergeacctpage= new MergeMyAccountPage(driver);
		  reportpage= new ReportPage(driver);
		  opporpage= new OpportunitiesPage(driver);
		  editoppage= new OpportunityEditPage(driver);
		  editleadpage= new EditLeadPage(driver);
		  editcontactpage= new EditContactPage(driver);
		  contactnewvpage= new ContactNewViewPage(driver);
		  customizetabspage= new CustomizeTabsPage(driver);
		  calendarpage= new CalendarPage(driver);
		  neweventpage=new NewEventPage(driver);
		  
	}
	 
	 @AfterMethod
	 public void tearDown(ITestResult result) {
		 if(result.getStatus()==ITestResult.SUCCESS) {
			 report.logTestpassed();
		 }
		 else if (result.getStatus()==ITestResult.FAILURE) {
			 String path= takescreenshot();
			 try {
				 report.logger.addScreenCaptureFromPath(path);
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		 }
		// closeAllDriver();
		 driver.quit();
	 }
	 @AfterTest
	 public void endUp() {
		 report.endTestReport();
	 }
		public static String takescreenshot() {
			TakesScreenshot scrShot=((TakesScreenshot)driver);	
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			String filePath= Constants.SCREENSHOT_PATH+ "salesForce.jpg";
			File DestFile= new File(filePath);
			try {
				FileUtils.copyFile(SrcFile, DestFile);
			}
			catch (IOException e) {
				e.getStackTrace();
			}
			return filePath;
			}
		
}
