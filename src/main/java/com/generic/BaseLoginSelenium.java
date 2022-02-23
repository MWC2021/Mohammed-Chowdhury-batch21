
  package com.generic;
  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
  public class BaseLoginSelenium {
	  
	  public void getLogin() throws InterruptedException {
		  
  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
  //driver.get("https://www.google.com/");
  driver.get("https://www.amazon.com/");
  //driver.get("https://www.facebook.com/");
  //driver.get("http://automationpractice.com/index.php");
  //driver.get("http://demo.guru99,com/test/newtours/");
  //driver.navigate().to("https://www.facebook.com/");
  //driver.navigate().refresh();
  //driver.navigate().back();
  //driver.navigate().forward();
  driver.manage().window().maximize();
  
  WebElement signInButton = driver.findElement(By.xpath("//[@[@class='login']"));
  signInButton.click();
  
  WebElement email = driver.findElement(By.xpath("//[@[id=email']"));
  email.sendKeys("sarowerny@gmail.com");
  
  Thread.sleep(3000);//slow down selenium for 3 second 
  
  WebElement password = driver.findElement(By.xpath("//[@name='passwd']"));
  password.sendKeys("student");
  
  WebElement signInBttn = driver.findElement(By.xpath("//[@id='Submitlogin']"));
  signInBttn.click();
  
  driver.quit();
    
  
  }
  
  
  }
  