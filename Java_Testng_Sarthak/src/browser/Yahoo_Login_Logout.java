package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Login_Logout {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.xpath("//div[@class='challenge']/child::form[@id='login-username-form']/descendant::div[@class='form-input-container']/child::input[1]")).sendKeys("mathuselvi@yahoo.com");
		driver.findElement(By.xpath("//div[@class='challenge']/child::form[@id='login-username-form']/descendant::div[@class='form-input-container']/child::input[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='button-container']/preceding-sibling::div[1]/child::input[1]")).sendKeys("9994141567");

	}

}
