package com.karthik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingId {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		//Using id 
		//to create a web element to get element by id
		WebElement id = driver.findElement(By.id("firstName"));
		id.sendKeys("Karthik");
		
		//to allow webpage to last for 5 seconds
		Thread.sleep(5000);
		//close the driver
		driver.quit();
	}

}
