package mouse_Ajax_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Assignment {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));

		String text = driver.findElement(By.cssSelector("div[id='content']")).getText();
		System.out.println(text);

		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}

}
