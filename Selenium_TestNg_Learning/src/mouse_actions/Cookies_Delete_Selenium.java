package mouse_actions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies_Delete_Selenium {

public static WebDriver driver;
	
	@Test
	public static void Add_Cookie() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Cookie cookie = new Cookie("Custom", "1234567890");
		
		driver.manage().addCookie(cookie);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie getCookies : cookies) {
			System.out.println(getCookies);
		}
		
		driver.manage().deleteCookieNamed("Custom");
		
		Set<Cookie> cookiess = driver.manage().getCookies();
		
		System.out.println(" ******************************************************************************* ");
		//Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie getCookiess : cookiess) {
			System.out.println(getCookiess);
		}
		cookiess.size();
	}
	
}
