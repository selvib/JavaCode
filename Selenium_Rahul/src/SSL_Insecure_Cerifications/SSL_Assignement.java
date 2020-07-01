package SSL_Insecure_Cerifications;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSL_Assignement {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://home.openweathermap.org/users/sign_in");
		driver.findElement(By.cssSelector("input[class='string email optional form-control']")).click();
		driver.findElement(By.cssSelector("input[class='string email optional form-control']")).sendKeys("3003mathuselvi@gmail.com");
		driver.findElement(By.xpath("//i[@class='fa fa-user']/parent::span/parent::div/following-sibling::div[1]/descendant::input")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-user']/parent::span/parent::div/following-sibling::div[1]/descendant::input")).sendKeys("mathu@selvi");
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/input[3]")).click();
		
		driver.manage().deleteCookieNamed("_members_session_1473164855");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie cook : cookies) {
			System.out.println(cook);
		}
		
		
	}

}
