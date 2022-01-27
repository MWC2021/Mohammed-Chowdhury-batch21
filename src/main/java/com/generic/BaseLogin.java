package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	
	public void getLogin() {
	//java>> key means selenium package name value = driver path
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//selenium==> need driver path/location
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
				
		//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.get("https://www.amazon.com/");
		//driver.get("https://www.facebook.com/");
		//driver.get("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();
		
		
	
	}

}
