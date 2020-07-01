package com.qa_academy.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

	WebDriver driver;
	
	private By email = By.cssSelector("#user_email");

	private By passWord = By.cssSelector("#user_password");

	private By login = By.xpath("//input[@name='commit']");
	
	private By forgotPassword = By.cssSelector("[href*='password/new']");

	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}

	public  WebElement enter_Email() {
		return driver.findElement(email);
	}

	public WebElement enter_Pass() {
		return driver.findElement(passWord);
	}

	public WebElement Login() {
		return driver.findElement(login);
	}
	
	public ForgotPasswordPage getForgotPassword() {
		driver.findElement(forgotPassword).click();
		return new ForgotPasswordPage(driver);
	}
}
