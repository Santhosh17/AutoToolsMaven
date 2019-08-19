package com.auto.testNG;

import org.testng.annotations.Test;

public class SearchAndBuyTest {
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
	}
	
	@Test
	public void checkoutCart() {
		System.out.println("Checkout items ...");
	}
}