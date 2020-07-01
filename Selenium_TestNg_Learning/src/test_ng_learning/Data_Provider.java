package test_ng_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider {
	@DataProvider
	public Object dataset() {
		Object[][] obj = new Object[4][2];
		obj[0][0] = "3003mathuselvi@gmail.com";
		obj[0][1] = "12345";

		obj[1][0] = "abd@gmail.com";
		obj[1][1] = "12345ui";

		obj[2][0] = "";
		obj[2][1] = "";

		obj[3][0] = "#$@!^^";
		obj[3][1] = "@!$%^";

		return obj;
	}

	@Test(dataProvider = "dataset")
	public void allTest(String userid, String password) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userid);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
	}
}
