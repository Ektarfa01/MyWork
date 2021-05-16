package amitrajput;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AppiumTest {

	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		
		String path = System.getProperty("user.dir")+"\\report\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path); 
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Amit");
		
		
	}

	
	@Test
	public void nativeAppAndorid()
	{

		extent.createTest("intialize");
		System.out.println("nativeAppAndorid");
	}
	@Test
	public void IOS()
	{
		extent.createTest("intialize");
		System.out.println("IOS");
	}
	
	

}
