package com.coinlancer.SignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.commonLibraries.Base;
import com.commonLibraries.ExtentTestManager;
import com.commonLibraries.ReadProperties;
import com.relevantcodes.extentreports.LogStatus;

import static com.commonLibraries.Locators.*;
import static com.commonLibraries.Common.*;


public class VerifyRadioButons extends Base {
	
	String username = ReadProperties.getPropValue("Username");
	String password = ReadProperties.getPropValue("Password");

  @Test
  public void verifyRadioButton() {
	  //System.setProperty("webdriver.chrome.driver", "D:\\software1\\drivers\\chromedriver.exe");
	 // driver=new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 driver.get("http://13.127.90.210/login");
	 
	 boolean signupbuton = driver.findElement(SignUp_Button).isDisplayed();
	 if(signupbuton==true) {
		 System.out.println("The Client radio button is visible");
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Radiobutton exists");
		 //Reporter.log("The Client radio button is visible");
	 }
	 else {
		 System.out.println("Not Found");
		 ExtentTestManager.getTest().log(LogStatus.FAIL, "Radiobutton not found");
	 }
	 //clickElement(signup_button);
	 
	  
  }
  
  @AfterTest
  public void closeBrowser() {
	  
	  driver.close();
	  
  }
}
 