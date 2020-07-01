package Drop_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drop_Down_Auto_Suggestive {
	public static WebDriver driver;
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.findElement(By.xpath("//span[contains(text(),'Please select your current location')]")).click();
		//input[@name='location']/parent::div
		//input[@name='location']/parent::div[1]/child::span[1]
		//Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Please select your current location')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Please select your current location')]")).sendKeys("noi");
		//driver.findElement(By.cssSelector("span[class='multiselect__single modal-ref-class textWrapperBold']")).sendKeys(Keys.DOWN);
		
	

		

	}

}
