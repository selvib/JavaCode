package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Action_Selenium {
	
	public static WebDriver driver;
	public static Actions action;
	
	@BeforeMethod
	public static void keyboard_Action_Mouse() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public static void Keyboard_Google() throws Exception {
		
		WebElement tagetObj = driver.findElement(By.name("q"));
		 
		 action = new Actions(driver);
		 
		 Action sendValues = action.keyDown(tagetObj, Keys.SHIFT).sendKeys("gmail").keyUp(tagetObj, Keys.SHIFT).build();
		 sendValues.perform();
		 Thread.sleep(2000);
	}
	@Test
	public static void keyboard_Action_FB() throws Exception {
		 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//			driver.findElement(By.xpath("//div[@id='fullname_field']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::input[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@id='fullname_error_msg']/parent::div[1]/child::div[1]/child::div[2]/child::div[1]/child::div[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@id='fullname_error_msg']/parent::div[1]/following-sibling::div[1]/child::div[1]/child::div[1]/child::input[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[@id='fullname_error_msg']/parent::div[1]/following-sibling::div[3]/child::div[1]/child::div[1]/child::input[1]")).click();;
			
			
		WebElement f_name = driver.findElement(By.xpath("//div[@id='fullname_field']/child::div[1]/child::div[1]/child::div[1]/child::div[1]/child::input[1]"));
		WebElement s_name = driver.findElement(By.xpath("//div[@id='fullname_error_msg']/parent::div[1]/child::div[1]/child::div[2]/child::div[1]/child::div[1]"));
		WebElement m_num = driver.findElement(By.xpath("//div[@id='fullname_error_msg']/parent::div[1]/following-sibling::div[1]/child::div[1]/child::div[1]/child::input[1]"));
		WebElement pass = driver.findElement(By.xpath("//div[@id='fullname_error_msg']/parent::div[1]/following-sibling::div[3]/descendant::div[2]/child::input[1]"));
			
		action = new Actions(driver);
		Thread.sleep(3000);	
			
		action.keyDown(f_name, Keys.SHIFT).sendKeys("selvi").keyUp(f_name, Keys.SHIFT).build().perform();
		Thread.sleep(2000);
			
		action.keyDown(s_name, Keys.SHIFT).sendKeys("balusamy").keyUp(s_name, Keys.SHIFT).build().perform();
		Thread.sleep(2000);
			
		action.keyDown(m_num, Keys.SHIFT).sendKeys("testing@gmail.com").keyUp(m_num, Keys.SHIFT).build().perform();
		Thread.sleep(2000);
			
		action.keyDown(pass, Keys.SHIFT).sendKeys("meena963").keyUp(pass, Keys.SHIFT).build().perform();
	}
		 
	@AfterMethod
	public static void Close_Url() {
		driver.close();
		//driver.quit();
	}

}
