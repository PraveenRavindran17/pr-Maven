package org.junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Annos {
	static WebDriver driver;
	
	@Test
	public void browserLaunch() {
		
		 driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("Naveen071");
		driver.findElement(By.id("password")).sendKeys("Naveen222307");
		driver.findElement(By.id("login")).click();
		driver.quit();

		
		

	}
	
	
	
	
	
	
	
	
	

}
