package com.commonLibraries;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common extends Base{



	public static void clickElement(By locator) {

		driver.findElement(locator).click();
	}
	public static void enterText(By locator, String text){

		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}
	public static String verifyText(By locator) {


		String textFound = driver.findElement(locator).getText();

		return textFound;
	}

	public static boolean verifyElement(By locator) 
	{

		if(driver.findElement(locator).isDisplayed()) {
			return true;
		}
		else {
			return false;
		}


	}
	public static String verifyTitle(By locator) {
		String actualTitle = driver.getTitle();
		return actualTitle;

	}

	public static void explicitwait(By locator) 
	{ 
 
		WebDriverWait wait=new WebDriverWait(driver,60);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static void screenShot() throws IOException, InterruptedException {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());
		File dest = new File("E:\\Selenium Reports\\screenshots" + filename);
		FileUtils.copyFile(scr, dest);
	}

	public static void scrollElement(By locator) 
	{
		WebElement element = driver.findElement(By.id("id_of_element"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	} 

	public static void singleDropdown(By locator) {
		Select oSelect = new Select(driver.findElement(By.id("yy_date_8")));
		List <WebElement> elementCount = oSelect.getOptions();
		System.out.println(elementCount.size());
	}

	public static void alert(By locator) {
		Alert alert = driver.switchTo().alert();
		alert.getText();

	}


	public static String randomFirstNameGenerator(By locator) {
		String uuid = UUID.randomUUID().toString();
		driver.findElement(By.id("text box id")).sendKeys(uuid);
		return null;
	}



	public static boolean isElementPresent(By locator) {

		boolean b = driver.findElement(locator).isDisplayed();

		if (b == true) {
			return true;
		}

		else {
			return false;
		}

	}


	public static void openUrl(String url) 
	{

		driver.get(url);
	}


	public static void getWhenVisible(By locator) {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void getTextOfalert(By locator) {
		Alert alert = driver.switchTo().alert();
		alert.getText();

	}

	public static String randomFirstNameGenerator() {
		String generatedString = "FirstName " + RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public static String randomLastNameGenerator() {
		String generatedString = "LastName" + RandomStringUtils.randomAlphabetic(5);

		return generatedString;
	}

	public static String randomUserNameGenerator() {
		Random rand = new Random();
		int rand1 = rand.nextInt(10000);

		String userName = "UserName" + rand1;
		return userName;
	}
	
	public static String randomUserPasswordGenerator() {
		Random rand = new Random();
		int rand1 = rand.nextInt(10000);
		String password = "UserPassword" + rand1 + "Vin@y6565";
		return password;
		
		
	}

	public static String randomEmailNameGenerator() {
		Random rand = new Random();
		int rand1 = rand.nextInt(10000);

		String emailID = "email" + rand1 + "@yopmail.com";
		return emailID;
	}

	public static String randomProjectGenerator() {
		Random rand = new Random();
		int rand1 = rand.nextInt(10000);

		String projectTitle = "AutomationProject " + rand1;
		return projectTitle;
	}

	public static List<String> getSkills(String args[]) {

		List al = Arrays.asList(args);
		return al;

	}

}











