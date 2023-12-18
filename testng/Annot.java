package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Annot {

	WebDriver driver;

	@BeforeClass
	private void browserLaunch() {
		 driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	private void loginPage() {

		driver.findElement(By.id("username")).sendKeys("PraveenRavindran873");
		driver.findElement(By.id("password")).sendKeys("7548883233");
		driver.findElement(By.id("login")).click();
	}

	@AfterClass
	private void QuitBrowser() {

		driver.quit();
	}

}
