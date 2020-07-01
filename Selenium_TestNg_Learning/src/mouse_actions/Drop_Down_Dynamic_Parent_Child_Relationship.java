package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down_Dynamic_Parent_Child_Relationship {

	public static WebDriver driver;
	@Test
	public static void Dynamic_Drop_Down_Relationship() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("(//div[@class='right text-lt '])[1]/child::input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[contains(text(),' Coimbatore (CJB)')]")).click();
	}
}
