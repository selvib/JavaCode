package com.qa_academy.TestCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa_academy.PageObjects.LandingPage;
import com.qa_academy.TestBase.TestBase;

public class LandingPageTest extends TestBase {

	private static Logger log = LogManager.getLogger(LandingPageTest.class.getClass());

	public LandingPage lp;

	public WebDriver driver;

	public LandingPageTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() {
		driver = Initialization();
		log.info("Succesfully Initialized");
		lp = new LandingPage(driver);
	}

	@Test
	public void Click_Login() {
		// If you comment this below we will get ElementIntercet exception
		lp.click_Ad().click();
		lp.Click_Login();
		log.info("Successfully Clicked Login");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
