package com.testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupskeyword {
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
	
	@Test(priority=3,groups="LogoTesting")
	public void logoTest() {
		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("gh-logo")).isDisplayed();
		}
	
	@Test(priority=4,groups="Catagorys")
	public void selectItems() throws InterruptedException {
		Select s=new Select(driver.findElement(By.id("gh-cat")));
		s.selectByVisibleText("Books");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
	}
	
	@Test(priority=2,groups="Initial")
	public void registerTest() {
		driver.findElement(By.linkText("register")).isDisplayed();
	}
	
	@Test(priority=1,groups="Initial")
	public void loginTest() {
		driver.findElement(By.linkText("Sign in")).isDisplayed();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
