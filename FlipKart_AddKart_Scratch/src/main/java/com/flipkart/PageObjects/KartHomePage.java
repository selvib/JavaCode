package com.flipkart.PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KartHomePage {
	WebDriver driver;

//	@FindBy(xpath="(//ul[@class='row']/descendant::button)[1]")
//	@FindBy(xpath = "//div[text()='Product Description']")
//	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	@FindBy(xpath = "//div[@class='_3BTv9X _3iN4zu']/child::img")
	WebElement img;

//	@FindBy(xpath = "(//div[@class='bhgxx2 col-12-12'])[2]/descendant::ul[1]/child::li[1]/child::button[1]")
//	@FindBy(xpath = "//ul[@class='row']/child::li[1]/child::button[1]")
//	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
//	@FindBy(css = "._2AkmmA._2Npkh4._2MWPVK")
//	@FindBy(xpath = "(//div[@class='bhgxx2 col-12-12'])[2]/child::div/child::ul/child::li[1]")
	@FindBy(css = "._3oJBMI")
	WebElement addKart;

	@FindBy(xpath = "(//button[@class='_2AkmmA DoInvC'])[2]")
	WebElement close;

	public KartHomePage(WebDriver driver) throws IOException {
		PageFactory.initElements(this.driver=driver, this);
	}

	public boolean verifyKartHome() {
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
//				production);

//		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3BTv9X _3iN4zu']/child::img")));
		return img.isDisplayed();
//		return productdesc.getText();
	}

//	public WebElement click_AddKart() {
//
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(40))
//				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
//
//		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//
//			public WebElement apply(WebDriver driver) { // this is the customized method of visibilityOfElementLocated
//				if (addKart.isDisplayed()) {
//					return addKart;
//				} else
//					return null;
//			}
//
//		});
//		return addKart;
//	}

	public void click_AddKart() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(
//				By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("._3oJBMI")));

		JavascriptExecutor sExecutor = (JavascriptExecutor) driver;
		sExecutor.executeScript("arguments[0].scrollIntoView(true);", addKart);
		sExecutor.executeScript("arguments[0].click()", addKart);
//		addKart.click();
	}
}
