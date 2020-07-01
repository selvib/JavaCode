package automationwebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Weather_Org {
	public static WebDriver driver;
	//public static ChromeDriver driv;
	@BeforeMethod
	public static void Title_Open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driv = new ChromeDriver();
		driver.get("https://openweathermap.org/");
		driver.manage().window().maximize();
		
		
	}
	@Test
	public static void Signin_Open() {
		driver.findElement(By.xpath("//a[@class='first-child']/following-sibling::a[2]")).click();
		driver.findElement(By.xpath("//div[@class='pwd-lost']/preceding-sibling::form[1]/child::div[1]/descendant::input[1]")).sendKeys("3003mathuselvi@gmail.com");
		driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys("mathu@selvi");
		driver.findElement(By.xpath("//div[@class='sign-form']/child::form/descendant::input[7]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@class='first-child']/following-sibling::a[1]")).click();
	}

}
