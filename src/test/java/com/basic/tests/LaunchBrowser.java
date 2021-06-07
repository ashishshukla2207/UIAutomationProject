package com.basic.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		String title= driver.getTitle();
		System.out.println("page title is: " +title);
		
		if(title.equals("Google")) {
			
			System.out.println("Correct title");
		} else {
			
			System.out.println("Incorrect title");
			
		}
        System.out.println(driver.getCurrentUrl());
        
        String currentURL= driver.getCurrentUrl();
        
        if(currentURL.equalsIgnoreCase("https://www.google.com/")) {
        	System.out.println("correct url");
        	
        } else {
        	
        	System.out.println("incorrect url");
        }
       // System.out.println(driver.getPageSource());
        
        driver.close();
        //driver.quit();
        
        /*  Quit vs Close
         * A session id is created for all the operations via selenium standalone server
         * 
         * close: will close the session id
         * Quit: 
         *
         * 
         *  
         *  */
	}

}
