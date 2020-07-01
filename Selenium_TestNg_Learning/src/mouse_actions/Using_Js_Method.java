package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Js_Method {

	public static WebDriver driver;
	 
	 @Test
	 public static void Js_Method_Selenium() throws Exception {
		 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.rediff.com/");
		 
		 JavascriptExecutor webdriver = (JavascriptExecutor)driver;
		 
		 String domain = webdriver.executeScript("return document.domain;").toString();
		 System.out.println(domain);
		 
		 String title = webdriver.executeScript("return document.title;").toString();
		 System.out.println(title);
		 
		 String url = webdriver.executeScript("return document.URL;").toString();
		 System.out.println(url);
		 
		 webdriver.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 
		 webdriver.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		 Thread.sleep(3000);
		 
		 webdriver.executeScript("window.scrollBy(0,150)");
		 Thread.sleep(3000);
		 
		 webdriver.executeScript("window.scrollBy(0,-150)");
		 Thread.sleep(3000);
		 
		 webdriver.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//*[@id=\"red_container_main\"]/div[23]/h2[1]/a")));
		 Thread.sleep(2000);
		 
}
	
}
