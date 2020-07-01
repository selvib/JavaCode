package mouse_actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Travels_Php_Full {

	public static WebDriver driver;
	
	static String checkMonth = "December, 2020";
	
	@Test
	public static void Travel_Booking() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://phptravels.net/home");
		driver.manage().window().maximize();
		
		// its not actual xpath.. its run time xpath for the text box
		driver.findElement(By.xpath("//*[@id=\'s2id_autogen1\']/a/span[1]")).click(); 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\'select2-drop\']/div/input")).sendKeys("block");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='select2-result-sub']/child::li[1]")).click();
		
		 //List<WebElement> data = driver.findElement(By.xpath("//ul[@class='select2-result-sub']/li"));
		/*for(i=0; i<=data.size(); i++){
		  	WebElement element = data.get(i);
		  	String text = data.get(i).gettext();
		  	Syso("text");
		  	if(text.equals("Island, United States"))
		  	{
		  		element.click();
		  		break;
		  	}
		  }*/
		
		WebElement checkoutMonth = driver.findElement(By.xpath("//div[@id='chat-widget-container']/preceding-sibling::div[1]/child::div[2]/descendant::div[2]"));
		while(true) {
			if(checkoutMonth.getText().equals(checkMonth)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[2]/nav/div[3]")).click(); 
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"hotels\"]/div/div/form/div/div/div[3]/div/div/div")).click();
		
		
	}
}
