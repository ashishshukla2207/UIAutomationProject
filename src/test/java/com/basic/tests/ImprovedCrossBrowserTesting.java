package com.basic.tests;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ImprovedCrossBrowserTesting {
    static  WebDriver driver;    //make static and use at class level
	public static void main(String[] args) {
		
		//WebDriver driver= null; //initialization with the default value at the method level otherwise driver wont get initialized
		String browser= "Safari";
		
		if(browser.equals("chrome")) {
		 WebDriverManager.chromedriver().setup();
	      driver= new ChromeDriver();
			
			
		}
		
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
			
		}
		
		else if(browser.equals("Safari")) {
			driver = new SafariDriver();	//apple doesn't provide any binary
		}
		 
		
		
		
		
		else {
			
			System.out.println("Please pass correct browser");
		}  driver.get("https://www.amazon.com");
		   String title= driver.getTitle();
		   System.out.println(title);
		   driver.quit();
	}   
      
}
