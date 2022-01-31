
  package com.generic;
  
  import org.openqa.selenium.WebDriver; 
  import org.openqa.selenium.chrome.ChromeDriver;
  
  public class BaseLogin {
	  
	  public void getLogin() {
		  
  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
  //driver.get("https://www.google.com/");
  driver.get("https://www.amazon.com/");
  //driver.get("https://www.facebook.com/");
  //driver.get("http://automationpractice.com/index.php");
  //driver.manage().window().maximize();
  
  
  
  }
  
  
  }