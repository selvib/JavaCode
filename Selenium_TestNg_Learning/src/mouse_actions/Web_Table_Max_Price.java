package mouse_actions;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table_Max_Price {
	
	 static WebDriver driver;
	
	@Test
	public static void Max_Current_Price() throws InterruptedException, ParseException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String row = "//*[@id=\'leftcontainer\']/table/tbody/tr";
		int rowdata = driver.findElements(By.xpath(row)).size();
		
		Thread.sleep(3000);
		
		String first_Part = "//*[@id=\'leftcontainer\']/table/tbody/tr[";
		String second_Part = "]/td[4]";
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=1; i<rowdata; i++) {
			String final_Part = first_Part + i +second_Part;
			System.out.println("Final Part Is :" + final_Part);
			
			String price = driver.findElement(By.xpath(final_Part)).getText();
			System.out.println("Prices Before Formatting :"+ price);
			
//			Double dPrice = Double.parseDouble(price);
//			int intPrice = dPrice.intValue();
			
			NumberFormat numberformat = NumberFormat.getNumberInstance();
			System.out.println("Number Instances Are :"+ numberformat);
			
			Number num = numberformat.parse(price);//Whatever price value with comma will be parsed here..
			System.out.println("Num :" + num);
			
			price = num.toString();
			System.out.println("Prices are :"+ price); //converting price to string value
			
			Double m = Double.parseDouble(price);//converting string to double value
			int intPrice = m.intValue();
			array.add(intPrice);
		}
		Collections.sort(array);
		System.out.println("Arrays Are :"+array);
		System.out.println(array.get(0));
		System.out.println(array.get(array.size()-1));
	}
	

}
