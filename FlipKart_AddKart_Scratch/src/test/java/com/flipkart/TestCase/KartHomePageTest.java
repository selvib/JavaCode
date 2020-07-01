package com.flipkart.TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.PageObjects.ItemPage;
import com.flipkart.PageObjects.KartHomePage;
import com.flipkart.PageObjects.LoginPage;
import com.flipkart.PageObjects.MyKartPage;
import com.flipkart.TestBase.TestBase;

public class KartHomePageTest extends TestBase {

	public KartHomePage karthp;
	public ItemPage itemPage;
	public LoginPage loginPage;
	public MyKartPage mykart;

	public WebDriver driver;
	public KartHomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {
		
		driver=Initialization();
		loginPage = new LoginPage(driver);
	}

	@Test
	public void click_Add() throws IOException, InterruptedException {
		itemPage = loginPage.enterUname(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		karthp = itemPage.click_Item();
//		Thread.sleep(6000);
//		WebDriverWait w = new WebDriverWait(driver, 50);
//		w.until(ExpectedConditions.visibilityOf(karthp.click_AddKart()));
		
		karthp.click_AddKart();
		
//		WebElement kart = karthp.click_AddKart();
//		JavascriptExecutor sExecutor = (JavascriptExecutor) driver;
//		sExecutor.executeScript("arguments[0].click()", kart);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
