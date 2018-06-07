package com.commonLibraries;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	static ExtentReports extent;
	
final static String filepath = ReadProperties.projectLocation+"/Reports/Professional_Automation_Report_" + (new Date()).toString().replace(":", "_").replace(" ", "_")+".html";

public synchronized static ExtentReports getReporter() {
	if(extent==null) {
		extent = new ExtentReports(filepath, true);
	}
	
	return extent;
	
}
	
	
	

}
