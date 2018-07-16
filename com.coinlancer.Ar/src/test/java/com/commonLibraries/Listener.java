package com.commonLibraries;

import java.io.IOException;

import org.testng.IInvokedMethod;

import org.testng.IInvokedMethodListener;

import org.testng.ISuite;

import org.testng.ISuiteListener;

import org.testng.ITestContext;

import org.testng.ITestListener;

import org.testng.ITestNGMethod;

import org.testng.ITestResult;

import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

public class Listener implements ITestListener, ISuiteListener, IInvokedMethodListener {

	// This belongs to ISuiteListener and will execute before the Suite start

	public void onStart(ISuite arg0) {

		Reporter.log("About to begin executing Suite " + arg0.getName(), true);


	}

	// This belongs to ISuiteListener and will execute, once the Suite is
	// finished

	public void onFinish(ISuite arg0) {

		Reporter.log("About to end executing Suite " + arg0.getName(), true);


	}

	// This belongs to ITestListener and will execute before starting of Test
	// set/batch

	public void onStart(ITestContext arg0) {

		Reporter.log("About to begin executing Test " + arg0.getName(), true);


	}

	// This belongs to ITestListener and will execute, once the Test set/batch
	// is finished

	public void onFinish(ITestContext arg0) {

		Reporter.log("Completed executing test " + arg0.getName(), true);


	}

	// This belongs to ITestListener and will execute only when the test is pass

	public void onTestSuccess(ITestResult arg0) {

		// This is calling the printTestResults method

		printTestResults(arg0);


	}

	// This belongs to ITestListener and will execute only on the event of fail
	// test

	public void onTestFailure(ITestResult arg0) {

		// This is calling the printTestResults method

		printTestResults(arg0);

	}

	// This belongs to ITestListener and will execute before the main test start
	// (@Test)

	public void onTestStart(ITestResult arg0) {

		System.out.println("The execution of the main test starts now");

	}

	// This belongs to ITestListener and will execute only if any of the main
	// test(@Test) get skipped

	public void onTestSkipped(ITestResult arg0) {

		printTestResults(arg0);

	}

	// This is just a piece of shit, ignore this

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	// This is the method which will be executed in case of test pass or fail

	// This will provide the information on the test

	private void printTestResults(ITestResult result) {

		Reporter.log("Test Method resides in " + result.getTestClass().getName(), true);

		if (result.getParameters().length != 0) {

			String params = null;

			for (Object parameter : result.getParameters()) {

				params += parameter.toString() + ",";

			}

			Reporter.log("Test Method had the following parameters : " + params, true);

		}

		String status = null;

		switch (result.getStatus()) {

		case ITestResult.SUCCESS:

			status = "Pass";

			break;

		case ITestResult.FAILURE:

			status = "Failed";

			break;

		case ITestResult.SKIP:

			status = "Skipped";

		}

		Reporter.log("Test Status: " + status, true);

	}

	// This belongs to IInvokedMethodListener and will execute before every
	// method including @Before @After @Test

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		//methodName = methodName+getCurrentMethodNames(testResult);

		Object[] params = testResult.getParameters();

		String paramValues = "";
		for (Object object : params) {
			paramValues = paramValues+object+"<br>";
		}

		//System.out.println(testResult.getParameters());

		String instanceName ="";
		String instance[] ;
		String packageName="";

		String className="";
		if (!method.isConfigurationMethod()) {
			instanceName = method.getTestMethod().getInstance().toString();
			instance = instanceName.split("\\.");
			className = instance[instance.length - 1].split("@")[0];
			packageName = instance[0];
			for (int i = 1; i < instance.length-1; i++) {
				packageName =packageName+"."+instance[i];
			}
		}else{
			instanceName = method.getTestMethod().getQualifiedName();
			instance = instanceName.split("\\.");
			className = instance[instance.length - 2];
			packageName = instance[0];
			for (int i = 1; i < instance.length-2; i++) {
				packageName =packageName+"."+instance[i];
			}

		}        

		ExtentTestManager.startTest(UtilityMethods.getBrowserName(testResult).toUpperCase() + " => " + method.getTestMethod().getMethodName())
		.assignCategory(
				UtilityMethods.getBrowserName(testResult).toUpperCase() + "  > " + testResult.getTestContext().getName()+"  > "+className);
		try {
			ExtentTestManager.getTest().log(LogStatus.PASS,
					"=========        Execution Started for " + method.getTestMethod().getMethodName() + "        =========<br>Package Name :"+packageName+"<br>Class Name :"+className+"<br>Method Name :"+method.getTestMethod().getMethodName()+"<br>Environment: "+ReadProperties.getPropValue("env"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (params.length>0) {
			ExtentTestManager.getTest().log(LogStatus.PASS,
					"This Test case used below parameter values<br>"+paramValues);
		}
		System.out.println("=========        Execution Started for " + method.getTestMethod().getMethodName() + "        =========\nPackage Name :"+packageName+"\nClass Name :"+className+"\nMethod Name :"+method.getTestMethod().getMethodName()+"\n");


	}

	// This belongs to IInvokedMethodListener and will execute after every
	// method including @Before @After @Test
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

		if ((ExtentTestManager.getTest().getRunStatus().toString()).equals("fail") || testResult.getStatus()==ITestResult.FAILURE) {
			ExtentTestManager.getTest().log(LogStatus.FAIL, UtilityMethods.getException(testResult.getThrowable()));
			ExtentTestManager.getTest().log(LogStatus.FAIL,
					"=========        Test case failed for " + method.getTestMethod().getMethodName() + "        =========");
			System.out.println("========= Test case failed for " + method.getTestMethod().getMethodName() + " =========\n");

		}else if(ExtentTestManager.getTest().getRunStatus().toString().equals("pass")){

			ExtentTestManager.getTest().log(LogStatus.PASS,
					"=========        Test case pass for " + method.getTestMethod().getMethodName() + "        =========");
			System.out.println("========= Test case pass for " + method.getTestMethod().getMethodName() + " =========\n");
		}else if(ExtentTestManager.getTest().getRunStatus().toString().equals("skip") || testResult.getStatus()==ITestResult.SKIP){
			ExtentTestManager.getTest().log(LogStatus.SKIP,
					"=========        Test case skipped for " + method.getTestMethod().getMethodName() + "        =========");
			System.out.println("========= Test case skipped for " + method.getTestMethod().getMethodName() + " =========\n");
		}
		ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
		ExtentManager.getReporter().flush();
		ExtentTestManager.endTest();
	}

	// This will return method names to the calling function

	private String returnMethodName(ITestNGMethod method) {

		return method.getRealClass().getSimpleName() + "." + method.getMethodName();

	}

}
