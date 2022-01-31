package commonmethods;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentrep {
	
	static ExtentTest test;
	static ExtentSparkReporter spark;
	static ExtentReports extent;
	
	public static void extentsetup() {
		
		 extent = new ExtentReports();
		 spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		 test=extent.createTest("Myfirsttest");
	}
	
	public static void pass() {
		
		test.pass("text of product matching with expected");
	}
	

	
	public static void fail() {
		
		test.fail("text of product matching with expected");
	   test.addScreenCaptureFromPath("D:\\error8pm.png");
	}
	
	public static void repgen() {
		
		extent.flush();
	}
	
	
}
