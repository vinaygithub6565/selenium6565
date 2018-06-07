package com.commonLibraries;

import org.openqa.selenium.By;

public class Common extends Base{
	
	public void clickElement(By locator) {
		
		driver.findElement(locator).click();
		
		
	}

}
