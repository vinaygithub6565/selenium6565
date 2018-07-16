package com.coinlancerProjectSpecificCommon;
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


public class Login extends Base
{
	@Test
	 public static void Login()throws IOException {
		String username = ReadProperties.getPropValue("Username");
			String password = ReadProperties.getPropValue("Password");
			String url = ReadProperties.getPropValue("url");
			driver.get("http://13.127.90.210");
			
			
			

		}

	}

	
	
	
   