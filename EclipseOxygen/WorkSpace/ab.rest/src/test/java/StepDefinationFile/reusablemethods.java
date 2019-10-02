package StepDefinationFile;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class reusablemethods {
	
	static ExtentTest loggers;
	static String path = "C:\\Users\\Aanchal\\Desktop\\ExtentReport\\RestassuredProject\\sample.html";
	static ExtentReports reports=new ExtentReports(path);
	
	public static ExtentTest createTestScriptReports(String testScriptName)
	{
		loggers= reports.startTest(testScriptName);
		return loggers;
	}

   public static void flushReports () {
		
		reports.endTest(loggers);
		reports.flush(); 
   }
}
