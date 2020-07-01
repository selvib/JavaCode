package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_Box_Assignment {
	public static WebDriver driver;
	@Test
	public static void Assignment() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected(), "Checked");
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected(), "UnChecked");
		System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type*='checkbox']")).size(), 3);
	}

}
