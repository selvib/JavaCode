package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table_All_Value {
	public static WebDriver driver;
	@Test
	public static void Get_All_Value() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily");
		
		String row = "//*[@id=\'leftcontainer\']/table/child::tbody/child::tr";
		int rowData = driver.findElements(By.xpath(row)).size();
		String col = "//*[@id=\'leftcontainer\']/table/child::tbody/child::tr/td";
		int colData = driver.findElements(By.xpath(col)).size();
		
		String first_Part = "//*[@id='leftcontainer']/table/child::tbody/child::tr[";
		String second_Part = "]/td[";
		String third_Part = "]";
			
		for(int i=1; i<=rowData; i++) {
			for(int j=1; j<=colData; j++) {
				String final_Part = first_Part+ i + second_Part + j + third_Part;
				System.out.println(final_Part);
				String text = driver.findElement(By.xpath(final_Part)).getText();
				System.out.print(text + " | ");
			}
			System.out.println();
		}
	}
}
