package mouse_actions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_In_Selenium {
	 public static WebDriver driver;
	 
	 @Test
	 public static void Get_Url() throws Exception {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 driver.findElement(By.xpath("//input[@name='proceed']")).click();
		 Thread.sleep(3000);
		 
		 //driver.switchTo().alert().accept();
		 
		 //driver.switchTo().alert().dismiss(); -- for canceling alert box
		 
		 // if you want text on the pop-up or alert box
		  Alert alert = driver.switchTo().alert(); //this will return alert info if you use getText() return type should be a String
		  String alertText = alert.getText();
		  System.out.println(alertText);
		  alert.accept();
		 
		 // sometimes we have text after click on alert box that time we can use like below
//		 String text = driver.findElement(By.name("proceed")).getText();
//		 if(text.equals("sign in")) {
//			 Assert.assertTrue(true);
//		 }
//		 else {
//			 Assert.assertTrue(false, "actural text is"+ text);
//		 }
//		 System.out.println(text);
	}
}