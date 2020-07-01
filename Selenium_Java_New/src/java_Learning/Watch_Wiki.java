package java_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Watch_Wiki {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and  @name='q']")).sendKeys("watch", Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h3[contains(text(),'Watches: Buy Wrist Watches for Men online at best prices in ...')]")).click();

	}

}
