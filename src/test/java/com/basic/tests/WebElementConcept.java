package com.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//driver.get("https://classic.crmpro.com/index.html");
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		
		/*driver.get("https://demo.opencart.com/index.php?route=account/login");
		//Locators 
		//01. ID  always unique
		
		driver.findElement(By.id("input-email")).sendKeys("akshukla9795@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@1234");
		//driver.findElement(By.id(null)
		
		WebElement emailid = driver.findElement(By.id("input-email"));
		emailid.sendKeys("abc@gmail.com");
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("test@1234");
		*/
		
		//comment the above code to use this code 
		//By Locator
		
		
		By email= By.id("input-email");
		By password= By.id("input-password");
		By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		//By name= By.name(null)
				
				
		
		/*WebElement emailid = driver.findElement(email);
		WebElement pwd = driver.findElement(password);
		
		emailid.sendKeys("abc@gmail.com");
	    pwd.sendKeys("abcd1234");
	    */
		
		//we are not hitting server (driver) , not creating any sessions
		//Simply creating locators and then using WebElements
		//4th approach
		getElement(email).sendKeys("abc@gmail.com");
		getElement(password).sendKeys("abcd1234");
		doClick(loginButton);
		
		
		
		doSendKeys(email, "abc@gmail.com");
		doSendKeys(password, "abcd123"); 
		doClick(loginButton);
		
		
 // 02. Name	(when id is not available)
		
		
		//driver.findElement(By.name("username")).sendKeys("ashish@123");
		
//03. ClassName (could be many duplicates)
	//	driver.findElement(By.className("abcs")).sendKeys("abc@gmail.com");
		
//04. Xpath (Locator not an attribute)		 address of element in html DOM
		
	//	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("abc@gmail.com");
//05. CSS Selector (Locator not an attribute)
		
	//	driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("abc@gmail.com");
	//	driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
		
		
//06 LinkText <a tag> will work only if anchor tag <a> is available
		
		//driver.findElement(By.linkText("Login")).click();

//07 Partial link text (When link name is too long)
		
		//About us
		//About me 
		//whichever it finds first
		
		
		
	//	driver.findElement(By.partialLinkText("About")).click();
		
		
		
		
//08 tag name   use freshworks.com
		
		/*String h2Header= driver.findElement(By.tagName("h2")).getText();
		System.out.println(h2Header);
		*/
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String Value) {
		
		getElement(locator).sendKeys(Value);
		
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
}
