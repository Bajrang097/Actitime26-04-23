package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
	}
	@Test
	public void verifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String aTitle = driver.getTitle();
		String eTitle = "soogle";
//		if(aTitle.equals(eTitle))
//			System.out.println("equal and pass");
//		else
//			System.out.println("not equal and failed");
//		driver.close();
		
		
		
//		Assert.assertEquals(aTitle, eTitle);
//		driver.close();
//	
		
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		driver.close();
	   s.assertAll();
		}
	
	}


