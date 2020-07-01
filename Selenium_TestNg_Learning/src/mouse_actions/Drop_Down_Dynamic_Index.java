package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down_Dynamic_Index {

	public static WebDriver driver;
	@Test
	public static void Dynamic_Drop_Down() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("(//div[@class='right text-lt '])[1]/child::input[1]")).click();
		//driver.findElement(By.xpath("//div[@class='search_options_menucontentbg']/parent::div[1]/child::input[1]")).click();
		 //driver.findElement(By.xpath("//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//div[@class='right text-lt '])[2]/child::input[1]")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[contains(text(),' Coimbatore (CJB)')])[2]")).click(); // based on index
		//here if u not give index it will search in from form since selenium looking element from top left to right.. here we have 2 cbj
		//so it will look in the 'from' form not in 'to' form
		
		
	}
}
