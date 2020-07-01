package com.CRM.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.SignUp_Login;
import com.crm.qa.pages.SignUp_Page;
import com.crm.qa.pages.SingUp_Regiesteration;

public class SignUpLoginTest extends TestBase {
	
	public static SignUp_Page sign_Up;
	public static SingUp_Regiesteration reg;
	public static SignUp_Login login;
	public static HomePage homepage;

	public SignUpLoginTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		Initialization();
		sign_Up = new SignUp_Page();
		reg = new SingUp_Regiesteration();
		login = new SignUp_Login();
		homepage = new HomePage();
	}

	@Test(priority = 1)
	public void signUp_Click() {
		//sign_Up.click_SignUp(prop.getProperty("userName"), prop.getProperty("password"));
		reg = sign_Up.click_SignUp();
	}

	@Test(priority = 2)
	public void Click_Login() {
		login = reg.click_Login();
	}

	@Test(priority = 3)
	public void Email() {
		login.enter_Email(prop.getProperty("userName"));
	}

	@Test(priority = 4)
	public void Pass() {
		login.enter_Password(prop.getProperty("password"));
	}
	
	@Test(priority = 5)
	public void loginTest() {
		homepage = login.click_Login();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
