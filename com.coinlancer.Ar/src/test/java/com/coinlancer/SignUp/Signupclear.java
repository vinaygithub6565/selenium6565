package com.coinlancer.SignUp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
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

public class Signupclear extends Base {

	String url= "http://13.127.90.210/login";

	@Test
	public void verifyclearButton() throws IOException { 

		String password = ReadProperties.getPropValue("password");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		openUrl(url);
		getWhenVisible(SignUp_Button);
		clickElement(SignUp_Button);
		getWhenVisible(Freelancer_RadioButton);
		clickElement(Freelancer_RadioButton);
		String firstName = randomFirstNameGenerator();
		enterText(FirstName_Textbox, firstName);
		String lastName = randomLastNameGenerator();
		enterText(LastName_Textbox, lastName);
		String userName = randomUserNameGenerator();
		enterText(UserName_Textbox, userName);
		String password1 = randomUserPasswordGenerator();
		enterText(password_Textbox, password1);
		enterText(confirmpassword_Textbox, password1);
		String email = randomEmailNameGenerator();
		enterText(email_Textbox, email);
		clickElement(clear_Button);


	}




}













