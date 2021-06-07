package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		List<WebElement> footerList =    driver.findElements(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']//a"));
		
		for(WebElement we: footerList) {
			
			String text= we.getText();
			String url= we.getAttribute("href");
			
			System.out.println(text + " -- " + url);
		}

	}

}
