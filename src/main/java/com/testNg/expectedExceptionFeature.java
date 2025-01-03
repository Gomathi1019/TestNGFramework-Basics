package com.testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class expectedExceptionFeature {
	
	@BeforeMethod
	public void setup() {
		System.out.println("Before Method===>Setup");
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void test1() {
		System.out.println("Test1");
		int x=8/0;//throw an exception
	}
	

	@AfterMethod
	public void tearDown() {
		System.out.println("After Method===>TearDown");
	}

}
