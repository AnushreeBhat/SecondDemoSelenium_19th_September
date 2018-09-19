package com.demoSeleniumPlus.Day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LICpolicy {

	WebDriver driver;
	String browser="chrome";
	
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.licindia.com");
	}
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"socialThings2\"]/ul/li[1]/a/img")).click();
		
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> it =s.iterator();
		String mWind = it.next();
		String faceB = it.next();
		
		
		
		driver.switchTo().window(faceB);
		Thread.sleep(2000);
		
	 //driver.switchTo().defaultContent();
	 //driver.switchTo().window(mWind);
	 //driver.close();
//		HashSet<Object>  s= new HashSet<Object>();
//		s.add("A");
//		s.add("C");
//		s.add("C");
//		s.add("A");
//		
//		System.out.println(s.size());
//		
//		Iterator<Object> it= s.iterator();
//		
//		System.out.println(it.next());
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
		
	}
	
	

}
