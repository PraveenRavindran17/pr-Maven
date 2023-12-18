package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ac {
	WebDriver driver;

	@BeforeClass
	private void browserLaunch() {
		 driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	
	@Test
	private void loginPage() {

		driver.findElement(By.id("username")).sendKeys("Naveen071");
		driver.findElement(By.id("password")).sendKeys("Naveen222307");
		driver.findElement(By.id("login")).click();
	}

	@AfterClass
	private void QuitBrowser() {

		driver.quit();
	}

}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


