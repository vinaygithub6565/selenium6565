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

public class PostAproject extends Base {
	String url = "http://13.232.178.181/home";
	@Test
	public void verifypostaproject() throws IOException {
		String userName = ReadProperties.getPropValue("Username");
		String password = ReadProperties.getPropValue("Password");
		String Projecttitle = ReadProperties.getPropValue("ProjectTitle");
		String Projectdescription = ReadProperties.getPropValue("ProjectDescription");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		openUrl(url);
		getWhenVisible(Postaproject_Button);
		clickElement(Postaproject_Button);
		getWhenVisible(Client_Radiobutton);
		clickElement(Client_Radiobutton);
		enterText(Username_Textbox, userName);
		enterText(password_Textbox, password);
		clickElement(details_Login);
		clickElement(Postaproject_Button);
		enterText(ProjectTitle_Textbox,Projecttitle);
		enterText(ProjectDescription_Textbox,Projectdescription);
		

	}

}







