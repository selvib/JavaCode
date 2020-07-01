package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_In_Selenium {

	public static WebDriver driver;
	@Test
	public static void Scroll_In() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.navigate().to("https://openweathermap.org/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		//This will Navigate to till end.. 
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
		// This will come back till up
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(3000);
		
		// THis will go till the pixel specified
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(3000);
		
		// This will come back till the pixel specified
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -1500)");
		Thread.sleep(3000);
		 
		// This will go till object specified
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[contains(text(), 'Connect')]")));
		
	
	}
}
