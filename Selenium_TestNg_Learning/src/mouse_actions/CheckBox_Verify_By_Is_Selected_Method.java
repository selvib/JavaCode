package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox_Verify_By_Is_Selected_Method {

	public static WebDriver driver;
	@Test
	public static void Check_Box_Verify() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected()); 
		
		driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='FamilyAndFriends']")).isSelected()); 
		
		int total_Num = driver.findElements(By.cssSelector("input[type*='checkbox']")).size();
		
		System.out.println(total_Num);
	}
}