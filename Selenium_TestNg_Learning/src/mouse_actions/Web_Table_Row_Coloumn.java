package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table_Row_Coloumn {

	public static WebDriver driver;
	
	@Test
	public static void Row_Column_WebTable() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily");
		driver.manage().window().maximize();
		// Will Wait Until That Url Get Load / Entire Page / DOM Of The Webpage
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//table[@class='dataTable']/child::tbody/child::tr")).getSize();
		 int rowNum = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/child::tbody/child::tr")).size();
		System.out.println("Num Of Rows Are : " + rowNum);
		
		int colNum = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/child::tbody/child::tr/child::td")).size();
		System.out.println(" ***************************** "); 
		System.out.println("Num Of Columns Are :" + colNum);
		System.out.println(" ***************************** ");
	}

	
}
