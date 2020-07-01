package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Enabled_Disabled_Verify {

	public static WebDriver driver;
	@Test
	public static void Is_Enabled_Disabled() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com");
		//System.out.println(driver.findElement(By.xpath("(//input[@name='custom_date_picker'])[3]")).isEnabled()); 
		//String before_Cal = driver.findElement(By.xpath("(//input[@name='custom_date_picker'])[3]")).getAttribute("opacity");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		Thread.sleep(3000);
		String before_Cal = driver.findElement(By.xpath("(//div[@class='home-date-div datehome'])[2]")).getAttribute("style");
		System.out.println(before_Cal);
		driver.findElement(By.xpath("(//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay'])[1]")).click();
		String After_Cal = driver.findElement(By.xpath("(//div[@class='home-date-div datehome'])[2]")).getAttribute("style");
		System.out.println(After_Cal);
		
		Thread.sleep(3000);

		
		if(After_Cal.contains("0.5")) {
			System.out.println("ITs Disabled");
			System.out.println(before_Cal);
			System.out.println(After_Cal);
			Assert.assertTrue(true);
			
		}
		else {
			System.out.println("Its Enabled");
			Assert.assertTrue(false);
		}

	   /*	if(before_Cal != After_Cal) {
			Assert.assertTrue(true);
			System.out.println("ITs Disabled");
			System.out.println(before_Cal);
			System.out.println(After_Cal);
		}
		else {
			System.out.println("Its Enabled");
			Assert.assertTrue(false);
		} 	*/
				
	}
	
}
