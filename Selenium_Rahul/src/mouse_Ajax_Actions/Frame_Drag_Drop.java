package mouse_Ajax_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		WebElement srce = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(srce, target).build().perform();
		
		driver.switchTo().defaultContent();

	}

}
