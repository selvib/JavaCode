package java_Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Pagination {
public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		driver.get("https://mdbootstrap.com/docs/jquery/tables/pagination/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		boolean bln =true;
		do{
			WebElement table = driver.findElement(By.cssSelector(".table.table-striped.table-bordered.dataTable"));
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			
			for(WebElement row : rows) {
				List<WebElement> cols = row.findElements(By.tagName("td"));
				for(WebElement col : cols) {
					System.out.print(col.getText() + " ");
				}
				System.out.println("");
			}	
			
			 WebElement next = driver.findElement(By.xpath("//a[text()='Next']"));
			 WebElement enabled = driver.findElement(By.cssSelector(".paginate_button.page-item.next"));
			 if(enabled.getAttribute("class").equalsIgnoreCase("paginate_button page-item next")) {
				 next.click();
			 }
			 else
				 break;
			 
		}
		while(bln);

	}

}
