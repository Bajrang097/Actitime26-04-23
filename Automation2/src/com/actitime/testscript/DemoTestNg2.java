package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNg2 {
	@Test
	public void createCustomer()
	{
		Reporter.log("CreateCustomer", true);
		
	}
	@Test(priority = 1,dependsOnMethods = "deleteCustomer")
	public void modifyCustomer() {
		Reporter.log("ModifyCustomer", true);
	}
	@Test(priority=2,dependsOnMethods = "createCustomer")
	public void deleteCustomer() {
		Reporter.log("DeleteCustomer", true);
	}

}
