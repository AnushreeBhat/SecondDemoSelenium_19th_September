package com.demoSeleniumPlus.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Panchanga {
	WebDriver driver;
	String browser="chrome";
	
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.drikpanchang.com");
	}
	@Test
	public void test() throws InterruptedException {
		WebElement panchang = driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/a"));	
		Actions a =new Actions(driver);
		
		a.moveToElement(panchang).contextClick().perform();
		
		//a.moveToElement(panchang).build().perform();
		//build is used to perform multi actions in a single go
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.partialLinkText("kannada")).click();
		
		Thread.sleep(2000);
		
	}
}
