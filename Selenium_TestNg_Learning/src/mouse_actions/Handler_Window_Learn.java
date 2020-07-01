package mouse_actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handler_Window_Learn {
	public static WebDriver driver;
	
	@BeforeTest
	public static void Open_URL() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test
	public static void Handling_Window() throws InterruptedException    {
		driver.findElement(By.id("cookie-button--got-it")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@class='footer__button']/descendant::li[1]/child::a[1]")).click();
	
		//System.out.println(" Id " + windowsId); This Window Id Is Alphanumeric Value and separated by -.....
		
		Set<String> windowsId = driver.getWindowHandles();	
		System.out.println(" Id " + windowsId);

		Iterator<String> itr = windowsId.iterator();
		String parentId = itr.next();	
			
		String childId = itr.next();
	//switch to face book window
		driver.switchTo().window(childId);
		//close face book window
		driver.close();			
		//switch to parent application window
		driver.switchTo().window(parentId);
		
//		String parent = driver.getWindowHandle();
//		Set<String> allWindows = driver.getWindowHandles();
//		int count = allWindows.size();
//		System.out.println("Total Window: "+ count);
//		for(String child:allWindows) {
//			if(!parent.equalsIgnoreCase(child)) {
//				driver.findElement(By.xpath("//div[@class='footer__button']/descendant::li[1]/child::a[1]")).click();
//				driver.switchTo().window(child);
//				Thread.sleep(3000);
//				driver.close();
//			}
//		}
		
		driver.switchTo().window(parentId);
		System.out.println("Parent Id Is:" + parentId + " **** ");
		driver.findElement(By.xpath("//ul[@class='main-menu__ul']/descendant::a[1]")).click();		
	}
	@AfterTest
	public static void Close_Url() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
}







