package browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //control+shift+O to import stuff.WebDriver is I/F.ChromeDriver is Class.Driver is Object Reference.
		driver.manage().window().maximize();//First in Trim to maximize.manage() is managing window.
		driver.get("https://rediff.com");
		
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());// to get the text of alert box 
		alert.accept();
		 
	}

}
