package automationwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Weather_Signup_Automation {
	public static WebDriver driver;
	
	@BeforeTest
	public static void Sign_Up() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://openweathermap.org/");
		driver.manage().window().maximize();		
	}
	
	@Test
	public static void Signup_Automation() throws Exception {
		driver.findElement(By.xpath("//a[@id='nav-search-close']/preceding-sibling::a[3]")).click();
		//clicking on the footer which is disturbing
		driver.findElement(By.xpath("//button[@class = 'stick-footer-panel__link']")).click();//Cookies are overlapping checkbox.this line click on the cookie.
		driver.findElement(By.xpath("//input[@name='user[username]']")).sendKeys("Santhosh R");
		driver.findElement(By.xpath("//input[@name='user[email]']")).sendKeys("mathuselvi3025@gmail.com");
		driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@name='user[password_confirmation]']")).sendKeys("987654321");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='agreement_is_age_confirmed']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 300 )");
		
		driver.findElement(By.id("agreement_is_accepted")).click();
		driver.findElement(By.id("mailing_system")).click();
		driver.findElement(By.id("mailing_product")).click();
		driver.findElement(By.id("mailing_news")).click();
		
		/*driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']/preceding-sibling::div[4]']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 400 )");
		Thread.sleep(1000);*/
		
		driver.findElement(By.xpath("//input[@name='commit']/parent::div[1]")).click();		
	}

	@AfterTest
	public static void Close_Browser() throws Exception {
		Thread.sleep(2000);
		driver.close();//It will close the current window or browser tab.
		//driver.quit(); It will close the whole browser session
	}
}
