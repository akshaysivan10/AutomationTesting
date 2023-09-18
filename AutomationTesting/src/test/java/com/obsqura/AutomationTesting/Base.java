package com.obsqura.AutomationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	public void initializeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Eclipse\\AutomationTesting\\src\\main\\java\\com\\obsqura\\AutomationTesting\\Resource\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
	}

	public void driverClose() {
		//driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		Base base = new Base();
		base.initializeBrowser();
		base.driverClose();

	}

}
