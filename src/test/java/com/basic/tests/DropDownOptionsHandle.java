package com.basic.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptionsHandle {

	
	static WebDriver driver;
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country= By.id("Form_submitForm_Country");
		
		
		
		List<String> indus_list= getDropDownOptionsList(industry);
		System.out.println(indus_list.contains("Electronics"));
		System.out.println(indus_list.contains("Healthcare"));
		System.out.println(indus_list.contains("IT"));
		
		Select select = new Select(driver.findElement(industry));
		
		List<WebElement> indusOption= select.getOptions();
		System.out.println(indusOption.size());
		
		for(WebElement e: indusOption) {
			
			System.out.println(e.getText());
		}
		
		
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//WAF to get the list of drop down values
	public static List<String> getDropDownOptionsList(By locator) {
		
		
		Select select = new Select(getElement(locator));
		
		List<String> optionsTextList= new ArrayList<String>();
		
		List<WebElement> OptionList= select.getOptions();
		System.out.println(OptionList.size());
		
		for(WebElement e: OptionList) {
			//System.out.println(e.getText());
			optionsTextList.add(e.getText());
	}
		return optionsTextList;
	
	}
}
