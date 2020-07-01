package browser;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		
		System.setProperty("webdriver.IEDriverServer.driver","C:\\Selenium\\Browser Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();													
		driver.get("https://flipkart.com");		 			
		//driver.close();	
		//Thread.sleep(1000);
		
		
		
	}

}
