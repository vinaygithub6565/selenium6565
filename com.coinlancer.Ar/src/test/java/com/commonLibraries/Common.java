package com.commonLibraries;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

	public static void openUrl(String url) 
	{

		driver.get(url);
	}

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
}



