package Drop_Down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestive_Drop_Down {
	public static WebDriver driver;
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.makemytrip.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.id("fromCity")).click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object ele = js.executeScript("document.getElementsByClassName(\"multiselect__tags modal-ref-class boxWrapper\")[0]");
		
			
//			driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys("mun");
//			driver.findElement(By.xpath("//p[text()='Mundra, India']")).sendKeys(Keys.DOWN);
//			driver.findElement(By.xpath("//p[text()='Mundra, India']")).sendKeys(Keys.DOWN);
			
//			driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys(Keys.DOWN);
//			driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys(Keys.DOWN);
//			driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys(Keys.DOWN);
//			driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open")).sendKeys(Keys.DOWN);
			

	}

}
