package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SingUp_Regiesteration extends TestBase {

	@FindBy(xpath="//a[contains(text(),'Got an account? Log in here')]")
	WebElement login_Link;
	
	public SingUp_Regiesteration() {
		PageFactory.initElements(driver, this);
	}
	
	public SignUp_Login click_Login() {
		login_Link.click();
		return new SignUp_Login();
	}
}
