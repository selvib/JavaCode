package web_Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Assignment {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		
		//int row_Count = table.findElements(By.cssSelector("table[class='table-display'] tbody tr")).size();
		int row_Count = table.findElements(By.tagName("tr")).size();
		System.out.println(row_Count);
		
		
		//int coloumn_Count = table.findElements(By.cssSelector("table[class='table-display'] tbody tr th")).size();
		int coloumn_Count = table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
		System.out.println(coloumn_Count);

		for (int i = 1; i < row_Count; i++) {
			String row_Text = table.findElements(By.cssSelector("table[class='table-display'] tbody tr")).get(i).getText();
			if (row_Text.contains(("Learn SQL in Practical + Database Testing from Scratch"))) {
				System.out.println(i + "nd Row Value " + row_Text);
			}
		}
		// OR 
		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		

		int specific_Column = table.findElements(By.cssSelector("table[class='table-display'] tbody tr td:nth-child(3)")).size();
		int sum = 0;
		for (int i = 0; i < specific_Column; i++) {
			String value = table.findElements(By.cssSelector("table[class='table-display'] tbody tr td:nth-child(3)")).get(i).getText();
			int value_Int = Integer.parseInt(value);
			sum = sum + value_Int;
		}
		System.out.println("Total Price:" + sum);

		for (int i = 0; i < row_Count; i++) {
			String row_All_Value = table.findElements(By.cssSelector("table[class='table-display'] tbody tr")).get(i).getText();
			System.out.println(i + " Row Value" + row_All_Value);
		}
	}
	




}
