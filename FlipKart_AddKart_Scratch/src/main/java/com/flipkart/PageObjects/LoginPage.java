package com.flipkart.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.TestBase.TestBase;

public class LoginPage{
	WebDriver driver;
//	By login = By.linkText("Login");
//	By uname = By.xpath("//span[text()='Enter Email/Mobile number']/parent::label/parent::div/child::input");
//	By password = By.xpath("//span[text()='Enter Password']/parent::label/parent::div/child::input");

	@FindBy(linkText = "Login")
	WebElement login;

	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']/parent::label/parent::div/child::input")
	WebElement uname;

	@FindBy(xpath = "//span[text()='Enter Password']/parent::label/parent::div/child::input")
	WebElement password;

	@FindBy(xpath = "(//span[text()='Login'])[2]")
	WebElement loginButton;

	public LoginPage(WebDriver driver) throws IOException {
//		this.driver=driver;
		PageFactory.initElements(this.driver=driver, this);
	}

//	public WebElement Login() {
//		return driver.findElement(login);
//	}
//	
//	public WebElement enterMobile() {
//		return driver.findElement(uname);
//	}
//	
//	public WebElement enterPass() {
//		return driver.findElement(password);
//	}

	/*
	 * public WebElement clickLogin() { return login; }
	 * 
	 * public void clearLogin() { uname.clear(); password.clear(); }
	 */

	public ItemPage enterUname(String uname, String password) throws IOException {
		this.uname.sendKeys(uname);
		this.password.sendKeys(password);
		loginButton.click();
		return new ItemPage(driver);
	}

}
