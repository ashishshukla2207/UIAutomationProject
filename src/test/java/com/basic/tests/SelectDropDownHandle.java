//package com.basic.tests;
//
//import java.sql.Driver;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class SelectDropDownHandle {
//
//	static WebDriver driver;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		//select class is only for select html tag
//		
//		WebDriverManager.chromedriver().setup();
//		 driver = new ChromeDriver();
//		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
//		
//		By industry = By.id("Form_submitForm_Industry");
//		By country= By.id("Form_submitForm_Country");
//	/*	WebElement indusele =driver.findElement(industry);
//		WebElement countryele =driver.findElement(country);
//		
//		
//		Select select = new Select(indusele);
//		
//		select.selectByIndex(5);
//		select.selectByVisibleText("Education");
//		
//		//prefer by name as index might get shifted if u add anymore elements
//		//use index for month /week as they are constants
//		
//		Select select1= new Select(countryele);
//		select1.selectByVisibleText("India");
//		
//		*/
//		
//		doSelectByVisibleText(industry, "Education");
//		doSelectByVisibleText(country, "India");
//		
//	}
//	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//		
//		
//	}
//	 public  static doSelectByVisibleText(By locator, String text) {
//			
//			Select select = new Select(getElement(locator));
//			
//			select.selectByVisibleText(text);
//			
//		
//		}
//	  public  void doSelectByVisibleValue(By locator, String Value) {
//			
//			Select select = new Select(getElement(locator));
//			
//			select.selectByValue(Value);
//			
//		
//		}
//	   public  void doSelectByVisibleText(By locator, Integer Index) {
//			
//			Select select = new Select(getElement(locator));
//			
//			select.selectByIndex(Index);
//			
//	
//	   }
//
//}
