package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*import org.openqa.selenium.WebElement;*/
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Learn_Select {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']"))); // we can declare this also public static Select select.
		select.selectByVisibleText("30"); //we can use different name for object reference of Select class
		select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText("Nov");
		select = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		select.selectByVisibleText("1994");
		
	    /* WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select = new Select(day);
		select.selectByValue("30");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		select = new Select(month);
		select.selectByIndex(11);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		select = new Select(year);
		select.selectByVisibleText("1993"); */
	}

}
