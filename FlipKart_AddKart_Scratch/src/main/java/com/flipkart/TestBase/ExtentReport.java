package com.flipkart.TestBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public ExtentHtmlReporter html;
	public ExtentReports extent;
	public ExtentTest test;

	public ExtentReports getExtent() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		html = new ExtentHtmlReporter(path);
		html.config().setDocumentTitle("FlipKart_Report");
		html.config().setReportName("Testing Result Report");
		extent = new ExtentReports();
		extent.attachReporter(html);
		extent.setSystemInfo("Tester", "SelviBalusamy");
		return extent;
	}

//	public ExtentTest createTest(String testcase) {
//		return test = getExtent().createTest(testcase);
//	}
//
//	public void flushReport() {
//		extent.flush();
//	}
//
	public void logPass(String msg) {
		test.log(Status.PASS, msg);
		
	}

	public void logFail(String msg) {
		test.log(Status.FAIL, msg);
	}

}
