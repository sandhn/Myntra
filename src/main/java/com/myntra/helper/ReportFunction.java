package com.myntra.helper;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportFunction
{
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void extentReportingMethod()
	{
		reporter= new ExtentHtmlReporter(ResourceHElper.getPath("./resources/reports/extent.html"));
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	}
}
