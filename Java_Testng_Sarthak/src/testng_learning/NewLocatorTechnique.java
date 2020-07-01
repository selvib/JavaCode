package testng_learning;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewLocatorTechnique {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		System.out.println(driver.getTitle());

       
		driver.findElement(new ByChained(By.xpath("//p[@id = 'signin_info']"), By.xpath("//a[@class= 'signin']"))).click();
	
		Thread.sleep(2000);
		//ByIdOrName - for that element at least id should be there or name should be there.
	   driver.findElement(new ByIdOrName("login1")).sendKeys("seleniumpanda@rediffmail.com");
	
	   Thread.sleep(2000);
	 //ByAll - you can add everything but all the values should be exact
	   driver.findElement(new ByAll(By.id("password"), By.name("passwd"))).sendKeys("Selenium@123");
	   
	   //ByChained - it will follow hierarchy
	   driver.findElement(new ByChained(By.xpath("//div[@id = 'div_login_error']/following-sibling::div[1]/descendant::div[6]"), By.xpath("//div[@id = 'div_login_error']/following-sibling::div[1]/descendant::div[6]/child::input[@class = 'signinbtn']"))).click();
		


	}

}
