package com.demoSeleniumPlus.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UseDriverClass {

	WebDriver driver;
	String browser="chrome";
	
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8083/TestMeApp2.2/");
	}
	@Test
	public void test() {
		System.out.println(("checking the test"));
	}
		
		@AfterMethod
		public void closeBrowser() {
		driver.close();
	}
	
}
