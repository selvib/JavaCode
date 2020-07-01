package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
//Page Factory/ Object Repository
	
@FindBy(name="username")
WebElement userName;

@FindBy(name="password")
WebElement password;

//xpath="//input[@type='submit']"
@FindBy(xpath="//div[@class='input-group-btn']/child::input[1]")
WebElement login_Button;

@FindBy(xpath="//a[contains(text(), 'Sign Up')]")
WebElement sign_Up;

@FindBy(xpath="//img[contains(@class, 'img-responsive')]")
WebElement crm_Logo;

//Initializing the Page Objects
//PageFactory is a class and initElements() method is Static method thats why we can call without its instance

public LoginPage(){
		PageFactory.initElements(driver, this);
}
 
//Actions of Login Page
public  String LoginTitleValidate() {
	return driver.getTitle();
}

public boolean  ValidateCRM_Logo() {
	return crm_Logo.isDisplayed();
}

public HomePage Login(String userName, String password) {
	this.userName.sendKeys(userName);
	this.password.sendKeys(password);
	login_Button.click();
	return new HomePage();
	
}

public  SignUp_Page SignUp() {
	sign_Up.click();
	return new SignUp_Page();
}

 
}
