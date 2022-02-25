package com.karthik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		//to create a web element to get element by TagName
		WebElement tagname = driver.findElement(By.tagName("input"));
		tagname.sendKeys("karthik");
		
		//to allow webpage to last for 5 seconds
		Thread.sleep(5000);
		//close the driver
		driver.quit();
	}

}
