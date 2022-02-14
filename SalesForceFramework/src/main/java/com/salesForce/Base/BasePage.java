package com.salesForce.Base;



import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salesForce.utility.GenerateReports;


public class BasePage {
	 private static WebDriver driver;
	 protected static WebDriverWait wait;
	protected static GenerateReports report= GenerateReports.getInstance();
	public BasePage(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}

	public static void closeDriver() {
		driver.close();
	}
	public static void closeAllDriver() {
		driver.quit();
	}
	public static void enterText(WebElement element,String text) {
		waitUntilVisible(element);
		if(element.isDisplayed()) {
			clearElement(element);
			element.sendKeys(text);
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	public static void clickElement(WebElement element) {
		if(element.isDisplayed()) {
			element.click();
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	public static void clearElement(WebElement element) {
		if(element.isDisplayed()) {
			element.clear();
		}
		else {
			System.out.println("fail: element not displayed");
		}
	}
	public static void waitUntilVisible(WebElement element) {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void waitUntilAlertIsPresent() {
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void mouseOver(WebElement element) {
		waitUntilVisible(element);
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void AcceptAlert() {
		waitUntilAlertIsPresent();
		Alert alert=driver.switchTo().alert();
		System.out.println("alert text="+alert.getText());
		alert.accept();
		
	}
	public static void dissmisAlert() {
		waitUntilAlertIsPresent();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();	
	}
	public static void selectByTextData(WebElement element,String text) {
		Select selectCity = new Select(element);
		selectCity.selectByVisibleText(text);
	}
	public static void selectByIndexData(WebElement element,int index) {
		Select selectCity = new Select(element);
		selectCity.selectByIndex(index);
	}
	public static void selectByValueData(WebElement element,String text) {
		Select selectCity = new Select(element);
		selectCity.selectByValue(text);
	}

	public static void popupWindowHandeling() {
		WebElement lightDialogue= driver.findElement(By.id("tryLexDialogX"));
		if (lightDialogue.isDisplayed()) {
			lightDialogue.click();
		}
	}
   public static void logOut() {
	   driver.findElement(By.id("userNavLabel")).click();
	   driver.findElement(By.xpath("//a[@title='Logout']")).click();
   }
   public static String getTitleofThePage() {
	   return driver.getTitle();
   }
   public static void switchToFrame(WebElement element) {
	   driver.switchTo().frame(element);
   }
   public static void switchToDefaultWindow() {
	   driver.switchTo().defaultContent();
   }
   public static void switchToNewWindow(WebElement element) {
       String oldWindow=driver.getWindowHandle();
       clickElement(element);
       Set <String> window2= driver.getWindowHandles();
       System.out.println(window2.size());
       for (String windows: window2) {
       	if(!windows.equals(oldWindow)) {
       		driver.switchTo().window(windows);
       		break;
       	}
       }
       System.out.println(driver.getTitle());
       driver.switchTo().window(oldWindow);
   }

}

	 
 
