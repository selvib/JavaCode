package web_Table;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Reverse_WebTable_Coloum {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		List<WebElement> element = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> original_Item = new ArrayList<String>();
		for (int i = 0; i < element.size(); i++) {
			original_Item.add(element.get(i).getText());
		}
		// System.out.println(original_Item);

		ArrayList<String> copied_Item = new ArrayList<String>();

		for (int i = 0; i < original_Item.size(); i++) {
			copied_Item.add(original_Item.get(i));
		}

		Collections.sort(copied_Item);
		Collections.reverse(copied_Item);

		System.out.println("********After Reversing Copied Item**********");
		for (String s : copied_Item) {
			System.out.println(s);
		}

		System.out.println("********Original Item**********");
		for (String s : original_Item) {
			System.out.println(s);
		}

		// TestNG Validation
		Assert.assertTrue(original_Item.equals(copied_Item));
	}

}
