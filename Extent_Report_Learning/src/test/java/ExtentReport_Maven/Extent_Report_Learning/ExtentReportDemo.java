package ExtentReport_Maven.Extent_Report_Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportDemo {
	public ExtentReports ex;

	@BeforeTest
	public void config() {

		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter rs = new ExtentSparkReporter(path);
		rs.config().setDocumentTitle("Testers World");
		rs.config().setReportName("Web Automation Results");

		ex = new ExtentReports();
		ex.attachReporter(rs);
		ex.setSystemInfo("Tester", "SelviBalusamy");

	}

	@Test
	public void initialDemo() {
		ExtentTest test = ex.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Browser Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		test.fail("Result do not Match");
		ex.flush();
	}
}
