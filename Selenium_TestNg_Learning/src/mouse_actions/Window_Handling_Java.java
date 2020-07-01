package mouse_actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handling_Java {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"social_block\"]/ul/li[3]/a")).click();
		Set<String> windowsId = driver.getWindowHandles();	
		System.out.println(" Id " + windowsId);

		Iterator<String> itr = windowsId.iterator();
		String parentId = itr.next();	
			
		String childId = itr.next();
		//switch to face book window
		driver.switchTo().window(childId);
		//close face book window
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();		
		
		//switch to parent application window
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		}
	}
