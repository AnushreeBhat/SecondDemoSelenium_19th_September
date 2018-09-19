package com.demoSeleniumPlus.Day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;

public class KeyEventsWithActionClass {

	WebDriver driver;
	String browser="chrome";
	
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("http://drikpanchang.com");
	}
	@Test
	public void test() throws InterruptedException, AWTException {
//		Actions mouse = new Actions(driver);
//		WebElement uname = driver.findElement(By.name("username"));
//		mouse.moveToElement(uname).click().keyDown(uname,Keys.SHIFT).sendKeys(uname,"anu").keyUp(uname,Keys.SHIFT).perform();
//		
//		Thread.sleep(2000);
		WebElement panchang = driver.findElement(By.xpath("//*[@id=\"dpMenuId\"]/li[3]/a"));	
		Actions a =new Actions(driver);
		
		a.moveToElement(panchang).contextClick().perform();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		//for copy paste
//		robo.keyPress(KeyEvent.VK_CONTROL);
//		robo.keyPress(KeyEvent.VK_V);
		
	}
}