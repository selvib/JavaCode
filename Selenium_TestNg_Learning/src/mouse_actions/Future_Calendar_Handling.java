package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Future_Calendar_Handling {

	public static WebDriver driver;
	static String month_Cal = "Junly,2020";
	String date = "06";
	
	@Test
	public static void Selecting_Future_Date() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://phptravels.net/home");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[3]/svg")).click();
		driver.close();
		WebElement mon = driver.findElement(By.xpath("//div[@id='datepickers-container']/descendant::nav[1]/descendant::i[1]"));
		while(true) {
			if(mon.getText().equals(month_Cal)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[2]/nav/div[3]/svg")).click();
			}
			
		}
	}
	
	
}
