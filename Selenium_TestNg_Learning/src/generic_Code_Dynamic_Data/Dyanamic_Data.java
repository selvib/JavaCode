package generic_Code_Dynamic_Data;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Dyanamic_Data {
	public static WebDriver driver;

	@Test
	public static void Dynamic_Data_Learning()   {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String[] expected_Items = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
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
			//System.out.println(names);
		}
		
		System.out.println(items.size());
	}
}
