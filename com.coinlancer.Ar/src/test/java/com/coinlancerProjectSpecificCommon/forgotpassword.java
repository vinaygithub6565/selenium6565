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

public class forgotpassword extends Base {
	String url = "http://13.232.178.181/home";
	@Test
	public void verifyforgotpassword() throws IOException {
		String userName = ReadProperties.getPropValue("Username");
		String password = ReadProperties.getPropValue("Password");
		String email = ReadProperties.getPropValue("forgotemail");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		openUrl(url);
		getWhenVisible(Login_Button);
		clickElement(Login_Button);
		getWhenVisible(ForgotPassword);
		clickElement(ForgotPassword);
		enterText(EnterEmail,email);
		clickElement(GeneratePassword);

		

		}

	}









