package HA_Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Automation\\BDD_PHE_HeartAge\\src\\main\\java\\HA_Features\\HeartAge.feature",
		glue= {"HA_StepDefinitions"},
		tags= {"@CompleteFlow,@LinkFlow"}
		//dryRun= true
		)	

public class TestRunner {

}
