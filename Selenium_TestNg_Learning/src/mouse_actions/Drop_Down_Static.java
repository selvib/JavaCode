package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down_Static {

	public static WebDriver driver;
	@Test
	public static void Static_Drop_Down() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\'divpaxinfo\']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(6000);
		
		//Select select = new Select(driver.findElement(By.xpath("//p[@id='adultDropdown']/descendant::span[4]")));
		
		//Select select = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
		
		Select select = new Select (driver.findElement(By.xpath("//p[@id='adultDropdown']/child::select[1]")));
		Thread.sleep(3000);
		select.selectByVisibleText("5");
		Thread.sleep(2000);
		select = new Select(driver.findElement(By.xpath("//p[@id='adultDropdown']/following-sibling::p[1]/child::select[1]")));
		select.selectByValue("2");
		Thread.sleep(2000);
		select = new Select(driver.findElement(By.xpath("//p[@id='adultDropdown']/following-sibling::p[2]/child::select[1]")));
		select.selectByIndex(3);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}
	
}
