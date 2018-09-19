package com.demoSeleniumPlus.Day1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Naukari {
	WebDriver driver;
	String browser="chrome";
	
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.naukri.com");
	}
	@Test
	public void test() throws InterruptedException {
		String mWid = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> s = driver.getWindowHandles();
		
		for(String x:s)
		{
			if(!x.equals(mWid))
			{
				driver.switchTo().window(x);
				driver.close();
			}
		}
		driver.switchTo().window(mWid);
		Thread.sleep(2000);
		
		
		
	}
}
