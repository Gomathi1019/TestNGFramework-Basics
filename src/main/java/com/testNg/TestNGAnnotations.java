package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestNGAnnotations {
	
	//PRE CONDITIONS
	@BeforeSuite
	public void Setup() {
		System.out.println("Chrome property setup");
	}
	@BeforeTest
	public void lauchBrowser() {
		System.out.println("Lauching Chrome");
	}
	@BeforeClass
	public void enterURL() {
		System.out.println("Entering url");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Login to application");
	}
	//TESTCASE
	@Test
	public void getTitle() {
		System.out.println("Title of the page is xyz");
	}
	
	//POST CONDTIONS
	@AfterMethod
	public void logout() {
		System.out.println("Logout from the application");
	}
	@AfterClass
	public void deleteAllcookies() {
		System.out.println("Deleting cookies");
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}
	@AfterSuite
	public void generateReport() {
		System.out.println("Generate HTML Reports");
	}

}
