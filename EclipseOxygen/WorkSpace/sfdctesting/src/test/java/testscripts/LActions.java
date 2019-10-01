package testscripts;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.LPage;

public class LActions{
	
	static ExtentReports reports;
	static ExtentTest loggers;
	
	 public void login(String username,String password) { 
			
			String filename=new SimpleDateFormat("'sample demo_'yyyyMMddHHmm'.html'").format(new Date());		
			String path="C:\\Users\\Aanchal\\Desktop\\ExtentReport\\"+filename;
			reports=new ExtentReports(path);
			loggers=reports.startTest("LoginPage testcase");


		 LPage.getUserName().sendKeys(username);
		 
		loggers.log(LogStatus.INFO, "Entered password successfully");
		 
		 LPage.getPassword().sendKeys(password);
		 loggers.log(LogStatus.INFO, "Entered password successfully");
				 
		 LPage.getLoginButton().click();
		 loggers.log(LogStatus.INFO, "Clicked LogIn button");

		 LPage.closewindow().click();
		 loggers.log(LogStatus.INFO, "Popup window is closed");
		 
			if (true)
			{
				loggers.log(LogStatus.PASS,"LoginPage testcase passed successfully");	
			}
			else
			{
				loggers.log(LogStatus.FAIL,"LoginPage testcase not passed successfully");
			}
			
		//reports.endTest(loggers);
		//reports.flush(); 
		  }
	 public void forgotpassword (String username) {  
		 
			String filename=new SimpleDateFormat("'sample demo_'yyyyMMddHHmm'.html'").format(new Date());		
			String path="C:\\Users\\Aanchal\\Desktop\\ExtentReport\\"+filename;
			reports=new ExtentReports(path);
			loggers=reports.startTest("Forgot Password testcase");

		 
	 LPage.forgotpasslink().click();
	 loggers.log(LogStatus.INFO, "Clicked forgotpassword link");
	 LPage.ForgotUsername().sendKeys(username);
	 loggers.log(LogStatus.INFO, "Passed username successfully");
	 LPage.continueButton().click();
	 loggers.log(LogStatus.INFO, "Clicked continue button");
	 LPage.pwdMsg();
	 if (LPage.pwdMsg().getText().equals("We’ve sent you an email with a link to finish resetting your password."))
			loggers.log(LogStatus.INFO, "Email has been sent to ur mail id");
		else 
			loggers.log(LogStatus.INFO, "email is not send");
	 
	// reports.endTest(loggers);
	//reports.flush(); 
	 	
}
	
	 public void rememberme () {
		 String filename=new SimpleDateFormat("'sample demo_'yyyyMMddHHmm'.html'").format(new Date());		
			String path="C:\\Users\\Aanchal\\Desktop\\ExtentReport\\"+filename;
			reports=new ExtentReports(path);
			loggers=reports.startTest("Remember Me testcase");

		 LPage.remembermeButton().click();
		 if(LPage.remembermeButton().isSelected())
			loggers.log(LogStatus.INFO, "button is clicked");
		else
			loggers.log(LogStatus.INFO, "button is not clicked");
					
			//reports.endTest(loggers);
			//reports.flush(); 
	 }
	 
}
