package com.qa_academy.TestBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	ExtentReports extent;

	public ExtentReports getExtent() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter er = new ExtentSparkReporter(path);
		er.config().setDocumentTitle("Testers World");
		er.config().setTimeStampFormat("HH:MM:SS");
		er.config().setReportName("Web Automation Results");

		extent = new ExtentReports();
		extent.attachReporter(er);
		extent.setSystemInfo("Tester", "SelviBalusamy");
		return extent;
	}
}
