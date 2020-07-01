package testng_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Using_Testng {
	public static WebDriver driver;
	
	@BeforeMethod
	public static void Rediff_Initialization() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https:\\rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	@Test
	public static void ValidatingTitleRediff() {
		System.out.println(driver.getTitle());
		String LandingPageTitle=driver.getTitle();
		if(LandingPageTitle.equals("Rediff.com: News | Rediffmail | Stock Quotes | Shopping")) {
			System.out.println("This is valid testcase");
			
		} else {
			System.out.println("this is invalid testcase");
		}
	}
	@Test
	public static void LoginValidation() {
		
	}
}
