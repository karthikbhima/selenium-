package com.karthik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form"); 
		//to create a web element to get element by css selector with id
		WebElement id = driver.findElement(By.cssSelector("#firstName"));
		id.sendKeys("Karthik");
		
		//to create a web element to get element by css selector with class
		WebElement cls = driver.findElement(By.cssSelector(".mr-sm-2.form-control#lastName"));
		cls.sendKeys("bhima");
		
		//to create a web element to get element by css selector with tag 
		WebElement email = driver.findElement(By.cssSelector("input#userEmail"));
		email.sendKeys("Karthikbhima12@gmail.com");
		
		
		
		//to allow webpage to last for 5 seconds
		Thread.sleep(5000);
		//close the driver
		driver.quit();

	}

}
