package mouse_actions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_All_Link {

	public static WebDriver driver;
	@Test
	public static void All_Link_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 
		 System.out.println(links); // it will print list of all webelement in form of list
		 System.out.println(links.size());
		 
		 ArrayList<String> data = new ArrayList<String>();
		 
		 for(int i=0; i<links.size(); i++) {
			 
			 //System.out.println(links.get(i));
			 System.out.println(links.get(i).getText()); //this will get the text of particular link of the application
			 data.add(links.get(i).getAttribute("href"));
			 System.out.println(links.get(i).getAttribute("href"));
		 }
		 
		 System.out.println(data.size());
	}
}
