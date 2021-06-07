package com.basic.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		String title= driver.getTitle();
		System.out.println("page title is: " +title);
		
		//driver.quit();
		//System.out.println(driver.getTitle()); //NoSuchSessionSession exception as session id is null
		
		driver.close();  
		System.out.println(driver.getTitle());// same session id as invalid session id
	}

}
