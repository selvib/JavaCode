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


public class Sort_WebTable_Coloum {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		List<WebElement> all_Item = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originial_Item = new ArrayList<String>();

		for (WebElement s : all_Item) {
			originial_Item.add(s.getText());
		}
		System.out.println("*********Original Item********");
		System.out.println(originial_Item);

		ArrayList<String> copied_Item = new ArrayList<String>();

		for (String s : originial_Item) {
			copied_Item.add(s);
		}

		System.out.println("*********Copied Item********");
		System.out.println(copied_Item);
		
		Collections.sort(copied_Item);
		
		System.out.println("********* Copied Item After Sorting ********");
		System.out.println(copied_Item);
		
		Assert.assertTrue(originial_Item.equals(copied_Item));
		
		}

}
