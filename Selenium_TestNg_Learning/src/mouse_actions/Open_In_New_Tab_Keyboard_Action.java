package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_In_New_Tab_Keyboard_Action {

	public static WebDriver driver;
	
	@Test
	public static void Open_In_New_Tab() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		WebElement pro_Link = driver.findElement(By.xpath("//a[contains(text(), 'Projects')]"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(pro_Link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();		
		
	}
	
}
