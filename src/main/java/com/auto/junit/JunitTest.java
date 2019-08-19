package com.auto.junit;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
public class JunitTest {
	
	@Test
	public void runcar() {
		System.out.println("Running runcar method");
	}
	
	@Test
	public void stopcar() {
		System.out.println("Running stop method");
	}
	
	@Ignore // controlling the execution flow using annotation
	@Test
	public void horncar() {
		System.out.println("Running horn method");
	}
	
	@Test
	public void brakecar() {
		Assume.assumeTrue(false);// programmatically controlling the execution flow 
		System.out.println("Running brake method");
	}
	
	
}
