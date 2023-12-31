package com.obsqura.AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsAssignment extends Base {

	public void locators() {

		// id

		WebElement message = driver.findElement(By.id("single-input-field"));
		WebElement yourMessage = driver.findElement(By.id("message-one"));
		WebElement enterValueA = driver.findElement(By.id("value-a"));
		WebElement enterValueB = driver.findElement(By.id("value-b"));
		WebElement getTotal = driver.findElement(By.id("button-two"));
		WebElement total = driver.findElement(By.id("message-two"));

		driver.navigate().to("https://www.amazon.in/");

		WebElement orders = driver.findElement(By.id("nav-orders"));
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement address = driver.findElement(By.id("nav-global-location-popover-link"));
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		WebElement addToCart = driver.findElement(By.id("nav-cart"));
		
		//cssSelector - tagName#id
		
		WebElement cartCSSSelector = driver.findElement(By.cssSelector("a#nav-cart"));
		WebElement ordersCSSSelector = driver.findElement(By.cssSelector("a#nav-orders"));
		WebElement allCSSSelector = driver.findElement(By.cssSelector("a#nav-hamburger-menu"));
		
		driver.navigate().to("https://www.ajio.com/");
		
		//cssSelector - tagName.className
		
		WebElement visitAjioluxe = driver.findElement(By.cssSelector("li.visit-ajio"));
		WebElement cart = driver.findElement(By.cssSelector("div.ic-cart "));
		WebElement searchButton = driver.findElement(By.cssSelector("span.ic-search"));
		
		//cssSelector - tagName[attribute=value]
		
	    WebElement men = driver.findElement(By.cssSelector("a[title=MEN]"));
		WebElement searchBar = driver.findElement(By.cssSelector("input[name=searchVal"));
		WebElement ajioluxe = driver.findElement(By.cssSelector("li[class=visit-ajio"));
		
		//className
		
		WebElement visitAjioluxeByClassName = driver.findElement(By.className("visit-ajio"));
		WebElement searchByClassName = driver.findElement(By.className("ic-search"));
		WebElement headerRight = driver.findElement(By.className("header-right"));
		
		driver.navigate().to("https://demo.guru99.com/test/selenium-xpath.html");
		
		//name
		
		WebElement userid = driver.findElement(By.name("uid"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("btnLogin"));
		WebElement reset = driver.findElement(By.name("btnReset"));
		WebElement guru99Bank = driver.findElement(By.name("frmLogin"));
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		//linkText
		
		WebElement simpleFormDemo = driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkboxDemo = driver.findElement(By.linkText("Checkbox Demo"));
		WebElement radioButtonsDemo = driver.findElement(By.linkText("Radio Buttons Demo"));
		
		//partialLinkText
		
		WebElement selectInput = driver.findElement(By.partialLinkText("Select"));
		WebElement formSubmit = driver.findElement(By.partialLinkText("Form"));
		WebElement jquery = driver.findElement(By.partialLinkText("Jquery"));
		
		driver.navigate().forward();
		
		//xpath
		
		WebElement logoxpath = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		WebElement addressxpath = driver.findElement(By.xpath("//div[@id='nav-global-location-slot']"));
		WebElement allxpath = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		WebElement searchSubmitxpath = driver.findElement(By.xpath("//input[@type='submit']"));
		WebElement toolBar = driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']"));
		
		driver.navigate().forward();
		
		//xpath - contains()
		
		WebElement visitAjio = driver.findElement(By.xpath("//li[contains(@class,'visit')]"));
		WebElement cartxpath = driver.findElement(By.xpath("//div[contains(@class,'-cart')]"));
		WebElement homeAndKitchen = driver.findElement(By.xpath("//a[contains(@title,'KITCHEN')]"));
		WebElement searchxpath = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
		WebElement menu = driver.findElement(By.xpath("//div[contains(@class,'newlist')]"));
		
		driver.navigate().forward();
		
		//xpath - starts-with
		
		WebElement heading = driver.findElement(By.xpath("//h1[starts-with(@class,'thick')]"));
		WebElement mobileTesting = driver.findElement(By.xpath("//a[starts-with(@title,'Mobile')]"));
		WebElement cucumberTesting = driver.findElement(By.xpath("//a[starts-with(@title,'Cucumber')]"));
		WebElement agileTesting = driver.findElement(By.xpath("//a[starts-with(@title,'Agile')]"));
		WebElement ETLTesting = driver.findElement(By.xpath("//a[starts-with(@title,'ETL')]"));
		
		//xpath - text()
		
		WebElement bigData = driver.findElement(By.xpath("//a[text()='BigData']"));
		WebElement HBase = driver.findElement(By.xpath("//a[text()='HBase']"));
		WebElement mongoDB = driver.findElement(By.xpath("//a[text()='MongoDB']"));
		WebElement hive = driver.findElement(By.xpath("//a[text()='Hive']"));
		WebElement cassandra = driver.findElement(By.xpath("//a[text()='Cassandra']"));
		
		//xpath - AND
		
		WebElement userIdxpath = driver.findElement(By.xpath("//input[@type='text' and @name='uid']"));
		WebElement passwordxpath = driver.findElement(By.xpath("//input[contains(@onkeyup,'validate') and @name='password']"));
		WebElement loginxpath = driver.findElement(By.xpath("//input[starts-with(@name,'btn') and @type='submit']"));
		WebElement resetxpath = driver.findElement(By.xpath("//input[@type='reset' and @value='RESET']"));
		WebElement guru99Bankxpath = driver.findElement(By.xpath("//h2[text()='Guru99 Bank' and @class='barone']"));
		
		//xpath - OR
		
		WebElement liveTestingProject = driver.findElement(By.xpath("//a[contains(@title,'nil') or @href='/live-testing-project.html']"));
		WebElement liveSeleniumProject = driver.findElement(By.xpath("//a[text()='Live Selenium Project' or @href='/live-selenium-project.html']"));
		WebElement guru99Logo = driver.findElement(By.xpath("//img[starts-with(@alt,'Guru99') or role='presentation']"));
		WebElement tutorialsLibrary = driver.findElement(By.xpath("//h1[text()='Tutorials Library' or @class='thick-heading']"));
		WebElement navBar = driver.findElement(By.xpath("//nav[@role='navigation' or contains(@class,'nav')]"));
		
		//xpath - parent
		
		WebElement python = driver.findElement(By.xpath("//a[@href='/python-tutorials.html']//parent::div[@class='canvas-middle']"));
		WebElement java = driver.findElement(By.xpath("//a[@href='/java-tutorial.html']//parent::div[@class='canvas-middle']"));
		WebElement ethicalHacking = driver.findElement(By.xpath("//a[@href='/ethical-hacking-tutorials.html']//parent::div[@class='canvas-middle']"));
		
		//xpath - child
		
		WebElement javaWeb = driver.findElement(By.xpath("//li[@style='width:100%;']//child::a[@href='/java-tutorial.html']"));
		WebElement pythonWeb = driver.findElement(By.xpath("//li[@style='width:100%;']//child::a[@href='/python-tutorials.html']"));
		WebElement hpalm = driver.findElement(By.xpath("//li[@style='width:100%;']//child::a[@href='/hp-alm-free-tutorial.html']"));
		
		//xpath - following
		
		WebElement excelTutorial = driver.findElement(By.xpath("//ul[@class='menu']//following::a[starts-with(@title,'Excel')]"));
		WebElement junit = driver.findElement(By.xpath("//div[@class='col-md-3']//following::a[text()='JUnit']"));
		WebElement selenium = driver.findElement(By.xpath("//ul[@id='java_technologies']//following::a[@title='Selenium']"));
		
		//xpath - preceding
		
		WebElement soapUI = driver.findElement(By.xpath("//a[starts-with(@title,'Agile')]//preceding::a[text()='SoapUI']"));
		WebElement performanceTesting = driver.findElement(By.xpath("//a[@href='/jmeter-tutorials.html']//preceding::b[text()='Performance Testing']"));
		WebElement sapmm = driver.findElement(By.xpath("//a[starts-with(@title,'SAP')]//preceding::a[text()='SAP MM']"));
		
		//xpath - ancestor
		
		WebElement guru99BankLoginModule = driver.findElement(By.xpath("//input[@name='uid']//ancestor::form[@name='frmLogin']"));
		WebElement courseSection = driver.findElement(By.xpath("//div[@class='canvas-middle']//ancestor::section[@id='g-utility']"));
		WebElement topBanner = driver.findElement(By.xpath("//td[@style='text-align:center;']//ancestor::div[contains(@class,'top-banner')]"));
		
		//xpath - descendant
		
		WebElement bigDataCourse = driver.findElement(By.xpath("//div[@class='g-grid']//descendant::a[text()='Big Data']"));
		WebElement linuxCourse = driver.findElement(By.xpath("//div[@class='g-container']//descendant::a[text()='Linux']"));
		WebElement informatica = driver.findElement(By.xpath("//section[@id='g-utility']//descendant::a[text()='Informatica']"));
		
		//xpath - following-sibling
		
		WebElement useridText = driver.findElement(By.xpath("//input[@name='uid']//following-sibling::label"));
		WebElement passwordText = driver.findElement(By.xpath("//input[@type='password']//following-sibling::label"));
		WebElement resetButton = driver.findElement(By.xpath("//input[@value='LOGIN']//following-sibling::input"));
	}

	public static void main(String[] args) {
		
		LocatorsAssignment assignment = new LocatorsAssignment();
		assignment.initializeBrowser();
		assignment.locators();
		assignment.driverClose();
	}

}
