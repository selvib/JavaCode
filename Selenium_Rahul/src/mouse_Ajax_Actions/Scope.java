package mouse_Ajax_Actions;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scope {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");

		//1. entire link in the page
		int a_Count = driver.findElements(By.tagName("a")).size();
		System.out.println(a_Count);
		
		//2. link of particular section
		int particular_Link = driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size();
		System.out.println(particular_Link);
		//or
		WebElement footer_Section = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(	footer_Section.findElements(By.tagName("a")).size());
		//here we have limited web driver scope
		
		//3. First column link only
		 int first_Column = footer_Section.findElements(By.xpath("//table[@class='gf-t']//td[1]//li")).size();
		 System.out.println(first_Column);
		//or
		 WebElement column = footer_Section.findElement(By.xpath("//table//tbody/tr//td[1]//ul"));
		 int count = column.findElements(By.tagName("a")).size();
		 System.out.println();
		 
		 //4. Step 1: click on each link in the column and check if the pages are open or not
		 for(int i=1;i<count;i++) {
			 //this is keyboard action so whenever there is a keyboard event we have to pass them as argument inside the sendKeys() Method	
			 //Keys.Enter also keyboard action
			 String click_On_Link = Keys.chord(Keys.CONTROL,Keys.ENTER);
			 //we have to do this click on the link so pass this inside the sendKeys() Method
			 column.findElements(By.tagName("a")).get(i).sendKeys(click_On_Link);
			 Thread.sleep(5000L);
		 }
			 Set<String> w_Id = driver.getWindowHandles();
			 Iterator<String> Itr = w_Id.iterator();
			 while(Itr.hasNext()) {//hasNext tell us whether the next window is present or not
				 
				 driver.switchTo().window(Itr.next()); //next give us window id
				 System.out.println(driver.getTitle());
			 }
		
		 
		 
	}

}
