package com.auto.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
// run test parameterized

//step 1
@RunWith(Parameterized.class)
public class JunitTestParameterized {
	// step 2
	String username;
	String password;
	String browser;

	// step 3
	// build a constructor
	public JunitTestParameterized(String username, String password,String browser) {
		this.username = username;
		this.password = password;
		this.browser = browser;
	}

	@Test
	public void loginTest() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(browser);
	}
	@Test
	public void loginTest1() {
		System.out.println("logintest1");
	}

	// step4
	@Parameters
	public static Collection<Object[]> getData() {
		Object[][] data = new Object[4][3];
		// 1st row
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "Mozilla";

		// 2nd row
		data[1][0] = "U2";
		data[1][1] = "P2";
		data[1][2] = "Chrome";

		// 3nd row
		data[2][0] = "U3";
		data[2][1] = "P3";
		data[2][2] = "InternetExplorer";

		// 4th row
		data[3][0] = "U4";
		data[3][1] = "P4";
		data[3][2] = "Opera";
		
		return Arrays.asList(data);
	}
}
