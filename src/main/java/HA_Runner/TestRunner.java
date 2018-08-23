package HA_Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.*;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Automation\\BDD_PHE_HeartAge\\src\\main\\java\\HA_Features\\HeartAge.feature", glue = {
		"HA_StepDefinitions" },
plugin = {"pretty", "html:target/cucumber-html-report", "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
tags= {"@CompleteFlow,@LinkFlow"}

)
public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("C:\\Automation\\BDD_PHE_HeartAge\\src\\main\\java\\HA_Config\\extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setTestRunnerOutput("PHE_HeartAge Automation Test");
	}
}
