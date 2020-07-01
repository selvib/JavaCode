package mouse_Ajax_Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Same_Month {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		//For Specific Month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November 2020")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		
		// For Specific date
		
		//First grab the common attribute and put it in list and iterate that
		List<WebElement> date = driver.findElements(By.cssSelector(".day"));
		int date_Count = driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0; i<date_Count; i++) {
			String date_Text = date.get(i).getText();
			if(date_Text.equalsIgnoreCase("30")){
				Thread.sleep(3000);
				date.get(i).click();
				break;
			}
		}
	}

}
