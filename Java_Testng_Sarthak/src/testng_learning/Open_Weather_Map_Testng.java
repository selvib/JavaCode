package testng_learning;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Weather_Map_Testng {
	public static WebDriver driver;
	public Actions action;
	
	@BeforeTest
	public void OpenUrl() {
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobar");
		options.addArguments("--disable-notifications");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://openweathermap.org/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void SignUplink() throws Exception {
		 driver.findElement(By.xpath("//div[@class='row']/child::div/a[contains(text(),'Sign Up')]")).click();
		 //clicking on the footer which is disturbing
		 driver.findElement(By.xpath("//button[@class = 'stick-footer-panel__link']")).click();
		 driver.findElement(By.xpath("//input[@id='user_username']")).sendKeys("UshaMul");
		 driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("usha@gmail.com");
		 driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("dhruv@10");
		 driver.findElement(By.xpath("//input[@id='user_password_confirmation']")).sendKeys("dhruv@10");
		 driver.findElement(By.xpath("//input[@id='agreement_is_age_confirmed']")).click();
		    
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, 300 )");
		    
		    
		 driver.findElement(By.id("agreement_is_accepted")).click();
		 driver.findElement(By.xpath("//input[@id='mailing_system']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='mailing_product']")).click();
		 driver.findElement(By.xpath("//input[@id='mailing_news']")).click();
		    
		 driver.findElement(By.xpath("//div[@class = 'recaptcha-checkbox-border']")).click();
		    
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0, 400 )");
		    
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='commit']/self::input[1]")).click();
		   
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
