package com.flipkart.TestCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.flipkart.PageObjects.ItemPage;
import com.flipkart.PageObjects.LoginPage;
import com.flipkart.TestBase.ExtentReport;
import com.flipkart.TestBase.TestBase;

public class LoginPageTest extends TestBase {

	public LoginPage loginPage;
	public ItemPage itemPage;

	public WebDriver driver;

	private static Logger log=LogManager.getLogger(LoginPageTest.class.getClass());

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod(groups = { "Smoke" })
	public void setUp() throws IOException {
		driver = Initialization();
		loginPage = new LoginPage(driver);
	}

//	@Test
//	public void click_Login() {
//
//		loginPage.clickLogin();
//	}

	@Parameters({ "username", "password" })
	@Test(groups = { "Smoke" })
	public void enter_Uname(String uname, String pwd) throws IOException {
//		loginPage.clickLogin();
//		itemPage = loginPage.enterUname(prop.getProperty("username"), prop.getProperty("password"));
		itemPage = loginPage.enterUname(uname, pwd);
		String myacc = itemPage.display();
		Assert.assertEquals(myacc, "My Account");
//		System.out.println("Successfully Landed");
		log.info("Successfully Landed");
	}

	@AfterMethod(groups = { "Smoke" })
	public void tearDown() {
		driver.close();
	}
}
