package assignment_Croma;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenSource_HRM {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.xpath("//input[@name='txtUsername']")).click();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		WebElement job = driver.findElement(By.xpath("//a[text()='Job']"));
		System.out.println(job);
		WebElement pay = driver.findElement(By.xpath("//a[text()='Pay Grades']"));
		System.out.println(pay);

		Actions action = new Actions(driver);

		action.moveToElement(admin).moveToElement(job).moveToElement(pay).click().build().perform();

		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.xpath("//input[@id='payGrade_name']")).click();
		driver.findElement(By.xpath("//input[@id='payGrade_name']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();

		driver.findElement(By.id("btnAddCurrency")).click();

		driver.findElement(By.xpath("//input[@id='payGradeCurrency_currencyName']")).click();
		driver.findElement(By.xpath("//input[@id='payGradeCurrency_currencyName']")).sendKeys("do");
		driver.findElement(By.xpath("//li[text()='AUD - Australian ']")).click();
		driver.findElement(By.xpath("//input[@id='payGradeCurrency_minSalary']")).click();
		driver.findElement(By.xpath("//input[@id='payGradeCurrency_minSalary']")).sendKeys("250");
		driver.findElement(By.xpath("//input[@id='payGradeCurrency_maxSalary']")).click();
		driver.findElement(By.xpath("//input[@id='payGradeCurrency_maxSalary']")).sendKeys("270");
		driver.findElement(By.id("btnSaveCurrency")).click();

		driver.findElement(By.xpath("//input[@value='AUD']")).click();
		driver.findElement(By.id("btnDeleteCurrency")).click();
		
		WebElement job1 = driver.findElement(By.xpath("//a[text()='Job']"));
		System.out.println(job1);
		WebElement pay1 = driver.findElement(By.xpath("//a[text()='Pay Grades']"));
		System.out.println(pay1);
		Thread.sleep(5000);
		action.moveToElement(job1).moveToElement(pay1).click().build().perform();
		driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[4]/td/input")).click();
		
		driver.findElement(By.id("btnDelete")).click();
		String text = driver.findElement(By.xpath("//p[text()='Delete records?']")).getText();
		System.out.println(text);
		driver.findElement(By.id("dialogDeleteBtn")).click();



	}
}
