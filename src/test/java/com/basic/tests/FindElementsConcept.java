package com.basic.tests;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		List<WebElement> linkslist= driver.findElements(By.tagName("a"));
		
		System.out.println("total number of links" +  linkslist.size());
		
        for(WebElement numberofLinks : linkslist) {
        	
        	System.out.println(numberofLinks.getText());
        	
        	
        }
        
        for(int i=0; i<linkslist.size(); i++) {
        	
        	String text = linkslist.get(i).getText();
        	
        	if(!text.isEmpty()) {
        		
        		System.out.println(i + "---->" + text);
        	}
        }
	}

}
