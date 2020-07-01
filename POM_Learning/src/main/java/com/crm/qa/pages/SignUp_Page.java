package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SignUp_Page extends TestBase {

	@FindBy(linkText="Sign Up")
	WebElement signUp_Link;
	
//	@FindBy(xpath="//a[contains(text(),'Got an account? Log in here')]")
//	WebElement login_Link;
//	
//	@FindBy(xpath="//input[@name='email']")
//	WebElement email;
//	
//	@FindBy(xpath="//input[@name='password']")
//	WebElement password;
//	
//	@FindBy(xpath="//div[text()='Login']")
//	WebElement login;
	
	public SignUp_Page() {
		PageFactory.initElements(driver, this);
	}
	
//	public SingUp_Regiesteration click_SignUp(String userName, String password) {
//		signUp_Link.click();
//		login_Link.click();
//		email.sendKeys(userName);
//		this.password.sendKeys(password);
//		login.click();
//		return new SingUp_Regiesteration();
//	}
	
	public SingUp_Regiesteration click_SignUp() {
		signUp_Link.click();
		return new SingUp_Regiesteration();
	}
	
	
	
}
