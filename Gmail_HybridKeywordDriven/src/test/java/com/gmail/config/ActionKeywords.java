package com.gmail.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {

	public static WebDriver driver;
	
	public static void openBrowser(String object, String input) {
	
		driver = new FirefoxDriver();
	}

	public static void waitFor(String object, String input) throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void navigate(String object, String input) {
		driver.get(input);
	}
	
	public static void click(String object, String input) {
		driver.findElement(By.xpath(object)).click();
	}
	
	public static void inputKeys(String object, String input) {
		driver.findElement(By.xpath(object)).sendKeys(input);
	}
	
	public static void closeBrowser(String object, String input) {
		driver.close();
	}
	
}
