package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table_Value_Row_Column {
	public static WebDriver driver;
	
	@Test
	public static void Get_Value() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//It will take the value from 3rd row which is present at runtime ..here we hard code the row and column 
		String rowdata = driver.findElement(By.xpath(" ")).getText();
		System.out.println("Data Of Row Static webtable :" + rowdata);
		//*[@id=\'leftcontainer\']/table/child::tbody/child::tr[3]/child::td[4]
		//It will take the mentioned row value because we have given relative / reference xpath ...If Position of Goldstone Tech this xpath will correct value of Goldstone
		//Dyanamic web table means position or row may change in future
		rowdata = driver.findElement(By.xpath("//a[contains(text(),'Goldstone Tech')]/parent::td[1]/following-sibling::td[3]")).getText();
		System.out.println("Data Of Row Dyanamic webtable:" + rowdata);
	}

}










