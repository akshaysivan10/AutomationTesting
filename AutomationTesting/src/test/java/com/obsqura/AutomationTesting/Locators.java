package com.obsqura.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void webLocators() {
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		WebElement clearfix = driver.findElement(By.className("clearfix"));
		//CSS Selector - tagName#id
		WebElement showMessageCSSselector = driver.findElement(By.cssSelector("button#button-one"));
		//CSS Selector - tagName.className
		WebElement clearfixsection = driver.findElement(By.cssSelector("section.clearfix"));
		//CSS Selector - tagName[attribute=value]
		WebElement showMessageCSSselectorAttribute = driver.findElement(By.cssSelector("button[id=button-one]"));
	}
	

	public static void main(String[] args) {
		
		Locators locators = new Locators();
		locators.initializeBrowser();
		locators.webLocators();
		locators.driverClose();

	}

}
