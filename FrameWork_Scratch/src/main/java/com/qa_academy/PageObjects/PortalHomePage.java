package com.qa_academy.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {

	public WebDriver driver;
	
	By uName = By.name("query");
	
	
	public PortalHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public  WebElement verify_Uname() {
		return driver.findElement(uName);
	}
	
	
}
