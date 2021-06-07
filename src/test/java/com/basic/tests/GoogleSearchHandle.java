package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHandle {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		
		Thread.sleep(3000);
		
	List<WebElement> suggestionList=	driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='eIPGRd']//span"));
	
	System.out.println(suggestionList.size());
	
	for(WebElement e: suggestionList) {
		
		System.out.println(e.getText());
		
		if(e.getText().equals("naveen automation labs api testing")) {
			
			e.click();
			break;
		}
	}

	}

}
