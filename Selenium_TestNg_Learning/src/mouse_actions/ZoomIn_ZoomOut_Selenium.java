package mouse_actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomIn_ZoomOut_Selenium {

	public static WebDriver driver;
	
	@Test
	public static void ZoomIn_ZoomOut() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://openweathermap.org/");
		
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='40%'");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%'");
	}
}

