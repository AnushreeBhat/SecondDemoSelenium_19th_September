package com.demoSeleniumPlus.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertWork {
	WebDriver driver;
	String browser="chrome";
	
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.goibibo.com");
	}
	@Test
	public void test() throws InterruptedException {
	/*driver.findElement(By.name("proceed")).click();
	Alert a=driver.switchTo().alert();
	
	String aletMsg = a.getText();
	System.out.println(aletMsg);
	
	a.accept();
	
	//a.dismiss();*/
		
		
		 driver.findElement(By.id("get_sign_in")).click();
		
		WebElement frameID = driver.findElement(By.id("authiframe"));
		driver.switchTo().frame(frameID);
		driver.findElement(By.id("authMobile")).sendKeys("1234569");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"authOverlay\"]/div/a")).click();
		Thread.sleep(2000);
		
	}
	
	
//	@AfterMethod
//	public void closeBrowser() {
//	driver.close();
//}

}
