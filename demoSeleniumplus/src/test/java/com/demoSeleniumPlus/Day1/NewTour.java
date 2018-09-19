package com.demoSeleniumPlus.Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTour {
	WebDriver driver;
	String browser="chrome";
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercuryregister.php?");
	}
	@Test
	public void test() throws InterruptedException {
		
		
		
		List<WebElement> listAlllinks = driver.findElements(By.tagName("a"));
	}
		
//		@AfterMethod
//		public void closeBrowser() {
//		driver.close();
//	}


}
