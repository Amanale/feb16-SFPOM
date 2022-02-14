package salesForce.pages.UserMenuDropDownPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.salesForce.Base.BasePage;

import salesForce.pages.LoginPage.LoginPage;

public class UserMenuDropDownPage extends BasePage {

	public UserMenuDropDownPage(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id= "userNavButton") WebElement userMenu ;
	@FindBy(xpath= "//a[@title='My Profile']") WebElement myprofile;
	@FindBy(xpath= "//a[@title='My Settings']") WebElement mySettings ;
	@FindBy(xpath= "//a[@title='Developer Console (New Window)']") WebElement devCons ;
	@FindBy(xpath= "//a[@title='Switch to Lightning Experience']") WebElement switchToLE ;
	@FindBy(xpath= "//a[@title='Logout']") WebElement logout ;
	@FindBy(id= "tailBreadcrumbNode") WebElement profilename ;
	@FindBy(xpath= "//span[normalize-space()='Post']") WebElement postlink ;
	@FindBy(xpath= "//tbody/tr[1]/td[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/iframe[1]") WebElement postiframe; 
	@FindBy(xpath="//body") WebElement body;
	@FindBy (xpath="//input[@id='publishersharebutton']") WebElement share;
	@FindBy (xpath="//a[@id='publisherAttachContentPost']") WebElement filelink;
	@FindBy (xpath="//a[@id='chatterUploadFileAction']") WebElement uploadfile;
	@FindBy (id="chatterFile") WebElement chosefile;
	@FindBy (id="publishersharebutton") WebElement publish;
	@FindBy (xpath="//span[@class='profileImage chatter-avatarFull chatter-avatar']//img[@title='manale Abcd']") WebElement myprofilephoto;
	@FindBy (xpath="//a[@id='uploadLink']") WebElement updatephoto;
	@FindBy (id="uploadPhotoContentId") WebElement photoiframe;
	@FindBy (id="j_id0:uploadFileForm:uploadInputFile") WebElement uploadpicture;
	@FindBy (id="j_id0:uploadFileForm:uploadBtn") WebElement uploadbutton;
	@FindBy(xpath="//a[@title='Home Tab']") WebElement hometab;
	@FindBy(xpath="//a[@href='/_ui/core/userprofile/UserProfilePage'][normalize-space()='manale Abcd']") WebElement info;
	@FindBy(xpath="//img[@title='All Tabs']") WebElement alltabs;
	@FindBy(css ="a[href='/00U/c?md3=44&md0=2022']") WebElement date;
	
	
	public void gethometab() {
		clickElement(hometab);
		report.logTestInfo("home tab is selected");
		popupWindowHandeling();
	}
	public String getTitleOfTheHomePage() {
		String title= getTitleofThePage();
		return title;
	}
    public void getUserMenu() {
    	userMenu.click();
    	report.logTestInfo("The user menu is available");
    }
    public void getusermenudropdown () {
    	String[] elements= {"My Profile", "My Settings", "Developer Console", "Switch To Lightning Experience", "Logout"};
    	String[] elementsfound= { myprofile.getText(),mySettings.getText(), devCons.getText(), switchToLE.getText(), logout.getText()} ;

		for (String dropdown: elementsfound) {
			boolean match= false;
			for(int i=0; i<elements.length;i++) {
				if (dropdown.equalsIgnoreCase(elements[i])) {
					match=true;
				}
			}
			Assert.assertTrue(match);
		} 
		for (String dropdown: elementsfound) {
			System.out.println(dropdown);
			
		}
		report.logTestInfo("All the drop down elements are displayed");
    }
    public void selectMyProfile() {
    	getUserMenu();
    	clickElement(myprofile);
    	report.logTestInfo("My profile was selected from user menu drop down");
    }
    public void getDisplayedName() {
    	String displayName= profilename.getText();
    	report.logTestInfo("The displayed name is: "+displayName);
    }
    public void posting() {
    	clickElement(postlink);
    	switchToFrame(postiframe);
    	report.logTestInfo("switch to iframe");
    	enterText(body, "welcome");
    	report.logTestInfo("posting");
    	switchToDefaultWindow();
    	clickElement(share);
    	report.logTestInfo("post was shared");
    }
    public void uploadFile() {
    	waitUntilVisible(filelink);
    	clickElement(filelink);
    	waitUntilVisible(uploadfile);
    	clickElement(uploadfile);
    	report.logTestInfo("uploadfile clicked");
    	waitUntilVisible(chosefile);
    	clickElement(chosefile);
    	enterText(chosefile, "C:\\Users\\oushi\\OneDrive\\Desktop\\Manale\\hello.txt");
    	waitUntilVisible(publish);
    	clickElement(publish);
    	report.logTestInfo("selected file is posted");
    }
    public void uploadphoto() {
    	waitUntilVisible(myprofilephoto);
    	clickElement(myprofilephoto);
    	 mouseOver(myprofilephoto);
    	 report.logTestInfo("mouse Over profile photo");
    	 clickElement(updatephoto);
    	 waitUntilVisible(photoiframe);
    	 switchToFrame(photoiframe);
    	 report.logTestInfo("photo link appear");
    	 waitUntilVisible(uploadpicture);
    	 clickElement(uploadpicture);
    	 enterText(uploadpicture, "C:\\Users\\oushi\\OneDrive\\Pictures\\images.png");
    	 waitUntilVisible(uploadbutton);
    	 clickElement(uploadbutton);
    	 report.logTestInfo("uploaded photo appears");	 
    }
    public void selectMySettings() {
    	getUserMenu();
    	clickElement(mySettings);
    	report.logTestInfo("My settings is selected from user menu drop down");
}
    public void getDevCons() {
    	getUserMenu();
    	switchToNewWindow(devCons);
    	report.logTestInfo("the devolper console is displayed");
    	report.logTestInfo("the develper console is closed and return to: "+getTitleofThePage());	
    }
    public void getlogout() {
    	getUserMenu();
    	clickElement(logout);
    	report.logTestInfo("logout is clicked");
    	report.logTestInfo("logout succesful  ");
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	report.logTestInfo(getTitleofThePage());
    }
    public void infodisplayed() {
		if (info.isDisplayed())
 {
			report.logTestInfo("The first and last name are displayed");
		}
		clickElement(info);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		report.logTestInfo(getTitleofThePage());
		Assert.assertEquals(getTitleofThePage(), "User: manale Abcd ~ Salesforce - Developer Edition");
		report.logTestInfo("both pages are the same");
    }
    public void clickmyinfo() {
    	clickElement(info);
    	report.logTestInfo("First and Last name link clicked");
    }
    public void gettingalltabs() {
    	boolean s= alltabs.isDisplayed();
    	report.logTestInfo("all tabs button is displayed: "+s);
    	clickElement(alltabs);
    	report.logTestInfo("all tabs clicked");
    }
    public void date() {
    	clickElement(date);
    	report.logTestInfo("today's link clicked");
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	report.logTestInfo(getTitleofThePage());
    }
}   
