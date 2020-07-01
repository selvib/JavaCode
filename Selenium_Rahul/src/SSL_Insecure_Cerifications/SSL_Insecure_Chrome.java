package SSL_Insecure_Cerifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Insecure_Chrome {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		//or both same
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		driver = new ChromeDriver(c);
		
		driver.get("");
		
	}

}
