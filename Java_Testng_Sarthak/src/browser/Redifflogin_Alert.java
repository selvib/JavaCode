package browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redifflogin_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(2000);//explicit wait to particular element
		Alert alert = driver.switchTo().alert();//Alert is an interface.
		System.out.println(alert.getText());
		alert.accept();
	}

}
