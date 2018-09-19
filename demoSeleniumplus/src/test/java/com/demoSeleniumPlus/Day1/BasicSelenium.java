package com.demoSeleniumPlus.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class BasicSelenium extends DiverClass{

	//public static void main(String args[]) throws InterruptedException {
	    @Test
	    
		public void testCases() throws InterruptedException{
		//step 1:set system property
		
		//System.setProperty("webDriver.chrome.driver","C:\\WebDrivers\\chromedriver.exe");
		
		//step 2:launch the browser
		//create driver object
		
		WebDriver driver = new ChromeDriver();
		
		//launch the URL
		
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.close();
	}
	
}