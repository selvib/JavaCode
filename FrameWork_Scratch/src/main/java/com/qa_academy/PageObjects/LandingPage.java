package com.qa_academy.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

//By giving Private child class can't do any operation on this variable if not we can call driver.findElement in child class for this variable
	private By add = By.xpath("//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]");

	private By login = By.cssSelector("a[href*='sign_in']");

	private By text = By.xpath("(//div[@class='text-center'])[1]");

	private By navi = By.cssSelector(".nav.navbar-nav.navbar-right");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement click_Ad() {
		return driver.findElement(add);

	}

	public Login_Page Click_Login() {
		driver.findElement(login).click();
		Login_Page lp = new Login_Page(driver);
		return lp;
	}

	public WebElement getTitles() {
		return driver.findElement(text);
	}

	public WebElement isDis() {
		return driver.findElement(navi);
	}

}
