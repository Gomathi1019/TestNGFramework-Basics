package com.testNg;

import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationWithSelenium {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		System.setProperty("webriver.chorme.driver","C:\\Chromedriver\\chrome-win64\\chrome-win64\\chrome.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.amazon.in/");
		
		
		
	}
	@Test
	public void getTitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
