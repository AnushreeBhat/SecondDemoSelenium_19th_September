package com.demoSeleniumPlus.Day1;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	 
	import java.awt.*;
	import java.awt.datatransfer.Clipboard;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;
	import java.util.concurrent.TimeUnit;
	 
	public class FileUpload {
	 
	    public WebDriver driver;
	    public WebDriverWait wait;
	    private static String filePath = System.getProperty("C:\\Users\\a07208trng_b4a.04.28\\test.PNG");
	 
	    @BeforeMethod
	    public void setup () {
	        driver = new ChromeDriver();
	        driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
	        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	        wait = new WebDriverWait(driver,10);
	        driver.manage().window().maximize();
	    }
	 
	    @Test
	    public void robotTest () throws InterruptedException {
	        //Click Image Upload
	        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-success.fileinput-button")));
	        driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
	        uploadFileWithRobot(filePath);
        Assert.assertTrue(wait.until(ExpectedConditions.elementToBeClickable
                (By.cssSelector(".name"))).getText().equals("test.PNG"));
	        //I added sleep to see the result with my eyes. If you want you can remove below line.
	        Thread.sleep(2000);
	    }
	 
//	    @AfterMethod
//	    public void teardown () {
//	        driver.quit();
//	    }
	 
	    //File upload by Robot Class
	    public void uploadFileWithRobot (String filePath) {
	        StringSelection stringSelection = new StringSelection(filePath);
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(stringSelection, null);
	 
	        Robot robot = null;
	 
	        try {
	            robot = new Robot();
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }
	 
	        robot.delay(250);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	        robot.keyPress(KeyEvent.VK_T);
	       
	        robot.keyRelease(KeyEvent.VK_T);
	        
	        robot.keyPress(KeyEvent.VK_E);
		       
	        robot.keyRelease(KeyEvent.VK_E);
	        robot.keyPress(KeyEvent.VK_S);
		       
	        robot.keyRelease(KeyEvent.VK_S);
	        robot.keyPress(KeyEvent.VK_T);
		       
	        robot.keyRelease(KeyEvent.VK_T);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.delay(150);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	    }
	}

