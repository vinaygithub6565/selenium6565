package com.coinlancerProjectSpecificCommon;

import com.commonLibraries.Base;
import com.commonLibraries.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;
import static com.commonLibraries.Locators.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

public class CommonProject extends Base {

	public static void login(String userType, String userName, String password) throws InterruptedException {

		if ((userType.equalsIgnoreCase("Client")) || (userType.equalsIgnoreCase("client"))) {
			driver.get("http://13.127.90.210/login");
			driver.findElement(Client_RadioButton).click();
			driver.findElement(Username_Textbox).sendKeys(userName);
			driver.findElement(Password_Textbox).sendKeys(password);
			driver.findElement(Login_Button).click();
		}
		if ((userType.equalsIgnoreCase("Freelancer")) || (userType.equalsIgnoreCase("freelancer"))) {
			driver.get("http://13.127.90.210/login");
			driver.findElement(Freelancer_RadioButton).click();
			driver.findElement(Username_Textbox).sendKeys(userName);
			driver.findElement(Password_Textbox).sendKeys(password);
			driver.findElement(Login_Button).click();
		}

		Thread.sleep(3000);

		boolean editprofilebutton = driver.findElement(EditProfile_Button).isDisplayed();

		if (editprofilebutton == true) {

			ExtentTestManager.getTest().log(LogStatus.PASS, "Login Successfull");
		}

		else {
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Login Failed");

		}
	}
}

