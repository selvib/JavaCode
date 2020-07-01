package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_Selenium {

	public static WebDriver driver;
	@Test
	public static void Assertion() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
		//Assert.assertFalse(true);--if it find true it will fail the test execution. 
		driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected());
	
		
		
	}
}
