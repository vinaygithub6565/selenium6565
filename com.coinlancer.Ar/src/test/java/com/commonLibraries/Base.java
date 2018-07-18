package com.commonLibraries;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.LogStatus;

public class Base {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {

	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	}
	@Parameters("browser")
	public void setup(String browser) throws Exception{

		if(browser.equalsIgnoreCase("Firefox")){

			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize(); 
		}

		else if(browser.equalsIgnoreCase("chrome")){

			System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize(); 
		
	}
	}		
	
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(Method method,ITestContext test) {
		ExtentTestManager.startTest(method.getName()).assignCategory(test.getName());
		System.out.println("Execution Started: "+method.getName());
	}
	@AfterMethod
    protected void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
        	ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
        } else {
        	ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
        }
        
        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());        
        ExtentManager.getReporter().flush();
    }
	

}
