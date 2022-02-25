package com.karthik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://moodle.kluniversity.in/login/index.php");
		//to create a web element to get element by xpath
		WebElement xpath = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		xpath.sendKeys("Karthik bhima");
		
		//to allow webpage to last for 5 seconds
		Thread.sleep(5000);
		//close the driver
		driver.quit();

	}

}
