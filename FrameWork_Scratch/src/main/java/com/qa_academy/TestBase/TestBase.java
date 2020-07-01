package com.qa_academy.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static Properties prop;
	public WebDriver driver;
	String name;

	public TestBase() throws IOException {
		String path = "C:\\Users\\selvi\\eclipse-workspace\\FrameWork_Scratch\\src\\main\\java\\com\\qa_academy\\Properties\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);

	}

	public WebDriver Initialization() {

		// This browser property comes from Maven
		// String browser = System.getProperty("browser");

		String browser = prop.getProperty("browser"); // This is from Property file

/*		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");

	//This is for Headless browser
			ChromeOptions options = new ChromeOptions();
			if (browser.contains("headless")) {
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			
			driver = new ChromeDriver();
		}*/
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public String takeScreenshot(String testMethodName, WebDriver driver) throws IOException {
		name = testMethodName;
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\reports\\" + name + ".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
}
