package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Java_Script_Click_Send {

 public static WebDriver driver;
	 
	 @Test
	 public static void Using_Js() throws Exception {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 
		 JavascriptExecutor webdriver = (JavascriptExecutor)driver;
		 webdriver.executeScript("document.getElementById('login1').setAttribute('value','selvi')");
		 webdriver.executeScript("document.getElementById('password').setAttribute('value','selvi')");
		 webdriver.executeScript("arguments[0].click();",driver.findElement(By.name("proceed")));
	 }
}