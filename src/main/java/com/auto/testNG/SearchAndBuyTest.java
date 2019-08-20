package com.auto.testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyTest {
	
	// Generally when TC are executed they execute according to alphabetical order.
	@Test
	public void search() {
		System.out.println("Searching Item...");
	}
	
	@Test
	public void addToCart() {
		System.out.println("Adding Item to Cart...");
	}
	
	@Test
	public void makePayment() {
		System.out.println("Making Payments to items in Cart...");
		throw new SkipException("Any Reason");
	}
	
	@Test (dependsOnMethods = ("makePayment")) // if we depend on a script which has skip exeption then this tc would also be skipped
	public void checkoutCart() {
		System.out.println("Checkout items ...");
	}
}