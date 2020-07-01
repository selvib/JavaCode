package com.CRM.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	public static LoginPage loginPage;
	public static HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		Initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void LoginPageTitleTest() {

		String title = loginPage.LoginTitleValidate();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}

	@Test(priority = 2)
	public void CRMLogoTest() {
		boolean logo = loginPage.ValidateCRM_Logo();
		Assert.assertTrue(logo);
	}

	@Test(priority = 3)
	public void Login() {
		homePage = loginPage.Login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
