package HA_StepDefinitions;

import HA_Pages.ResultPage;
import HA_Pages.TermsAndConditionsPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Given;

public class TermsAndConditionsPageSteps extends HA_BaseClass {

	TermsAndConditionsPage termsAndConditionsPageObject;
	ResultPage resultPageObject;
	
	@Given("^I land on heart age page and click on terms and conditions$")
	public void i_land_on_heart_age_page_and_click_on_terms_and_conditions() throws Throwable {
		HA_BaseClass.initialization();
		
		termsAndConditionsPageObject = new TermsAndConditionsPage();
		resultPageObject= termsAndConditionsPageObject.tc_LinkClick();
		driver.quit();
	}

}
