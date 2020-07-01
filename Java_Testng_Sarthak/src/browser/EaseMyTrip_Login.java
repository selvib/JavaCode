package browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EaseMyTrip_Login {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;

	public static void main(String[] args)throws Exception  {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-infobar");
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver,10); 
		
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		action = new Actions(driver);
	
		
		WebElement MyAccount = driver.findElement(By.xpath("//span[@id='spnMyAcc']"));
		action.moveToElement(MyAccount).perform();
		
		WebElement Siginbutton = driver.findElement(By.xpath("//a[@class='btn_signin']"));
		wait.until(ExpectedConditions.elementToBeClickable(Siginbutton));
		Siginbutton.click();
		
		driver.findElement(By.id("txtusername")).sendKeys("8327752761");
		driver.findElement(By.id("Password1")).sendKeys("Selenium@123");
	
	
		WebElement LoginButton = driver.findElement(By.xpath("//div[@class='sign-inn']/input[@onclick='UserAuthentication()']"));
		wait.until(ExpectedConditions.visibilityOf(LoginButton));  //since we are using WebElement we need to use method .visbilityOf but if we would have directly used any locator technique we could use .visibilityOfElementlocated
		LoginButton.click();
		
		WebElement MyProfile8327752761 = driver.findElement(By.id("welcome-det-User"));
		wait.until(ExpectedConditions.visibilityOf((MyProfile8327752761)));
		action.moveToElement(MyProfile8327752761).perform();
		
		
		WebElement Logoutbutton = driver.findElement(By.xpath("//div[@class='booking_pnl']/span/a[2]"));
		wait.until(ExpectedConditions.visibilityOf((Logoutbutton)));
		Logoutbutton.click();
		
		Alert alert =  driver.switchTo().alert();
		System.out.println("The text inside the logout confirmation alert is : " + alert.getText());
		alert.dismiss();
		
		action.moveByOffset(10, 45).perform();
		

	}

}
