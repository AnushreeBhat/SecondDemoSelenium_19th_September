package com.demoSeleniumPlus.Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Annotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
     @BeforeClass
	public void startServer() {
		System.out.println("Start server");
	}
	@AfterClass
	public void closeServer() {
		System.out.println("close Server");
	}
	
	@Test(priority=1,enabled=false)
	
	public void testCase() {
		System.out.println("my first testcase");
	}
	@Test(priority=1)
	
	public void testCase2() {
	System.out.println("second");	
	}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("my first beforemethod");
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("my first aftermethod");
	}
	
}
