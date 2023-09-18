package com.obsqura.AutomationTesting;

public class BrowserCommands extends Base {
	
	public void browserCommands() {
		String url = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
		String title = driver.getTitle();
	}

	public static void main(String[] args) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.browserCommands();
		browsercommands.driverClose();

	}

}
