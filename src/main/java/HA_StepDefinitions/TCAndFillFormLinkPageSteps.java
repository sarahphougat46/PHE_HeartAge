package HA_StepDefinitions;

import HA_Pages.FillFormPage;
import HA_Pages.LandingPage;
import HA_Pages.ResultPage;
import HA_Pages.TCAndFillFormLinkPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Given;

public class TCAndFillFormLinkPageSteps extends HA_BaseClass {

	TCAndFillFormLinkPage termsAndConditionsPageObject;
	ResultPage resultPageObject;
	LandingPage landingPageObject;
	FillFormPage fillFormPageObject;
	
	@Given("^I land on heart age page and click on terms and conditions$")
	public void i_land_on_heart_age_page_and_click_on_terms_and_conditions() throws Throwable {
		HA_BaseClass.initialization();
		
		termsAndConditionsPageObject = new TCAndFillFormLinkPage();
		resultPageObject= termsAndConditionsPageObject.tc_LinkClick();	
		
		HA_BaseClass.initialization();
		landingPageObject = new LandingPage();
		fillFormPageObject = landingPageObject.startButtonClick();
		termsAndConditionsPageObject= new TCAndFillFormLinkPage();
		resultPageObject= termsAndConditionsPageObject.form_LinkClick();
		driver.quit();
	}	

}
