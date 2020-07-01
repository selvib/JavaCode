package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop_Mouse_Actions {

	public static WebDriver driver;
	 
	 @Test
	 public static void Js_Method_Selenium() throws Exception {
		 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://jqueryui.com/droppable/");
		 
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		 WebElement sourceObj = driver.findElement(By.cssSelector("#draggable"));		
		 WebElement targetObj = driver.findElement(By.cssSelector("#droppable"));
		 Actions action = new Actions(driver);
		 Thread.sleep(5000);
		 action.dragAndDrop(sourceObj, targetObj).build().perform();
		 Assert.assertEquals(targetObj.getText(), "Dropped!");
	 }
}
