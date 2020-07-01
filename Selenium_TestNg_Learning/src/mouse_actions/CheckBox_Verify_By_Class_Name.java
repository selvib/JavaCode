package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox_Verify_By_Class_Name {

	public static WebDriver driver;
	@Test
	public static void Check_Box_Verify() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='widget']/descendant::label[1]/child::span[1]")).click();
		String class_Name = driver.findElement(By.xpath("//div[@class='widget']/descendant::label[1]")).getAttribute("class");
		System.out.println(class_Name);
		if(class_Name.contains("ui-checkboxradio-checked ui-state-active")) { // we cant use containsequals coz we dont know what will come
		
			Assert.assertTrue(true, "Check_Box_Verify Is Passed");
		}
		else {
			Assert.assertTrue(false, "Check_Box_Verify Is Failed");
		}
		 
		
		
	}
}
