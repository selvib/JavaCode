package Drop_Down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestive_Text_Verify_GetAtttribute {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("input[id='autocomplete']")).click();
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("ind");
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);	
		
//getAttribute can grab the text which is present on the text box which we have selected but getText can't grab the hidden text
		String text = driver.findElement(By.cssSelector("input[id='autocomplete']")).getAttribute("value");
		System.out.println(text);
	}

}
