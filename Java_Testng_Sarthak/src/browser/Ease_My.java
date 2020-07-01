package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ease_My {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/?gclid=EAIaIQobChMIldH9mv-H6AIVyA0rCh0xPAR3EAAYASAAEgJuxvD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='my_account']/child::div[2]/child::span[1]"));
		driver.findElement(By.xpath("//div[@id='hid1']/preceding-sibling::div[1]/descendant::div[3]/child::div[2]/child::div[4]/descendant::span[1]"));
		driver.findElement(By.xpath("//div[@class='emt_support']/child::div[4]/child::div[2]/child::span[1]"));
		driver.findElement(By.xpath("//div[@class='dropdown-menu3']/preceding-sibling::span[3]"));
		driver.findElement(By.xpath("//div[@id='divSignInPnl']/parent::div[1]/preceding-sibling::span[3]"));
		
		
	}

}
