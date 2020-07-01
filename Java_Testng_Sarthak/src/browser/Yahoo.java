package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.login.yahoo.com");
		
		//driver.findElement(By.xpath("//body"))
		//driver.findElement(By.name("username")).sendKeys("mathuselvi@yahoo.com");
		//driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		//driver.findElement(By.id("login-signin")).click();
		//driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		//driver.findElement(By.xpath("//input[@id='login-signin' and @name='signin']")).click();
		//driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		//driver.findElement(By.xpath("//input[@class='phone-no' and @name='username' and @id='login-username']")).sendKeys("mathuselvi");
		//driver.findElement(By.xpath("//a[@id='uh-mail-link']")).click();
		//driver.findElement(By.xpath("//input[@id='login-signin' and @name='signin']")).click();
		
	}

}
