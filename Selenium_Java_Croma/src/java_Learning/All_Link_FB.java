package java_Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Link_FB {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		int link_Count = driver.findElements(By.tagName("a")).size();
		System.out.println(link_Count);

		List<WebElement> wb = driver.findElements(By.tagName("a"));
		for (WebElement text : wb) {
			System.out.println(text.getText().trim() + " : " + text.getAttribute("href"));

		}

	}

}
