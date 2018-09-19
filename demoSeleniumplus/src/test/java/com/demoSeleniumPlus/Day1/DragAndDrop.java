package com.demoSeleniumPlus.Day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	String browser="chrome";
	
	@BeforeMethod
	public void openBrowser() {
		driver = DiverClass.getDriver(browser);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.dhtmlx.com/docs/products/dhtmlxTree/");
	}
	@Test
	public void test() throws InterruptedException, IOException {
		WebElement src = driver.findElement(By.xpath("//*[@id=\"treebox1\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		//WebElement dest = driver.findElement(By.xpath("//*[@id=\"treebox2\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td[2]/table/tbody/tr[2]/td[2]"));
		WebElement dest = driver.findElement(By.xpath("//*//*[@id=\"treebox2\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		SnapShot.screenShot(driver, "C:\\Users\\a07208trng_b4a.04.28\\Desktop\\ss\\t.png");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Actions mouse  =new Actions(driver);
		
		mouse.dragAndDrop(src, dest).perform();
		
		Thread.sleep(2000);
		
		
		
	}
}
