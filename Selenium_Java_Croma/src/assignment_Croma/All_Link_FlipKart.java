package assignment_Croma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Link_FlipKart {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=camera&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		int all_Link = driver.findElements(By.xpath("//div[@class='_3wU53n']")).size();
		System.out.println(all_Link);

		String expected_Item = "Sony";
		int total=0;
		for (int i = 0; i < all_Link; i++) {
			String element = driver.findElements(By.xpath("//div[@class='_3wU53n']")).get(i).getText();
			if (element.contains(expected_Item)) {
				System.out.println(element);
				total++;
			}
		}
				System.out.println("Total Item of Sony Is " + total);
	}
}
