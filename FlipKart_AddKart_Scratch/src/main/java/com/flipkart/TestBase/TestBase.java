package com.flipkart.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flipkart.Util.TestUtil;

public class TestBase {

	public static Properties prop;
	// IF we declare driver as static we cant run in Parallel we get
	// NoSuchSessionException
	public WebDriver driver;
	String name;

	public TestBase() throws IOException {
		String path = "C:\\Users\\selvi\\eclipse-workspace\\FlipKart_AddKart_Scratch\\src\\main\\java\\com\\flipkart\\Properties\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
	}

	public WebDriver Initialization() {
//		String browser = System.getProperty("browser");
		String browser = prop.getProperty("browser");
		if(browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if(browser.contains("headless")) {
				options.addArguments("headless");
			}
			driver=new ChromeDriver(options);
//			driver=new ChromeDriver();
		}
//		if (browser.contains("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}
		else if (browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser Drivers\\gecko.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageTiemOut, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		return driver;
	}

	public void alert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String get_ScreenShot(String testMethodName, WebDriver driver) throws IOException {
		name = testMethodName;
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\reports\\" + name + ".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}

}
