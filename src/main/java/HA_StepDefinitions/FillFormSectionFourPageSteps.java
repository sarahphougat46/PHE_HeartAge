package HA_StepDefinitions;

import HA_Pages.FillFormSectionFourPage;
import HA_Pages.ResultPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Then;

public class FillFormSectionFourPageSteps extends HA_BaseClass {

	FillFormSectionFourPage fillFormSectionFourPageObject;
	ResultPage resultPageObject;
	
	@Then("^also enter values for \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and click on get your results$")
	public void also_enter_values_for_and_click_on_get_your_results(String relative_cardio, 
			String cholestrol, String bp, String bp_treatment) throws Throwable {
	    
		fillFormSectionFourPageObject = new FillFormSectionFourPage();
		resultPageObject = fillFormSectionFourPageObject.fillFormSectionFour(relative_cardio, cholestrol, bp, bp_treatment);
		
	}
}		
