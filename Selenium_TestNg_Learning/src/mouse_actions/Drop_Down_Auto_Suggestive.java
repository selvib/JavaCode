package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down_Auto_Suggestive {

	public static WebDriver driver;
	@Test
	public static void Auto_Suggestive_Drop_Down() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//input[@id='fromCity']")).clear();
		driver.findElement(By.id("fromCity")).click();
//		driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("mum");
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		
//		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		
		driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("de");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//p[contains(text(),'Dehradun, India')]")).click();
	}
}


