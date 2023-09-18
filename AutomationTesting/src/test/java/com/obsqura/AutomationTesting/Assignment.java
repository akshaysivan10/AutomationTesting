package com.obsqura.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment extends Base {

	public void locators() {

		// id

		WebElement message = driver.findElement(By.id("single-input-field"));
		WebElement yourMessage = driver.findElement(By.id("message-one"));
		WebElement enterValueA = driver.findElement(By.id("value-a"));
		WebElement enterValueB = driver.findElement(By.id("value-b"));
		WebElement getTotal = driver.findElement(By.id("button-two"));
		WebElement total = driver.findElement(By.id("message-two"));

		driver.navigate().to("https://www.amazon.in/");

		// id

		WebElement orders = driver.findElement(By.id("nav-orders"));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement address = driver.findElement(By.id("nav-global-location-popover-link"));
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		WebElement addToCart = driver.findElement(By.id("nav-cart"));
		
		//CSS Selector - tagName#id
		
		WebElement cartCSSSelector = driver.findElement(By.cssSelector("a#nav-cart"));
		WebElement ordersCSSSelector = driver.findElement(By.cssSelector("a#nav-orders"));
		WebElement allCSSSelector = driver.findElement(By.cssSelector("a#nav-hamburger-menu"));
		
		driver.navigate().to("https://www.ajio.com/");
		
		//CSS Selector - tagName.className
		
		WebElement visitAjioluxe = driver.findElement(By.cssSelector("li.visit-ajio"));
		WebElement cart = driver.findElement(By.cssSelector("div.ic-cart "));
		WebElement searchButton = driver.findElement(By.cssSelector("span.ic-search"));
		
		//CSS Selector - tagName[attribute=value]
		
	    WebElement men = driver.findElement(By.cssSelector("a[title=MEN]"));
		WebElement searchBar = driver.findElement(By.cssSelector("input[name=searchVal"));
		WebElement ajioluxe = driver.findElement(By.cssSelector("li[class=visit-ajio"));
		
		//className
		
		WebElement visitAjioluxeByClassName = driver.findElement(By.className("visit-ajio"));
		WebElement searchByClassName = driver.findElement(By.className("ic-search"));
		WebElement headerRight = driver.findElement(By.className("header-right"));
	}

	public static void main(String[] args) {
		
		Assignment assignment = new Assignment();
		assignment.initializeBrowser();
		assignment.locators();
		assignment.driverClose();
	}

}
