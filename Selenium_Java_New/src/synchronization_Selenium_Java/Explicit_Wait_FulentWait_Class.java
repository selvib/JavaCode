package synchronization_Selenium_Java;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Explicit_Wait_FulentWait_Class {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		//fluentwait cant understand what type of driver this so explicitly we've to mention webdriver
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
								.pollingEvery(Duration.ofSeconds(3))
								.ignoring(NoSuchElementException.class);
		
		 WebElement foo = wait.until(new Function <WebDriver, WebElement>(){
			
//this apply method expecting webelement to return.. it will check the return type webelement with foo variale if it does not match again it will wait for next polling
			public WebElement apply(WebDriver driver) {  //this is the customized method of visibilityOfElementLocated
				//the element already present in the page thats why isDisplayed is false but that is in invisible mode.. this is not render dynamically its static html
				//so it should wait until elements in visible mode
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
				else
					return null;
				}
			
		 	});
		 //thats why its give false its present but not displayed in the front screen
		 System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		 WebElement koo = driver.findElement(By.cssSelector("[id='finish'] h4"));
		 System.out.println(koo);
		 System.out.println(foo);
			
	}
}


