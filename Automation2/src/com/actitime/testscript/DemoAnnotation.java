package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoAnnotation {
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("OpenBrowser",true );
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("CloseBrowser",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout", true);
	}
	@Test(priority=1,invocationCount = 2)
	public void editCustomer() {
		Reporter.log("EditCustomer", true);
	}
	@Test
	public void registerCustomer()
	{
		Reporter.log("RegisterCustomer", true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("DeleteCustomer", true);
	}

}
