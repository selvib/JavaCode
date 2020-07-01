package com.flipkart.TestBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends TestBase implements ITestListener {

	ExtentReport er = new ExtentReport();
	ExtentReports extent = er.getExtent();
	ExtentTest test;

	public Listeners() throws IOException {
		super();

	}

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Has Passed");
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		WebDriver driver = null;
		String testMethodName = result.getMethod().getMethodName();

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {

		}
		
		try {
			test.addScreenCaptureFromPath(get_ScreenShot(testMethodName, driver), result.getMethod().getMethodName());
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
