package com.coinlancerProjectSpecificCommon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.commonLibraries.Base;
import com.commonLibraries.ExtentTestManager;
import com.commonLibraries.ReadProperties;
import com.relevantcodes.extentreports.LogStatus;
import static com.commonLibraries.Locators.*;
import static com.commonLibraries.Common.*;
import static com.coinlancerProjectSpecificCommon.CommonProject.*;
@Listeners(com.commonLibraries.Listener.class)

public class Login extends Base
{
	String url = "http://13.127.90.210/register";
	
			
	@Test
	public void verifyLogin() throws IOException {
		String userName = ReadProperties.getPropValue("Username");
		String password = ReadProperties.getPropValue("Password");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		openUrl(url);
		getWhenVisible(Login_Button);
		clickElement(Login_Button);
		getWhenVisible(Client_Radiobutton);
		clickElement(Client_Radiobutton);
        enterText(Username_Textbox, userName);
		enterText(password_Textbox, password);
		clickElement(details_Login);
		
		
		boolean registerPage = isElementPresent(Username_Textbox);

		if(registerPage==true){

			ExtentTestManager.getTest().log(LogStatus.PASS, "User Created Successfully");
		}
		else{
			ExtentTestManager.getTest().log(LogStatus.FAIL, "User Creation Failed");

		}

	}


	}

		
			
			

		

	

	
	
	
   