package HA_StepDefinitions;


import HA_Pages.FillFormSectionOnePage;
import HA_Pages.LandingPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LandingPageSteps extends HA_BaseClass {

	LandingPage landingPageObject;	
	FillFormSectionOnePage heatAgePageObject; 	
	
	@Given("^I land on heart age test page$")
	public void i_land_on_heart_age_test_page() throws Throwable {
	   HA_BaseClass.initialization();
	}

	@Given("^click on Start option$")
	public void click_on_Start_option() throws Throwable {
		landingPageObject = new LandingPage();
		heatAgePageObject= landingPageObject.startButtonClick();
	}	
}

