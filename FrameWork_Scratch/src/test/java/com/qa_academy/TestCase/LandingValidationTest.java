package com.qa_academy.TestCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa_academy.PageObjects.LandingPage;
import com.qa_academy.TestBase.TestBase;

public class LandingValidationTest extends TestBase {


	private static Logger log = LogManager.getLogger(LandingValidationTest.class.getClass());
	public static LandingPage lp;
	
	public WebDriver driver;

	public LandingValidationTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() {
		driver = Initialization();
		log.info("Succesfully Initialized");
		lp = new LandingPage(driver);
	}

	@Test
	public void test_Title() {
		lp.click_Ad().click();
		Assert.assertEquals(lp.getTitles().getText(), "FEATURED COURSES00");
		log.info("SuccessFully Title is Validated");
		//System.out.println(lp.getTitles().getText());
		Assert.assertTrue(lp.isDis().isDisplayed());
		log.info("SuccessFully Display is Validated");
		//System.out.println(lp.isDis().getAttribute("class"));
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
