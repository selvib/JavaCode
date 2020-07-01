package com.flipkart.PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.TestBase.TestBase;

public class PlaceOrderPage {
	 WebDriver driver;
	//Verify UserName
	@FindBy(xpath = "//span[@class='_3MeY5j']")
	WebElement mobNum;
	
	//Enter Name
	@FindBy(xpath = "//input[@name='name']")
	WebElement nameBox;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneBox;
	
	@FindBy(xpath = "//input[@name='pincode']")
	WebElement pincodeBox;
	
	@FindBy(xpath = "//input[@name='addressLine2']")
	WebElement addressBox;
	
	@FindBy (xpath = "//textarea[@name='addressLine1']")
	WebElement addTwoBox;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	
	
	@FindBy(xpath = "//select[@name='state']")
	WebElement selectBox;
	
	
	@FindBy(xpath = "(//div[@class='_6ATDKp'])[2]")
	WebElement homeOption;
	
	@FindBy(xpath = "//button[starts-with(text(),'Save and Deliver Here')]")
	WebElement saveAddButon;
	
	
	
	public PlaceOrderPage(WebDriver driver) throws IOException{
//		this.driver=driver;
		PageFactory.initElements(this.driver=driver, this);
	}
	
	
	public String getMobNum() {
		return mobNum.getText();
	}
	
	public WebElement enterName() {
		return nameBox;
	}
	
	public WebElement enterPhone() {
		return phoneBox;
	}
	
	public WebElement enterPincode() {
		return pincodeBox;
	}
	
	public WebElement enterAddress() {
		return addressBox;
	}
	
	public WebElement enterAddTwo() {
		return addTwoBox;
	}
	
	public WebElement enterCity() {
		return city;
	}
	
	public WebElement selectSelect() {
		return selectBox;
	}
	
	public WebElement selectHomeOption() {
		return homeOption;
	}
	
	public void clickSaveDelivery() {
		saveAddButon.click();
	}
}
