package com.flipkart.PageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.TestBase.TestBase;

public class MyKartPage {
public WebDriver driver;
//	@FindBy(linkText = "Login")
//	WebElement login;
//
//	@FindBy(xpath = "//span[text()='Enter Email/Mobile number']/parent::label/parent::div/child::input")
//	WebElement uname;
//
//	@FindBy(xpath = "//span[text()='Enter Password']/parent::label/parent::div/child::input")
//	WebElement password;
//
//	@FindBy(xpath = "(//span[text()='Login'])[2]")
//	WebElement loginButton;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginB;

	@FindBy(xpath = "(//a[contains(text(),'Mi 4A PRO 80 cm (32) HD Ready LED Smart Android TV With Google Data Saver')])")
	WebElement tvItem;

	@FindBy(xpath = "//div[starts-with(text(),'My Cart')]")
	WebElement kartText;

	@FindBy(xpath = "(//div[@class='ooJZfD _2oZ8XT col-12-12'])[1]/child::div/child::div/child::div/child::a")
	List<WebElement> allKartImage;

	@FindBy(xpath = "(//div[@class='_1lBhq8'])[2]")
	WebElement saveText;

	@FindBy(xpath = "(//div[@class='ooJZfD _2oZ8XT col-12-12'])[2]/child::div/child::div/child::div/a")
	List<WebElement> saveCount;

	@FindBy(xpath = "(//div[@class='ooJZfD _2oZ8XT col-12-12'])[1]/child::div/child::div/child::div[2]/child::div/child::div[2]")
	List<WebElement> allRemoveText;

	@FindBy(xpath = "(//div[@class='ooJZfD _2oZ8XT col-12-12'])[1]/child::div/child::div/child::div/child::div/child::div/a")
	List<WebElement> allItemText;

	@FindBy(xpath = "//a[text()='Redmi Note 8 Pro (Halo White, 128 GB)']")
	WebElement deleteItemText; // for removing

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div[5]/div/div[2]/div/div[2]")
	WebElement removeButton; // customized remove path for specific one

	@FindBy(xpath = "//div[text()='Remove']")
	List<WebElement> allRemoveButton;

	@FindBy(xpath = "//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")
	WebElement confirmRemove;

	@FindBy(xpath = "//div[text()='Successfully removed OPPO A31 (Fantasy White, 64 GB) from your cart']")
	WebElement msg;

	@FindBy(xpath = "//a[text()='EcoTel E12']")
	WebElement saveItem; // Saved For Later item

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[1]/div[6]/div/div[2]/div[2]/div[1]")
	WebElement saveLaterBut; // customized save for later button

	@FindBy(xpath = "//div[text()='Save for later']")
	List<WebElement> saveLaterB; // list of save for later button

	@FindBy(xpath = "(//div[@class='ooJZfD _2oZ8XT col-12-12'])[2]/child::div/child::div/child::div/child::div/descendant::a")
	List<WebElement> allSaveItem;

	@FindBy(xpath = "(//div[@class='ooJZfD _2oZ8XT col-12-12'])[2]")
	WebElement savedParent;

	@FindBy(xpath = "//div[starts-with(text(),'Seller')]")
	List<WebElement> sellerCount;

	@FindBy(xpath = "//div[starts-with(text(),'Price')]")
	WebElement price;

	@FindBy(css = ".pMSy0p.XU9vZa")
	List<WebElement> priceTexts;

	@FindBy(xpath = "//div[@class='_2twTWD']/descendant::span[1]")
	WebElement totalAmount;

	@FindBy(xpath = "//div[@class='_2twTWD']/descendant::span[2]")
	WebElement deleveryLoc;

	@FindBy(xpath = "//div[@class='_2twTWD']/descendant::span[4]")
	WebElement totalAmountLoc;

	@FindBy(xpath = "//span[text()='Place Order']")
	WebElement orderButton;

	public MyKartPage(WebDriver driver) throws IOException {
//		this.driver=driver;
		PageFactory.initElements(this.driver=driver, this);
	}

	public void enterUname(String uname, String password) throws IOException {
		driver.get("https://www.flipkart.com/viewcart?otracker=Cart_Icon_Click");
//		login.click();
//		this.uname.sendKeys(uname);
//		this.password.sendKeys(password);
//		loginButton.click();		
	}

	public WebElement login_Button() {
		return loginB;
	}

	public String tvDisplay() {
		return tvItem.getText();
	}

	public String myKartText() {
		return kartText.getText();
	}

	public List<WebElement> total_Image() {
		return allKartImage;
	}

	public WebElement saveForText() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveText);
		return saveText;
	}

	public List<WebElement> saveTextCount() {
		return saveCount;
	}

	public WebElement remove() {
		return removeButton;
	}

	public List<WebElement> allRemove() {
		return allRemoveButton;
	}

	public WebElement conRemove() {
		return confirmRemove;
	}

	public List<WebElement> allItemKart() {
		return allItemText;
	}

	public String deleteItem() {
		return deleteItemText.getText();
	}

	public WebElement conMsg() {
		return msg;
	}

	public String laterItemText() {
		return saveItem.getText();
	}

	public WebElement laterButton() {
		return saveLaterBut;
	}

	public List<WebElement> laterButtons() {
		return saveLaterB;
	}

	public List<WebElement> allSaveItems() {
		return allSaveItem;
	}

	public WebElement saveParenPanel() {
		return savedParent;
	}

	public WebElement laterItem() {
		return saveItem;
	}

	public List<WebElement> sellerCountMethod() {
		return sellerCount;
	}

	public WebElement priceItemCount() {
		return price;
	}

	public List<WebElement> allPriceTexts() {
		return priceTexts;
	}

	public String totalAmountPrice() {
		return totalAmount.getText();
	}

	public String deliveryAmount() {
		return deleveryLoc.getText();
	}

	public String totalAmount() {
		return totalAmountLoc.getText();
	}

	public PlaceOrderPage clickOrder() throws IOException {
		orderButton.click();
		return new PlaceOrderPage(driver);
	}
}
