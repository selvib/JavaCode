package com.qa_academy.TestCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa_academy.PageObjects.ForgotPasswordPage;
import com.qa_academy.PageObjects.LandingPage;
import com.qa_academy.PageObjects.Login_Page;
import com.qa_academy.TestBase.TestBase;

public class LoginTestCase extends TestBase {

	public LandingPage land_Page;
	public Login_Page lp;

	public WebDriver driver;

	private static Logger log = LogManager.getLogger(LoginTestCase.class.getClass());

	public LoginTestCase() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() {

		driver = Initialization();
		log.info("Succesfully Initialized");
		land_Page = new LandingPage(driver);

	}

	/*
	 * @Test public void login_Test() { Initialization(); lPage = new
	 * LandingPage(driver); lPage.click_Ad().click(); lPage.Click_Login().click();
	 * lp = new Login_Page(driver);
	 * lp.enter_Email().sendKeys((prop.getProperty("email")));
	 * lp.enter_Pass().sendKeys((prop.getProperty("password")));
	 * lp.click_Login().click(); }
	 */

	@Test(dataProvider = "getData")
	// The count of method argument should be equal to Count of the Values for each
	// Test
	public void login_Test(String email, String password) {

		land_Page.click_Ad().click();

		lp = land_Page.Click_Login();
		log.info("Successfully Login");

		lp.enter_Email().sendKeys(email);
		lp.enter_Pass().sendKeys(password);
		lp.Login().click();
		log.info("Successfully Login");

		ForgotPasswordPage fp = lp.getForgotPassword();
		fp.getEmail().sendKeys("HelloEmail");
		fp.getMeInstructions().click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		// Row stands for how many different types of data set we send per test
		// Columns stands for how many values we send per data set
		// accessing array element is based on Index value for row as well as column ..
		// but when we define the array count or size or number of
		// rows and columns starts from One.....

		// Both are 0th Row
		data[0][0] = "haaaii@gmail.com"; // 0th column
		data[0][1] = "789654"; // 1st column

		data[1][0] = "hello@gmail.com"; // 0th column
		data[1][1] = "123654"; // 1st column

		return data;
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
