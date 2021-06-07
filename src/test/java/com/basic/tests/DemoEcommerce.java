package com.basic.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoEcommerce {

	public static void main(String[] args) {
		
		BrowserUtil br= new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		String title= br.getPageTitle();
		System.out.println("Login Page title" +title);
		
		
		//By Locators : Object repo
		By email= By.id("input-email");
		By password= By.id("input-password");
		By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By yourStoreLink= By.linkText("Your Store");
		
		//element related 
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "abc@gmail.com");
		eleUtil.doSendKeys(password, "abc123");
		eleUtil.doClick(loginButton);
		
		
		String accPageTitle = br.getPageTitle();
		System.out.println(accPageTitle);
		
		if(eleUtil.doIsDisplayed(yourStoreLink)) {
			
			String header= eleUtil.doGetElementText(yourStoreLink);
			System.out.println(header);
		}
		
		br.closeBrowser();

	}

}
