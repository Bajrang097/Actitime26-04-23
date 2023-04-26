package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {
	static {
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
public void openBrowser() {
		Reporter.log("OpenBrowser", true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	
}

@AfterClass
public void closeBrowser() {
	Reporter.log("CloseBrowser", true);
	driver.close();
	
}
@BeforeMethod
public void login()
{
	Reporter.log("Login", true);
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
}
@AfterMethod
public void logout() {
	Reporter.log("Logout", true);
	driver.findElement(By.id("logoutLink")).click();
	
}
}
