package com.qa_academy.TestBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa_academy.TestBase.TestBase;

public class Listeners extends TestBase implements ITestListener {

	ExtentReport report = new ExtentReport();
	ExtentReports extent = report.getExtent();
	ExtentTest test;
	ThreadLocal<ExtentTest> tl = new ThreadLocal<ExtentTest>();
	//When we execute Parallel it will allocate test object for the testcase method

	public Listeners() throws IOException {
		super();
	}

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		tl.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		tl.get().log(Status.PASS, "Test Has Passed");
	
		
	}

	public void onTestFailure(ITestResult result) {
		tl.get().fail(result.getThrowable());
		WebDriver driver = null ;
		String testMethodName = result.getMethod().getMethodName();

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {

		}

		try {
			tl.get().addScreenCaptureFromPath(takeScreenshot(testMethodName, driver),
					result.getMethod().getMethodName());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
