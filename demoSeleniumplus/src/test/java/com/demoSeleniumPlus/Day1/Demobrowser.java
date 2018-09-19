package com.demoSeleniumPlus.Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demobrowser {
	
	
	WebDriver driver;
	String browser="chrome";
	
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/?affid=nareshbha7&affExtParam1=camp1_mail2839_direct_link");
	}
	@Test
	public void test() throws InterruptedException {
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		//driver.findElement(By.className("O8ZS_U")).sendKeys("handbag");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//		//Thread.sleep(2000);
//		WebElement searchBox =  driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[1]/div/input"));
//		//Thread.sleep(2000);
//		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[2]/form/div/div[2]/button"));
//		//Thread.sleep(2000);
//		searchBox.sendKeys("handbag");
//		Thread.sleep(2000);
//		searchButton.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		searchBox.sendKeys("sandles");
//		Thread.sleep(2000);
//		searchButton.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		List<WebElement> listAlllinks = driver.findElements(By.tagName("a"));
		
		System.out.println(listAlllinks.size());
		for( int i =0;i<listAlllinks.size();i++) {
			if((!listAlllinks.get(i).getText().equals(""))) {
		 System.out.println(listAlllinks.get(i).getText());}
	}
	}
//		@AfterMethod
//		public void closeBrowser() {
//		driver.close();
//	}

}
