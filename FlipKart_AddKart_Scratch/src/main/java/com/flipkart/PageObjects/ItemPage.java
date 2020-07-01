package com.flipkart.PageObjects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
WebDriver driver;
	@FindBy(xpath = "//div[text()='My Account']")
	WebElement myAccount;

	@FindBy(name = "q")
	WebElement enter;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg/g/path[2]")
	WebElement search;

	@FindBy(xpath="(//div[@class='_3O0U0u'])[1]")
//	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div")
	
	WebElement item;

	public ItemPage(WebDriver driver) throws IOException {
		PageFactory.initElements(this.driver=driver, this);
	}

	public String display() {
		return myAccount.getText();
	}

	public WebElement enter_Item() {
		return enter;
	}

	public WebElement click_Search() {
		return search;
	}

	public KartHomePage click_Item() throws IOException {
		enter.sendKeys("tv");
		enter.sendKeys(Keys.ENTER);
		item.click();
		return new KartHomePage(driver);
//		return item;
	}

}
