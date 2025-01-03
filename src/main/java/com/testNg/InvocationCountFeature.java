package com.testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountFeature {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Before Method===>Setup");
	}
	
	@Test(invocationCount=5)
	public void test1() {
		System.out.println("Test1");
	}
	

	@AfterMethod
	public void tearDown() {
		System.out.println("After Method===>TearDown");
	}

}
