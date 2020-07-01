package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Yahoo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		
		//driver.findElement(By.xpath("//div[@class = 'main']/preceding::span[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/form/div[1]/div[3]/input")).sendKeys("mathuselvi");
		driver.findElement(By.xpath("//div[@class='challenge']/child::form[@id='login-username-form']/descendant::div[@class='form-input-container']/child::input[1]")).sendKeys("mathuselvi");
		driver.findElement(By.xpath("//div[@class='challenge']/child::form[@id='login-username-form']/descendant::div[@class='form-input-container']/child::input[1]")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class='button-container']/preceding-sibling::div[1]/child::input[1]")).sendKeys("9994141567");
		//driver.findElement(By.xpath("//input[@name='userName']")).click();
		//driver.findElement(By.xpath("//input[@class='phone-no 'and @id='login-username' and @name='username']")).sendKeys("mathuselvi@yahoo.com");
		//driver.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys(Keys.ENTER);
		
	}

}
