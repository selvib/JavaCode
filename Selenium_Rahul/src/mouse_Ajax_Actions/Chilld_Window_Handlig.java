package mouse_Ajax_Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chilld_Window_Handlig {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// parent window
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();// child one

		// Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click(); // child two

		System.out.println("Before Swithching");
		System.out.println(driver.getTitle());

		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);

		Iterator<String> it = ids.iterator();
		String parent = it.next();
		String child_One = it.next();
		String child_Two = it.next();
		

		Thread.sleep(3000);
		driver.switchTo().window(child_One);
		System.out.println("After Switching Child One");
		System.out.println(driver.getTitle());
		//Thread.sleep(3000);
		

		Thread.sleep(2000);
		driver.switchTo().window(child_Two);
		System.out.println("After Swithcing Child Two");
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//span[contains(text(),'Google Account')]")).click();

		Thread.sleep(3000);
		driver.switchTo().window(parent);
		System.out.println("Back to Parent");
		System.out.println(driver.getTitle());

	}

}
