package com.basic.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownValueWithText {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country= By.id("Form_submitForm_Country");
		
	}
	
	public static void doSelectByTextOption(By locator, String text) {
		Select select_indus = new Select(driver.findElement(locator));
		
		List<WebElement> indusList= select_indus.getOptions();
		
		for(WebElement e: indusList) {
			
			if(e.getText().equals(text)) {
				
				e.click();
				break;
			}
		}
		
	}
}


