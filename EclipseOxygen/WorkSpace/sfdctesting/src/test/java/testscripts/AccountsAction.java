package testscripts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.AccountsPage;
import Pages.LPage;

public class AccountsAction extends LPage {
	
	static ExtentReports reports;
	static ExtentTest loggers;
	
	public void createaccount(String reportname , String reportuniname) {
	String filename=new SimpleDateFormat("'sample demo_'yyyyMMddHHmm'.html'").format(new Date());		
	String path="C:\\Users\\Aanchal\\Desktop\\ExtentReport\\" + filename;
	reports=new ExtentReports(path);
	loggers=reports.startTest("profile page script running");

	LPage.driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	AccountsPage.account().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	AccountsPage.lastAct().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	AccountsPage.LastSaved();
	if (AccountsPage.LastSaved().getText().contains("Unsaved Report"))
		loggers.log(LogStatus.INFO, "Unsaved Report page is displayed");		
	else
		loggers.log(LogStatus.INFO, "Unsaved Report page is not displayed");	
	AccountsPage.dateField().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	AccountsPage.createDate().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	AccountsPage.fromDt();
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	Date date = new Date();
	AccountsPage.fromDt().sendKeys(dateFormat.format(date));
	AccountsPage.fromDt().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	AccountsPage.toDt().clear();
	AccountsPage.toDt().sendKeys(dateFormat.format(date));
	AccountsPage.toDt().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	new Actions(LPage.driver).moveToElement(AccountsPage.fromDt()).click().perform();
	AccountsPage.save().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	AccountsPage.reportName().sendKeys(reportname);
	loggers.log(LogStatus.INFO, "Entered successfully");
	AccountsPage.reportUniName().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	AccountsPage.reportUniName().clear();
	AccountsPage.reportUniName().sendKeys(reportuniname);
	loggers.log(LogStatus.INFO, "Entered successfully");
	AccountsPage.saveAndRun().click();
	 loggers.log(LogStatus.INFO, "Clicked LogIn button");
	
	reports.endTest(loggers);
	reports.flush();
}
}
