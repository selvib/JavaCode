package mouse_Ajax_Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drag_Drop_Check_Alert_Assignment {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");

		// Step --1
		int c_Count = driver.findElements(By.xpath("//div[@id='checkbox-example']//fieldset//label")).size();
		System.out.println(c_Count);

		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		String c_Text = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label")).getText();
		System.out.println(c_Text);

		// Step -- 2
		int s_Count = driver.findElements(By.xpath("//select[@id='dropdown-class-example']//option")).size();
		System.out.println(s_Count);

		for (int i = 1; i < s_Count; i++) {

			String name = driver.findElements(By.xpath("//select[@id='dropdown-class-example']//option")).get(i).getText();
			if (name.contains(c_Text)) {
				System.out.println(name);
				driver.findElement(By.id("dropdown-class-example")).click();
				Thread.sleep(2000);
				Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
				Thread.sleep(2000);
				select.selectByVisibleText(c_Text);
				driver.findElement(By.id("dropdown-class-example")).click();
				break;
			}
		}

//		driver.findElement(By.id("dropdown-class-example")).click();
//		Thread.sleep(2000);
//		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
//		Thread.sleep(2000);
//		select.selectByVisibleText(c_Text);
//		driver.findElement(By.id("dropdown-class-example")).click();

		// Step --3
		driver.findElement(By.cssSelector("#name")).sendKeys(c_Text);
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		String a_Text = driver.switchTo().alert().getText();
		if (a_Text.contains(c_Text)) {
			Thread.sleep(2000);
			System.out.println("Alret Message Success");
		} else
			System.out.println("Try Again");

	}

}
