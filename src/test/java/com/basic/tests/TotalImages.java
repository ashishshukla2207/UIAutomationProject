package com.basic.tests;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		 List <WebElement>  imgList  =  driver.findElements(By.tagName("img"));
		 System.out.println("total no of images" + imgList.size());
		 for(WebElement e: imgList) {
			 
			     String url= e.getAttribute("href");
			     System.out.println(url);
		 }
	}

}
