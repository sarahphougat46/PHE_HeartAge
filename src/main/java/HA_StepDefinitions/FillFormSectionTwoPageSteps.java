package HA_StepDefinitions;

import HA_Pages.FillFormSectionThreePage;
import HA_Pages.FillFormSectionTwoPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Then;

public class FillFormSectionTwoPageSteps extends HA_BaseClass {

	FillFormSectionTwoPage fillFormSectionTwoPageObject;
	FillFormSectionThreePage fillFormSectionThreePageObject;
	
	@Then("^Enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter(String card_disease, String smoke, String height, String weight) throws Throwable {
		fillFormSectionTwoPageObject = new FillFormSectionTwoPage();
		fillFormSectionThreePageObject= fillFormSectionTwoPageObject.fillFormSectionTwo(card_disease, smoke, height, weight);
	}

}
