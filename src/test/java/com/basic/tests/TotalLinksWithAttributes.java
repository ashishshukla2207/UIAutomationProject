package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksWithAttributes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkslist= driver.findElements(By.tagName("a"));
		
		for(WebElement we: linkslist ) {
			
			
			if(!we.getText().isEmpty()) {
				
				String url = we.getAttribute("href");
				
				
				if(url!=null) {
					
					System.out.println(url);
				}
			}
			
			
			
			
			
			}
			
		}

	}

 
