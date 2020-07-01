package Selenium_Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import beta.Samp;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Google_Log4j {
	
public static WebDriver driver;
private static Logger log = LogManager.getLogger(Samp.class.getName());

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selvi");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
		log.info("I Successfully Entered");
		
		
	}

}
