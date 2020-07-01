package com.flipkart.TestCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.flipkart.PageObjects.ItemPage;
import com.flipkart.PageObjects.KartHomePage;
import com.flipkart.PageObjects.LoginPage;
import com.flipkart.TestBase.TestBase;

public class ItemPageTest extends TestBase {

	public LoginPage loginPage;
	public ItemPage itemPage;
	public KartHomePage karthp;
	
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(ItemPageTest.class.getClass());

	public ItemPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		driver=Initialization();
		loginPage = new LoginPage(driver);

	}

	@Test
	public void enterItem() throws IOException, InterruptedException {
		itemPage = loginPage.enterUname(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
//		itemPage.enter_Item().sendKeys("tv");
//		itemPage.enter_Item().sendKeys(Keys.ENTER);

//		itemPage.click_Search().click();
		System.out.println("Scessfully Entered !!");
		log.info("Scessfully Entered !!");

//		itemPage.click_Item();
		
		Thread.sleep(3000);
		karthp = itemPage.click_Item();
		System.out.println("Item Has Been Clicked Successfully");
		boolean kart = karthp.verifyKartHome();
		Assert.assertTrue(kart);

//		String product = karthp.verifyKartHome();
//		Assert.assertEquals(product, "Product Description");

		System.out.println("Scessfully Landed in KartHomePage");
		log.info("Scessfully Landed in KartHomePage");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
