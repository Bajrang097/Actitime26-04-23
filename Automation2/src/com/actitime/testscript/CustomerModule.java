package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.Base;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends Base{
	@Test
	public void createCustomer() {
		Reporter.log("createCustomer", true);
		Assert.fail();
	}

}
