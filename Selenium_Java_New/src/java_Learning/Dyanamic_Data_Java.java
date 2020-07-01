package java_Learning;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_Data_Java {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//now selenium will wait for 5s if it dont find ele else it will immediately fail the test case
		//if it finds in 2s testcase will resume and will finish the execution.. maximum it will wait for 5s if it execeeds it will fail the testcase
		//wherever loading is happening selenium will wait and pause until object gets displayeds coz we have mentioned at global level..
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] expected_Items = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		add_Items(driver,expected_Items);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']/child::img[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//before page gets loading selenium try to find this element and returns no such element exception.. our page is not yet loading beforethat selenium return error.
		//for the time wait for this we can implicit wait on global level
		//Thread.sleep(3000);//this only for below one not for all..
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}
	
	//this is the cleaner and utility code to write code for automation
	public static void add_Items(WebDriver driver,String[] expected_Items) {
		int j=0;
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < items.size(); i++) {
			//since names is String we apply split method directly on names to get actual expected_Items to compare
			String[] names = items.get(i).getText().split("-");
			String names_Formatted = names[0].trim();
			System.out.println(names_Formatted);
			// check whether our expected items present in the name or not so at runtime we
			// change our array to arraylist
			// so convert array into arraylist ..in this way we are saving the memory
			// so its recommeded to have values in array in the begining change that into
			// arrayList at runtime
			List<String> expected_Items_List = Arrays.asList(expected_Items);
			
			if (expected_Items_List.contains(names_Formatted)) {
				j++;
				//after click on the above text it changed to added cart.. this is dynamic text
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); //dynamic xpath.get the element which is present in the ith index
				System.out.println(names_Formatted);
				//break;
				//we cant use break in arraylist cause it will not execute all the value when it finds break it will come out from for loop
				if(j==expected_Items.length) //give length of the array so our code will be more and more generic
					break;
				
			}
			
		}
		
	}

}
