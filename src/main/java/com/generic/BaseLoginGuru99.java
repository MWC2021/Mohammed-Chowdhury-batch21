package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLoginGuru99 {
	
	public static void getlogin() throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	driver.get("https://demo.guru99.com/test/newtours/");// any website
	driver.manage().window().maximize();

//	WebElement signInButton = driver.findElement(By.xpath("//*[@class='login']"));
//	signInButton.click();

	//WebElement user = driver.findElement(By.xpath("//*[@name='userName']"));
	//user.sendKeys("sarowerny@gmail.com");

	//WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
	//password.sendKeys("student");

	//WebElement submitButton = driver.findElement(By.xpath("//*[@name='submit']"));
	//submitButton.click();

	//driver.quit();
	
	
}
	public static void main(String[] args) {
		
	
	}
}

