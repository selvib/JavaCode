package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Current_Calendar {
	public static WebDriver driver;
	
	@Test
	public static void Select_Current_Date() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']/preceding-sibling::input[2]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.className("ui-state-default ui-state-highlight ui-state-active")).click();
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); -- cssSelector
		driver.findElement(By.xpath("//div[@class='ui-datepicker-row-break']/preceding-sibling::div[2]/descendant::tbody[1]/child::tr[4]/descendant::a[1]")).click();
		}
	}
