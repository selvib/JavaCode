package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrame_In_Selenium {

	public static WebDriver driver;
	
	@Test
	public static void IFrame_Learning() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'IFrame practice page')]")).click();
		
		Thread.sleep(3000);
		
		// we have to mention iframe before locating element
		//driver.findElement(By.xpath("//a[contains(text(),'Skip to content')]")).click();
		//driver.findElement(By.xpath("//div[@class='top-bar-bg']/parent::div[1]/parent::div[1]/parent::div[1]/child::a[1]")).click();
		
		//here we identify the iframe by index of iframe
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[contains(text(),'Skip to content')]")).click();
		
		/*switchTo frame by using name of the iframe
		driver.switchTo().frame("");
		
		switchTo the frame by using object of the iframe..
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe1']")));
		*/
		
		/*frame inside the another frame..we can use any combination or same method
		
		driver.switchTo().frame(0).switchTo().frame(1);
		driver.switchTo().frame("").switchTo().frame(Object);
		driver.switchTo().frame("").switchTo().frame(Object);
		*/
		
		driver.switchTo().defaultContent();
		
	}
}
