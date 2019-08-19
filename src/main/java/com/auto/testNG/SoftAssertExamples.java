package com.auto.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExamples {
	@Test
	public void search() {
		System.out.println("Before Soft Assert");
		SoftAssert softAssert = new SoftAssert();
//		Assert.fail();// normal assert
		softAssert.assertEquals("A", "B"); //fail
		softAssert.assertEquals("A", "A"); //pass
		softAssert.assertEquals("X", "H"); //fail
		softAssert.assertEquals("E", "B"); //fail
		System.out.println("After Soft Assert");
		softAssert.assertAll();// this line should be put at the end in order to execute all the above lines of code even if it failed
	}
}