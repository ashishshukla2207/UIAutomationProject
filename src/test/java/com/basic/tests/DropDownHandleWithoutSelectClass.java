package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {
    static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		By indusoptions= By.xpath("//select[@id=\"Form_submitForm_Industry\"]/option");
		By countryOptions= By.xpath("//select[@id=\"Form_submitForm_Country\"]/option");
		 
		DoSelectDropDownWithoutSelectClass(countryOptions, "Cuba");
		
	}

	public static void DoSelectDropDownWithoutSelectClass(By locator, String value) {
		
      List<WebElement> induslist= driver.findElements(locator);
		
		
		for(WebElement e: induslist) {
			
			if(e.getText().equals(value)) {
				
				e.click();
				break;
			}
		}
		
	}
	
	
	
}
