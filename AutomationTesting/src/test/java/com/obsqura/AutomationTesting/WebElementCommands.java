package com.obsqura.AutomationTesting;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {

	public void webElementCommands() {

		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageButtonClass = showMessageButton.getAttribute("class");
		String showMessageButtonBackgroundColor = showMessageButton.getCssValue("background-color");
		int heightOfShowMessageButton = showMessageButton.getSize().getHeight();
		int widthOfShowMessageButton = showMessageButton.getSize().getWidth();
		int xaxisOfShowMessageButton = showMessageButton.getLocation().getX();
		int yaxisOfShowMessageButton = showMessageButton.getLocation().getY();
		WebElement singleInputTextField = driver.findElement(By.id("single-input-field"));
		int yaxisOfSingleInputField = singleInputTextField.getLocation().getY();
	}
	
	public void verifyTheYourMessageTextOfSingleInputField() {

		String input = "Obsqura";
		WebElement singleInputTextField = driver.findElement(By.id("single-input-field"));
		singleInputTextField.sendKeys(input);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String yourMessageText = yourMessage.getText();
		String expectedMessage = "Your Message : " + input;
		
		if (yourMessageText.equals(expectedMessage)) {
			System.out.println("Test Passed");
		} else
			System.out.println("Test Failed");
	}

	public void verifyFontColorOfShowMessageButton() {
		
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageButtonFontColor = showMessageButton.getCssValue("color");
		if(showMessageButtonFontColor.equals("rgba(255, 255, 255, 1)")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

	public void verifyFontWeightOfGetTotalButton() {
		
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String getTotalButtonFontWeight = getTotalButton.getCssValue("font-weight");
		if(getTotalButtonFontWeight.equals("400")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

	public static void main(String[] args) {
		WebElementCommands webelementcommands = new WebElementCommands();
		webelementcommands.initializeBrowser();
		//webelementcommands.webElementCommands();
		webelementcommands.verifyTheYourMessageTextOfSingleInputField();
		webelementcommands.driverClose();

	}

}
