package com.basic.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class ElementUtil {

	private WebDriver driver;  //constructor and encapsulation
	
	public ElementUtil(WebDriver driver) {
		this.driver= driver;
	}
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
   	 
    }
	
	public  void doSendKeys(By locator, String Value) {
		
		getElement(locator).sendKeys(Value);
	}
	
	public  void doClick(By locator) {
		getElement(locator).click();
		
	}
   public String doGetElementText(By locator) {
	   
	   return getElement(locator).getText();
   }
  public boolean doIsDisplayed(By locator) {
	  
	  return getElement(locator).isDisplayed();
  }
  
  public  void doLinkClick(By locator, String Value) {
		 List<WebElement> LinksList= getElements(locator);
			
			System.out.println("totalLinks " +  LinksList.size() );
			
			for(WebElement e:  LinksList) {
				
				String text= e.getText();
				if(text.equals(Value)) {
					e.click();
					break;
					

				}
			}
			
		 
	 }
  
 // **********Drop Down Utils
  
  
  public  void doSelectByVisibleText(By locator, String text) {
		
		Select select = new Select(getElement(locator));
		
		select.selectByVisibleText(text);
		
	
	}
  public  void doSelectByVisibleValue(By locator, String Value) {
		
		Select select = new Select(getElement(locator));
		
		select.selectByValue(Value);
		
	
	}
   public  void doSelectByVisibleText(By locator, Integer Index) {
		
		Select select = new Select(getElement(locator));
		
		select.selectByIndex(Index);
		
	
	}
	
   
   public  List<String> getDropDownOptionsList(By locator) {
		
		
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
  
  
   // Without using select method
   public  void doSelectByTextOption(By locator, String text) {
		Select select_indus = new Select(getElement(locator));
		
		List<WebElement> indusList= select_indus.getOptions();
		
		for(WebElement e: indusList) {
			
			if(e.getText().equals(text)) {
				
				e.click();
				break;
			}
		}
		
	}
   
   
   
   //drop down without select class
   
   
   public  void DoSelectDropDownWithoutSelectClass(By locator, String value) {
		
	      List<WebElement> optionsList= getElements(locator);
			
			
			for(WebElement e: optionsList) {
				
				if(e.getText().equals(value)) {
					
					e.click();
					break;
				}
			}
			
		}
   
   
   //*********** move and click
   
   
 //2 level menu and submenu
 	public  void doMoveToElement(By locator) {
 		Actions act= new Actions(driver);
 		act.moveToElement(getElement(locator)).perform();
 	}
 	
 	//3 level menu
 	public  void doMoveToElement(By locator1, By locator2) {
 		  Actions act= new Actions(driver);
 			
 		  act.moveToElement(getElement(locator1)).perform();
 		  act.moveToElement(getElement(locator2)).perform();
 	}
 	
 	//3 level menu and click
 	public  void doMoveElement(By locator1, By locator2, By locator3) {
           Actions act= new Actions(driver);
 		
 		  act.moveToElement(getElement(locator1)).perform();
 		  act.moveToElement(getElement(locator2)).perform();
 		  doClick(locator3);
 	}
  
  
}
