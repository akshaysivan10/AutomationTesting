package com.obsqura.AutomationTesting;

public class NavigationCommands extends Base {
	
	public void navigation() {
		driver.navigate().to("https://www.toolsqa.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigationCommands navigationCommands = new NavigationCommands();
		navigationCommands.initializeBrowser();
		navigationCommands.navigation();
		navigationCommands.driverClose();

	}

}
