package com.obsqura.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base{
	
	public void checkBoxCommands() {
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckBoxClick = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckBoxClick.click();
		boolean isCheckBoxButtonSelected = singleCheckBoxClick.isSelected();
	}
	
	public static void main(String[] args) {
		
		CheckBox checkBox = new CheckBox();
		checkBox.initializeBrowser();
		checkBox.checkBoxCommands();
		checkBox.driverClose();
	}

}
