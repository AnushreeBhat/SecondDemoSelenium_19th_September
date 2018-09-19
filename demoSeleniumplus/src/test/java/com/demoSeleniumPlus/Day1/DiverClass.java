package com.demoSeleniumPlus.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DiverClass {

//	@Test
//	public void testDriver(String browser) {
//	
//	browser=	System.setProperty("webDriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
//		
//		
//		
//		
//	}
//	@Test
//	public void testDriver1(String browser1) {
//	
//	browser1=	System.setProperty("webDriver.ie.driver","C:\\WebDrivers\\IEDriverServer.exe");
//		
//		
//		
//		
//	}
	
	
	public static WebDriver getDriver(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe" );
			return new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","C:\\WebDrivers\\IEDriverServer.exe" );
			return new FirefoxDriver();
		}
		else if(Browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver","C:\\WebDrivers\\geckodriver.exe" );
			return new InternetExplorerDriver();
		}else
			return null;
	}
	
	
}
