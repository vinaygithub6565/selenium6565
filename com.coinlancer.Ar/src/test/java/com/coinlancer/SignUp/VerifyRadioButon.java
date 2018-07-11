package com.coinlancer.SignUp;

import java.io.IOException;
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
import static com.coinlancerProjectSpecificCommon.CommonProject.*;


public class VerifyRadioButon extends Base 
{



	@Test
	public static void verifyRadioButton() throws IOException
	{
		String username = ReadProperties.getPropValue("Username");
		String password = ReadProperties.getPropValue("Password");
		String url = ReadProperties.getPropValue("url");
		//System.setProperty("webdriver.chrome.driver", "E:\\automation1\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://13.127.90.210/login");
		RadioButton("freelancer",username,password);
		openUrl(url);
		getWhenVisible(SignUp_Button);
		clickElement(SignUp_Button);
		getWhenVisible(Client_RadioButton);
		clickElement(Client_RadioButton);
		String firstName = randomFirstNameGenerator();
		enterText(FirstName_Textbox, firstName);
		String lastName = randomLastNameGenerator();
		enterText(LastName_Textbox, lastName);
		String userName = randomUserNameGenerator();
		enterText(UserName_Textbox, userName);
		enterText(password_Textbox, password);
		enterText(confirmpassword_Textbox, password);
		String email = randomEmailNameGenerator();
		enterText(email_Textbox, email);
		clickElement(Register_button);

		boolean loginPage = isElementPresent(Username_Textbox);

		if(loginPage==true){

			ExtentTestManager.getTest().log(LogStatus.PASS, "User Created Successfully");
		}
		else{
			ExtentTestManager.getTest().log(LogStatus.FAIL, "User Creation Failed");

		}

	}







}









