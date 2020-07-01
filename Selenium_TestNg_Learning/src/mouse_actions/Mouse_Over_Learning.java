package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Over_Learning {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		
		Actions action = new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform(); By ID
		
		//WebElement features = driver.findElement(By.linkText("Features")); BY Linklist
		//action.moveToElement(features).build().perform(); 
		
		// OR
		
		action.moveToElement(driver.findElement(By.linkText("Features"))).build().perform();
		
	}

}







