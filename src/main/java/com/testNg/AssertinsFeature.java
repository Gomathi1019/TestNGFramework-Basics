package com.testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertinsFeature {
WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webriver.chorme.driver","C:\\Chromedriver\\chrome-win64\\chrome-win64\\chrome.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void logoTest() {

		System.out.println(driver.getCurrentUrl());
		boolean b=driver.findElement(By.id("gh-logo")).isDisplayed();
		Assert.assertTrue(b);//Assert.assertEquals(b,true);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
