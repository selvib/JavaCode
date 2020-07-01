package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUp_Login extends TestBase {
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	public SignUp_Login() {
		PageFactory.initElements(driver, this);
	}
	
	public void enter_Email(String email) {
		this.email.sendKeys(email);
	}
	
	public void enter_Password(String password) {
		this.password.sendKeys(password);
	}
	
	public HomePage click_Login() {
		login.click();
		return new HomePage();
	}
}
