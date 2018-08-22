package HA_StepDefinitions;

import HA_Pages.FillFormLinkPage;
import HA_Pages.FillFormSectionOnePage;
import HA_Pages.LandingPage;
import HA_Pages.ResultPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.When;

public class FillFormLinkPageSteps extends HA_BaseClass {

	LandingPage landingPageObject;
	FillFormSectionOnePage heatAgePageObject;
	FillFormLinkPage fillFormLinkPageObject;
	ResultPage resultPageObject;

	@When("^clicked on links why is this asked, why is this imp, why is this being asked, what is cardiovascular disease, \"([^\"]*)\", \"([^\"]*)\", what is rheumatoid arthritis\\?,What is chronic kidney disease\\?,what is atrial fibrillation\\?,What does this mean\\?,Cholesterol information,blood pressure information,Blood pressure treatment$")
	public void clicked_on_links_why_is_this_asked_why_is_this_imp_why_is_this_being_asked_what_is_cardiovascular_disease_what_is_rheumatoid_arthritis_What_is_chronic_kidney_disease_what_is_atrial_fibrillation_What_does_this_mean_Cholesterol_information_blood_pressure_information_Blood_pressure_treatment(
			String height, String weight) throws Throwable {
		HA_BaseClass.initialization();
		landingPageObject = new LandingPage();
		heatAgePageObject = landingPageObject.startButtonClick();
		fillFormLinkPageObject = new FillFormLinkPage();
		resultPageObject = fillFormLinkPageObject.linksClickCheck(height, weight);
	}

		}
