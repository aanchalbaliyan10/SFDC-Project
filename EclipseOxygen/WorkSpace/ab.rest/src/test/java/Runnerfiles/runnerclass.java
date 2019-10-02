package Runnerfiles;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" }, 
	glue = {"StepDefinationFile" }, 
	features = { "src/test/resources/FeaturesFile" }, 
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})


public class runnerclass {
	@AfterClass
    public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File("Config/report.xml"));
 }
}
