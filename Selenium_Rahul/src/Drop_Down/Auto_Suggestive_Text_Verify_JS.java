package Drop_Down;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestive_Text_Verify_JS {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id='autocomplete']")).click();
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("uni");
		
//		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
//		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);

		//here we are not able to grab the hidden text
		System.out.println(driver.findElement(By.cssSelector("input[id='autocomplete']")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//he we can grab the text
		String value = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(value); 
		System.out.println(text);
		
		String exe = "United Kingdom (UK)";
	
	
		//what if while get false it will keep on loop until it become false it will never get false it 
		//always true so we limiting key down by giving counting
		int i=0;
		while(!text.equalsIgnoreCase(exe)) {
			i++;
			driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			text = (String) js.executeScript(value); 
			System.out.println(text);
			if(i>10) {
				break;
			}
			
		}

		if(i>7) {
			System.out.println("Eelement not found");
		}
		else {
			System.out.println("Eelement  found");
		}
	
	}

}
