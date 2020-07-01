package com.flipkart.TestCase;

import java.io.IOException;
import java.text.NumberFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.flipkart.PageObjects.LoginPage;
import com.flipkart.PageObjects.MyKartPage;
import com.flipkart.PageObjects.PlaceOrderPage;
import com.flipkart.TestBase.ExtentReport;
import com.flipkart.TestBase.TestBase;

import jdk.internal.jline.internal.Log;

public class MyKartPageTest extends TestBase {

	public LoginPage loginPage;
	public MyKartPage mykart;
	public NumberFormat numberformat;

	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(MyKartPageTest.class.getClass());

	public MyKartPageTest() throws IOException {
		super();
	}

	@BeforeMethod(groups = { "Smoke" })
	public void setUp() throws IOException, InterruptedException {

		driver = Initialization();
		loginPage = new LoginPage(driver);
		mykart = new MyKartPage(driver);
		loginPage.enterUname(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		mykart.enterUname(prop.getProperty("username"), prop.getProperty("password"));
	}

//	@Test
//	public void display() throws IOException, InterruptedException {
//		Thread.sleep(3000);
//		String item = mykart.tvDisplay();
//		if (item.contains("Mi 4A PRO 80 cm (32) HD Ready LED Smart Android TV With Google Data Saver")) {
//			Assert.assertTrue(true);
//		}
//		System.out.println("Item is there");
//
//		int itemCount = mykart.total_Image().size();
//		String countStr = String.valueOf(itemCount);
//		String kartText = mykart.myKartText();
//		if (kartText.contains(countStr)) {
//			Assert.assertTrue(true, "Items Same!!");
//		}
//		System.out.println("MyKart Count is Matched");
//
//		// If we dont use this we will get nosuchelementexeception
//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		WebDriverWait w = new WebDriverWait(driver, 50);
//		w.until(ExpectedConditions.visibilityOf(mykart.saveForText()));
//
//		String saveTex = mykart.saveForText().getText();
//		int saveCou = mykart.saveTextCount().size();
//		String intToString = String.valueOf(saveCou);
//		if (saveTex.contains(intToString)) {
//			Assert.assertTrue(true);
//		}
//		System.out.println("Saved For Later Is Matched");
//	}
//
//	@Test
//	public void deleteMyItem() throws InterruptedException {
//		Thread.sleep(3000);
//		List<WebElement> items = mykart.allItemKart();
//		int count = items.size();
//		List<WebElement> removeEle = mykart.allRemove();
//		String item = mykart.deleteItem();
//
//		for (int i = 1; i < count; i++) {
//			for (int j = i; j == i; j++) {
//				String reqItem = items.get(i).getText();
//				if (reqItem.contentEquals(item)) {
//					Thread.sleep(5000);
//					WebElement element = removeEle.get(j); // mykart.remove();
//					JavascriptExecutor executor = (JavascriptExecutor) driver;
//					Thread.sleep(5000);
//					executor.executeScript("arguments[0].click()", element);
//
//					WebElement elements = mykart.conRemove();
//					//// we may get elementnotinterceptedexeception coz element may be overlapped by
//					//// another element selenium cant find this ele with js we can find
//					JavascriptExecutor executors = (JavascriptExecutor) driver;
//					Thread.sleep(5000);
//					executors.executeScript("arguments[0].click()", elements);
//					System.out.println("Item Has Been Removed Successfully");
//					break;
//
////				WebElement conElements = mykart.conMsg();
////				JavascriptExecutor conExecutors = (JavascriptExecutor) driver;
////				Thread.sleep(5000);
////				conExecutors.executeScript("return isDisplayed()", conElements);
////				Assert.assertTrue(conExecutors.executeScript("arguments[0].isDisplayed()", conElements));
//					// boolean msgDis = mykart.conMsg().isDisplayed();
//					// Assert.assertTrue(msgDis);
//				}
//			}
//		}
//	}
//
//	@Test
//	public void saveLaterItem() throws InterruptedException {
//		Thread.sleep(3000);
//		List<WebElement> allItems = mykart.allItemKart();
//		int counts = allItems.size();
//		List<WebElement> saveElements = mykart.laterButtons();
//		Thread.sleep(3000);
//		String s_ItemText = mykart.laterItemText();
//
//		for (int i = 0; i < counts - 1; i++) {
//			String reqItem = allItems.get(i).getText();
//			for (int k = i; k <= i;) {
//				if (reqItem.contentEquals(s_ItemText)) {
//					System.out.println(reqItem + "Item Saved For Later ");
//					WebElement sElement = saveElements.get(k);// mykart.laterButton();
//					JavascriptExecutor sExecutor = (JavascriptExecutor) driver;
//					sExecutor.executeScript("arguments[0].click()", sElement);
//					Thread.sleep(2000);
//
//					driver.navigate().refresh();
//					Thread.sleep(2000);
//					WebElement s_Item = mykart.laterItem();
//					JavascriptExecutor exe = (JavascriptExecutor) driver;
//					exe.executeScript("window.scrollBy(0,3500)");
////					exe.executeScript("arguments[0].scrollIntoView();", s_Item);
//					List<WebElement> savedItems = mykart.allSaveItems();
//					int saveCount = savedItems.size();
//					Thread.sleep(2000);
//
//					for (int j = 1; j < saveCount;) {
//						if (s_Item.isDisplayed()) {
//							Assert.assertTrue(true);
//							System.out.println("Item is Present in the Saved for Later Icon");
//							break;
//						} else
//							j++;
//					}
//					break;
//				} else
//					k++;
//			}
//
//		}
//	}
//
//	@Test(groups = {"Smoke"})
//	public void verifyPriceItemCount() throws InterruptedException {
//		Thread.sleep(3000);
//
//		String priceItems = mykart.priceItemCount().getText();
//
//		int sellerInt = mykart.sellerCountMethod().size();
//		String sellerString = String.valueOf(sellerInt);// Convert Int to String
//
//		if (priceItems.contains(sellerString)) {
//			assertTrue(true);
//		}
//	}
//
//	@Test
//	public void verifyItemPrices() throws ParseException, InterruptedException {
//		Thread.sleep(3000);
//		List<WebElement> allSeller = mykart.sellerCountMethod();
//		List<WebElement> allKartPrice = mykart.allPriceTexts();
//		int totalAmount = 0;
//
//		for (int i = 0; i < allSeller.size(); i++) {
//			Thread.sleep(2000);
//			String priceText = allKartPrice.get(i).getText();
////			priceText.indexOf(0);
////			System.out.println(priceText);
//			String regex = "[^a-zA-Z0-9]";// To remove the special char from the given string
//			String num = priceText.replaceFirst(regex, "");
////			System.out.println(num);
//			numberformat = NumberFormat.getIntegerInstance();// To remove comma in the price
//			Number priceInt = numberformat.parse(num);
//			int priceInti = priceInt.intValue();// we have to convert Number value to int to add two integer value
//			System.out.println(priceInti);
//			totalAmount = totalAmount + priceInti;
//		}
//		System.out.println(totalAmount);
//
//		Thread.sleep(4000);
//
//		String amountString = mykart.totalAmountPrice();
//		System.out.println("string " + amountString);
//		String regex = "[^a-zA-Z0-9]";// To remove the special char from the given string
//		String num = amountString.replaceFirst(regex, "");
//		System.out.println("Amount without char " + num);
//		numberformat = NumberFormat.getNumberInstance();
//		System.out.println(numberformat);
//		Number amountNumber = numberformat.parse(num);
//		System.out.println(amountNumber);
//		int amountInt = amountNumber.intValue();
//		if (totalAmount == amountInt) {
//			assertTrue(true);
//			System.out.println("Amount is Matched");
//		}
//
//	}

//	@Test(groups = "Smoke")
//	public void verifyTotalAmount() throws ParseException, InterruptedException {
//
//		String amountString = mykart.totalAmountPrice();
//		String regex = "[^a-zA-Z0-9]";// To remove the special char from the given string
//		String amountStr = amountString.replaceFirst(regex, "");
//		numberformat = NumberFormat.getNumberInstance();
//		Number amountNumber = numberformat.parse(amountStr);
//		int amountInt = amountNumber.intValue();
//
//		int feeInt = 0;
//
//		String feeString = mykart.deliveryAmount();
//		if (feeString.contentEquals(feeString)) {
//			feeString = "0";
//			int feeInte = Integer.parseInt(feeString);
//			feeInt = feeInte;
//
//		} else {
//			regex = "[^a-zA-Z0-9]";
//			feeString = feeString.replaceFirst(regex, "");
//			numberformat = NumberFormat.getNumberInstance();
//			Number feeNumber = numberformat.parse(feeString);
//			feeInt = feeNumber.intValue();
//		}
//
//		int totalAmount = amountInt + feeInt;
//
//		String totalAmountString = mykart.totalAmount();
//		regex = "[^a-zA-Z0-9]";
//		totalAmountString = totalAmountString.replaceFirst(regex, "");
//		numberformat = NumberFormat.getNumberInstance();
//		Number totalAmountNumber = numberformat.parse(totalAmountString);
//		int totAmountInt = totalAmountNumber.intValue();
//
//		if (totalAmount == totAmountInt) {
//			assertTrue(true, "Total Amount is Sucessfully Tested");
//			System.out.println("Total Amount is Sucessfully Tested!!");
////			er.logPass("Total Amount is Sucessfully Tested");
//
//		}
//
//	}

	@Test(groups = { "Smoke" })
	public void verifyPlaceOrderButton() throws IOException, InterruptedException {

		PlaceOrderPage placeOrder = mykart.clickOrder();
		String getMobNumber = placeOrder.getMobNum();

//		String mobNum = prop.getProperty("username");
		String mobNum="981565";
		

//		if (mobNum.contentEquals(getMobNumber)) {
//			assertTrue(true);
//			System.out.println("UserName Matched");
////			er.logPass("UserName Matched");
//
//		}
		Assert.assertEquals(getMobNumber, mobNum);
		log.error("Mob num does not matches");

	}

	@AfterMethod(groups = { "Smoke" })
	public void tearDown() {
		driver.quit();
	}
}
