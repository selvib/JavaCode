package com.flipkart.TestCase;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.PageObjects.LoginPage;
import com.flipkart.PageObjects.MyKartPage;
import com.flipkart.PageObjects.PlaceOrderPage;
import com.flipkart.TestBase.ExtentReport;
import com.flipkart.TestBase.TestBase;

public class PlaceOrderPageTest extends TestBase {

	public LoginPage loginPage;
	public MyKartPage mykart;
	public PlaceOrderPage orderPage;
	private static Logger log = LogManager.getLogger(PlaceOrderPageTest.class.getClass());

	public WebDriver driver;


	public PlaceOrderPageTest() throws IOException {
		super();
	}

	@BeforeMethod(groups = { "Smoke" })
	public void setUp() throws IOException, InterruptedException {
		driver=Initialization();
		loginPage = new LoginPage(driver);
		mykart = new MyKartPage(driver);
		loginPage.enterUname(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		mykart.enterUname(prop.getProperty("username"), prop.getProperty("password"));
		orderPage = mykart.clickOrder();
		
		
	}
	
	@Test(groups = { "Smoke" })
	public void verifyDeliveryAddress() {
		orderPage.enterName().sendKeys("Selvi");
		orderPage.enterPhone().sendKeys("9500418246");
		orderPage.enterPincode().sendKeys("201301");
		orderPage.enterAddress().sendKeys("Noida");
		orderPage.enterAddTwo().sendKeys("L-111222,  Prathikvista");
		orderPage.enterCity().sendKeys("Gautam Buddha Nagar");
		Select select = new Select(orderPage.selectSelect());
		select.selectByVisibleText("Uttar Pradesh");
		orderPage.selectHomeOption().click();
		orderPage.clickSaveDelivery();
		log.info("Address Has Been Entered Successfully");
	}

	@AfterMethod(groups = { "Smoke" })
	public void tearDown() {
		driver.close();
	}
}
