package mouse_Ajax_Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Window_Assingnment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click(); 

		driver.findElement(By.linkText("Click Here")).click(); //using link list locator

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();

		String parent = it.next();
		String child = it.next();

		driver.switchTo().window(child);
		String text = driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
		System.out.println(text);

		driver.switchTo().window(parent);
		text = driver.findElement(By.cssSelector("div[class='example'] h3")).getText(); //css parent child traverse
		System.out.println(text);

	}

}
