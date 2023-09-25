package com.obsqura.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void webLocators() {
		
		//id
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		
		//className
		
		WebElement clearfix = driver.findElement(By.className("clearfix"));
		
		//CSS Selector - tagName#id
		
		WebElement showMessageCSSselector = driver.findElement(By.cssSelector("button#button-one"));
		
		//CSS Selector - tagName.className
		
		WebElement clearfixsection = driver.findElement(By.cssSelector("section.clearfix"));
		
		//CSS Selector - tagName[attribute=value]
		
		WebElement showMessageCSSselectorAttribute = driver.findElement(By.cssSelector("button[id=button-one]"));
		
		//linkText
		
		WebElement checkBoxDemo = driver.findElement(By.linkText("Checkbox Demo"));
		
		//partialLinkText
		
		WebElement checkbox = driver.findElement(By.partialLinkText("Checkbox"));
		
		//xPath
		
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//xpath - starts-with
		
		WebElement checkBox = driver.findElement(By.xpath("//a[starts-with(@href,'check-box')]"));
		
		//xpath - text()
		
		WebElement showMessagexpath = driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		//xpath - OR and AND
		
		WebElement selectInput = driver.findElement(By.xpath("//a[text()='Select Input' and @href='select-input.php']"));
		WebElement showMsg = driver.findElement(By.xpath("//button[text()='Show Message' or @id='button-one']"));
	}
	
	public void xpathAxesMethods() {
		
		//parent
		
		WebElement enterMessage = driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div[@class='form-group']"));
		
		//child
		
		WebElement message = driver.findElement(By.xpath("//div[@class='form-group']//child::input[@id='single-input-field']"));
		
		//following
		
		WebElement twoInputField = driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		
		//preceding
		
		WebElement menu = driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		
		//ancestor
		
		WebElement singleInputField = driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='card']"));
		
		//descendant
		
		WebElement enterValueA = driver.findElement(By.xpath("//div[@class='form-group']//descendant::label"));
		
		//following-sibling
		
		WebElement message1 = driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input"));
	}

	public static void main(String[] args) {
		
		Locators locators = new Locators();
		locators.initializeBrowser();
		//locators.webLocators();
		locators.xpathAxesMethods();
		locators.driverClose();

	}

}
