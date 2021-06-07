package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleCoIn {
	static WebDriver driver;

	public static void main(String[] args) {
		ElementUtil el= new ElementUtil(driver);
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		By LinksList= By.xpath("//div[@id='SIvCob']/a");
		el.doLinkClick(LinksList, "हिन्दी");
		el.getElements(LinksList);
		
		
	     
		
		 
	}

	
	 
}
