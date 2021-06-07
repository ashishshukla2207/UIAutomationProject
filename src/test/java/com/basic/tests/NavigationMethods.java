package com.basic.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("http://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.print(driver.getTitle());
		
		driver.navigate().forward();
	    System.out.println(driver.getTitle());
	    
	    driver.navigate().back();
		System.out.print(driver.getTitle());
		
		driver.navigate().refresh();
		
		//there is no difference in navigate and navigate to method 
		
		

	}

}
