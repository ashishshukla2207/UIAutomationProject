package com.basic.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
    WebDriver driver;
    
    //these utilities are not application dependent
    
    /**
     * 
     * This method is used to initialize browser
     * @param browserName
     * @return  this method returns webdriver reference
     * 
     */
    
	public WebDriver launchBrowser(String browserName) {
		
		System.out.println("Launching browser" + browserName);
		
		switch(browserName) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver= new SafariDriver();
			break;
		default:
			System.out.println("Browser not found"+ browserName);
			break;
		}
	
		      return driver;
		
	}
	
	/**
	 * This method is used to launch browser
	 * @param url
	 */
		
    public void launchUrl(String url) 
    {
	if(url.isEmpty()) {
		
		System.out.println("URL is blank" + url);
	}
	
	driver.get(url);
    }
    
    
    /**
     * This method returns the title of the page
     * @return
     */
    
    public String getPageTitle() {
    	
    	return driver.getTitle();
    }
    
    /**
     * This method returns the current page url
     * @return
     */
    
    public String getPageUrl() {
    	
    	return driver.getCurrentUrl();
    }
    
    /**
     * This method Quits browser
     */

    public void quitBrowser() {
    	
    	driver.quit();
    }
    
    /**
     * This method closes the browser
     */

    public void closeBrowser() {
    	
    	driver.close();
    }
}

/* Note: Dont use static for browser utils because if you do parallel execution will have problems as static will have their own space
 * 
 */
