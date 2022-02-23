package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseLoginOrbitz {
	
	public class Orbitz {

		
		
		public  void getlogin(){//default
				
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.navigate().to("https://www.orbitz.com/");//****
				driver.manage().window().maximize();
				long timeout = 3;
				//new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']")));
				//WebElement singinbtn=driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']"));
			   // singinbtn.click();
				
				
				
			
			}
		}

}
