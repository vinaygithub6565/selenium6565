package com.coinlancerProjectSpecificCommon;

import com.commonLibraries.Base;
import com.commonLibraries.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

import static com.commonLibraries.Locators.*;

public class CommonProject extends Base {
	
	public static void login(String userType,String userName, String password) {
		if((userType.equalsIgnoreCase("Client"))||(userType.equalsIgnoreCase("client"))) {
		
		driver.findElement(ClientRadio).click();
		driver.findElement(Username_Textbox).sendKeys(userName);
		driver.findElement(Password_Textbox).sendKeys(password);
		driver.findElement(Login_Button).click();
		boolean editprofilebutton = driver.findElement(EditProfile_Button).isDisplayed();
		if(editprofilebutton==true) {
			
			System.out.println("Login Successfull");
		}
		
		else {
			System.out.println("Login Failed");
		}
	}
		if((userType.equalsIgnoreCase("Freelancer"))||(userType.equalsIgnoreCase("freelancer"))) {
			driver.findElement(FreelancerRadio).click();
			driver.findElement(Username_Textbox).sendKeys(userName);
			driver.findElement(Password_Textbox).sendKeys(password);
			driver.findElement(Login_Button).click();
			boolean editprofilebutton = driver.findElement(EditProfile_Button).isDisplayed();
			if(editprofilebutton==true) {
				
				System.out.println("Login Successfull");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Login Successfull");
			}
			
			else {
				System.out.println("Login Failed");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Login Failed");
			}
			
		}
	}

}
