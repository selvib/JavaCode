package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//driver.findElement(By.xpath("//a[@ class='signin']")).click();
		//driver.findElement(By.className("mailicon")).click();
		//driver.findElement(By.className("vdicon")).click();
		//driver.findElement(By.className("sensex")).click();
		//driver.findElement(By.className("getqbtn")).click();
		//driver.findElement(By.className("newsrchbtn")).click();
		//driver.findElement(By.id("bseindex")).click();
		driver.findElement(By.className("signin")).click();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password' and @name='passwd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		driver.findElement(By.xpath("//a[@class='rd_logout']")).click();
		
		//driver.findElement(By.xpath("//input[@name='proceed'")).sendKeys(Keys.ENTER);
		
		
	
	}
}
