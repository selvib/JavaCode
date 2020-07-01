package com.qa_academy.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {

	public WebDriver driver;

	private By email = By.cssSelector("#user_email");

	private By sendMeInstructions = By.name("commit");
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {

		return driver.findElement(email);
	}

	public WebElement getMeInstructions() {

		return driver.findElement(sendMeInstructions);
	}
}
