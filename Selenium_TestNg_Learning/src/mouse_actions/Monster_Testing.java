package mouse_actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Monster_Testing {

	public static WebDriver driver;

	@Test
	public static void Regiestration_Form() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Selvi Balusamy");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// this is for debugging
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",driver.findElement(By.xpath("//input[@name='fullname']")));
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//input[@name='fullname']")));
		Thread.sleep(3000);

		// driver.findElement(By.xpath("//div[@class='registrationbox']/descendant::div[9]/descendant::div[5]/child::input[1]")).sendKeys("1993Selvi@gmail.com");
		driver.findElement(By.xpath("//div[@class='registrationbox']/child::form[1]/child::div[2]/child::div[2]/child::div[1]/child::input[1]")).sendKeys("1993Selvi@gmail.com");
		driver.findElement(By.cssSelector(".input.pass")).sendKeys("9362675803");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='showHide']/child::i[1]")).click();

		driver.findElement(By.xpath("//div[@class='isdInput']/child::select[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[4]/div[1]/div[1]/div/select/option[100]")).click();
		driver.findElement(By.xpath("//div[@class='isd-box']/following-sibling::div[1]/descendant::input")).sendKeys("9874563320");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[1]/span")).click();
		Thread.sleep(3000);

//		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[1]")).click();
//		Thread.sleep(5000);
		// driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[1]/input")).sendKeys("noi");;

		// *[@id="registerThemeDefault"]/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[2]/ul/li[1]
		// driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[6]/div/div[1]/div/div[1]/comment()[3]")).click();

		driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[7]/div/div/div/div/div/div[2]/span")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[2]/div[7]/div/div[1]/div/div/div/div[3]/ul/li[12]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[2]/div[7]/div/div/div/div/div/div[3]/ul/li[12]/span/span")).click();
		Thread.sleep(3000);
//		Thread.sleep(3000);
//		WebElement mon = driver.findElement(By.xpath("//*[@id=\'registerThemeDefault\']/div/div[3]/div/div/div/form/div[2]/div[7]/div/div[2]/div/div/div/div[2]/span"))
//		Select select = new Select(mon);
//		select.selectByValue("5 Months");

//driver.findElement(By.xpath("//input[@name='fullname']/ancestor::div[2]/following-sibling::div[5]/child::div[1]/descendant::div[2]/descendant::span[2]")).click();

		driver.findElement(By.xpath("//input[@name='keywords']/parent::div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("Jav");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[1]/div[1]/div/div/div[2]/ul/li[1]")).click();
	}

	@Test
	public static void Auto_Suggestion() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[2]")).click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//span[contains(text(), 'Maximum 2 industries
		// can be selected')]")).sendKeys("ad");
		// driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[2]/comment()[3]")).sendKeys("ad");
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("ad");
		Thread.sleep(5000); // 5s
		driver.findElement(By.xpath("//span[contains(text(), 'Advertising/PR/Events')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("ba");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'Banking/Accounting/Financial Services')]")).click();

		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".multiselect__tag-icon.modal-ref-class")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[1]")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='multiselect__tags modal-ref-class boxWrapper'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[3]/div[2]/div[1]/div/div[2]/input")).sendKeys("le");
		Thread.sleep(6000);
		// driver.findElement(By.xpath("//span[contains(text(),'Travel/Tourism')]")).click();
		driver.findElement(By.xpath("//span[text()='Legal']")).click();

		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[3]/div[2]/div[1]/div/div[2]/input")).sendKeys("tra");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Travel/Airlines']")).click();

	}
}
