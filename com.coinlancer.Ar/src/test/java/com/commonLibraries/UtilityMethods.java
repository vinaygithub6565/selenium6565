package com.commonLibraries;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class UtilityMethods {

	private final static String JS_GET_VIEWPORT_WIDTH = "var width = undefined; if (window.innerWidth) {width = window.innerWidth;} else if (document.documentElement && document.documentElement.clientWidth) {width = document.documentElement.clientWidth;} else { var b = document.getElementsByTagName('body')[0]; if (b.clientWidth) {width = b.clientWidth;}};return width;";
	private final static String JS_GET_VIEWPORT_HEIGHT = "var height = undefined;  if (window.innerHeight) {height = window.innerHeight;}  else if (document.documentElement && document.documentElement.clientHeight) {height = document.documentElement.clientHeight;}  else { var b = document.getElementsByTagName('body')[0]; if (b.clientHeight) {height = b.clientHeight;}};return height;";
	Proxy proxy;

	public static String getParamValue(ITestContext ctx, String param) {
		try {
			return (ctx.getCurrentXmlTest().getParameter(param)).toString();

		} catch (Exception e) {
			try {
				new ReadProperties();
				return ReadProperties.getPropValue(param);
			} catch (Throwable e1) {
			}
		}
		return "";
	}

	public static String getBrowserName(ITestResult testResult) {
		String browserName = UtilityMethods.getParamValue(testResult.getTestContext(), "browser");
		String breakPoint = UtilityMethods.getParamValue(testResult.getTestContext(), "breakPoint");

		return browserName + "  > BP " + breakPoint;
	}

	

	// Browser resizing method to viewport
	public static Dimension getViewportSize(WebDriver driver) {
		int width = extractViewportWidth(driver);
		int height = extractViewportHeight(driver);
		return new Dimension(width, height);
	}

	static int extractViewportWidth(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int viewportWidth = Integer.parseInt(js.executeScript(JS_GET_VIEWPORT_WIDTH, new Object[0]).toString());
		return viewportWidth;
	}

	static int extractViewportHeight(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int result = Integer.parseInt(js.executeScript(JS_GET_VIEWPORT_HEIGHT, new Object[0]).toString());
		return result;
	}

	public static String getException(Exception e) {
		String traceException = "<br><br>" + e.getMessage() + "<br>";
		for (StackTraceElement i : e.getStackTrace()) {
			String ss = i.getClassName() + " " + i.getMethodName() + " " + i.getLineNumber();
			if (ss.contains("ActionMethods")) {
				ss = "<br><b style='color:red'>" + ss + "</b>";
			} else {
				ss = "<br>" + ss;
			}
			traceException = traceException + ss;
		}

		return traceException;
	}

	public static String getException(Throwable e) {
		String traceException = "";
		try {
			traceException = "<br><br>" + e.getMessage() + "<br>";
			for (StackTraceElement i : e.getStackTrace()) {
				String ss = i.getClassName() + " " + i.getMethodName() + " " + i.getLineNumber();
				if (ss.contains("ActionMethods")) {
					ss = "<br><b style='color:red'>" + ss + "</b>";
				} else {
					ss = "<br>" + ss;
				}
				traceException = traceException + ss;
			}
		} catch (Exception e1) {

		}

		return traceException;
	}

}
