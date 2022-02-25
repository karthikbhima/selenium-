package com.karthik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://moodle.kluniversity.in/login/index.php");
		//Using id 
		//to create a web element to get element by name
		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("180030592");
		
		//to allow webpage to last for 5 seconds
		Thread.sleep(5000);
		//close the driver
		driver.quit();
	}

}
