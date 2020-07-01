package web_Table;

import java.text.NumberFormat;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Specific_Column {
	public static WebDriver driver;
	public static void main(String[] args) throws ParseException {
	
	
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://money.rediff.com/gainers/bsc/daily");
			
			driver.findElement(By.xpath("//div[@id='leftcontainer']//div[4]/strong[1]")).click();
			WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
			
			int row = table.findElements(By.cssSelector("table[class='dataTable'] tbody tr")).size();
			System.out.println(row);
			int column = table.findElements(By.cssSelector("table[class='dataTable'] tbody tr td:nth-child(3)")).size();
			//System.out.println(column);
			
			Double sum =0.0;
			for(int i=0; i<column-1600; i++) { //limited the column value
				System.out.println(column);
				String value = table.findElements(By.cssSelector("table[class='dataTable'] tbody tr td:nth-child(3)")).get(i).getText();
				System.out.println(value);
				//1,719.25 for this we get NumberInstance
				NumberFormat format = NumberFormat.getNumberInstance();
				Number f_Value = format.parse(value);
				//here directly we cant parse into Double .. first we have to convert to string
				String f_String = f_Value.toString();
				Double f = Double.parseDouble(f_String);
				sum=sum+f;
			}
			System.out.println(sum);

	}

}
