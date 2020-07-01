package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ease_Login {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/?gclid=EAIaIQobChMIldH9mv-H6AIVyA0rCh0xPAR3EAAYASAAEgJuxvD_BwE");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='sub_header_link3']/child::span[1]")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"divSignInPnl\"]/a[1]")).sendKeys(Keys.ENTER);
		
		/*driver.findElement(By.id("txtusername")).sendKeys("8327752761");
		driver.findElement(By.id("Password1")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//div[@class='conf1']/following-sibling::div[2]/child::input[1]")).click();
		driver.findElement(By.id("welcome-det-User")).click();
		driver.findElement(By.xpath("//div[@class='booking_pnl']/child::span[1]/child::a[2]")).click();*/
	}

}
