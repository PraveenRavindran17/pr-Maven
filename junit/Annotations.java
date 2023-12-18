package org.junit;



import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Annotations {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void browserLaunch() {
		 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		}
	
	@Before
	public void startTime() {
		Date d =new Date();
		System.out.println(d);

	}
	@After
	public void endTime() {
		Date d =new Date();
		System.out.println(d);

	}

	@Test
	public void loginPage() {
		driver.findElement(By.id("username")).sendKeys("Naveen071");
		driver.findElement(By.id("password")).sendKeys("Naveen222307");
		driver.findElement(By.id("login")).click();
		
	}
	@AfterClass
		public static void QuitBrowser() {
		driver.quit();

		}

	
}
