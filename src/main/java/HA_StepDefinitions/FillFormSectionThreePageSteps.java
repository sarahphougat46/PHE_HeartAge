package HA_StepDefinitions;

import HA_Pages.FillFormSectionFourPage;
import HA_Pages.FillFormSectionThreePage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Then;

public class FillFormSectionThreePageSteps extends HA_BaseClass {

	FillFormSectionThreePage fillFormSectionThreePageObject;
	FillFormSectionFourPage  fillFormSectionFourPageObject;
	
	@Then("^Enter values for \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_values_for(String diabetes, String arthritis, String kidney, String atrial) throws Throwable {
		fillFormSectionThreePageObject = new FillFormSectionThreePage();
		fillFormSectionFourPageObject= fillFormSectionThreePageObject.fillFormSectionThree(diabetes, arthritis, kidney, atrial);
		
	}
}
