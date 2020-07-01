package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over_Click_Element {
	
	public static WebDriver driver;
	@BeforeMethod
	public void Mouse_Movement() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement features = driver.findElement(By.linkText("Features")); 
		action.moveToElement(features).build().perform(); 
	}
	
	@Test
	public void Click_Inside_Element() throws InterruptedException {
		
		driver.findElement(By.linkText("Work Scope Management")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("cookie-button--got-it")).click();
	}
	
	@AfterMethod
	public static void Close_Url() {
		driver.close();
	}
	
}
