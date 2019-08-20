package com.auto.junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class JunitValidationAssertionsErrorCollector {
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	@Test
	public void validate() {
		String expectedValue = "A"; // this data could be from xls or prop or txt file
		String actualValue = "B";
		System.out.println("Start Before assertEquals");
		try {
			Assert.assertEquals(expectedValue, actualValue);
		}catch(Throwable e) {
			System.out.println("some error first"+e.getMessage());
			errCol.addError(e);
		}
		System.out.println("End After assertEquals");

		System.out.println("Start Before assertTrue");
		try {
			Assert.assertTrue("Error Message second ", 1>2);
		}catch(Throwable e) {
			System.out.println("some error"+e.getMessage());
			errCol.addError(e);
		}
		System.out.println("End After assertTrue");
	}
}
