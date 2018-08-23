package HA_StepDefinitions;

import HA_Pages.FillFormPage;
import HA_Pages.Height_WeightPage;
import HA_Pages.LandingPage;
import HA_Pages.ResultPage;
import HA_Pages.TCAndFillFormLinkPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.When;

public class HeightWeightPageSteps extends HA_BaseClass {

	TCAndFillFormLinkPage termsAndConditionsPageObject;
	ResultPage resultPageObject;
	LandingPage landingPageObject;
	FillFormPage fillFormPageObject;
	Height_WeightPage height_WeightPageObject;
	
	@When("^clicked on links why is this asked, why is this imp, why is this being asked, what is cardiovascular disease, height, weight, what is rheumatoid arthritis\\?,What is chronic kidney disease\\?,what is atrial fibrillation\\?,What does this mean\\?,Cholesterol information,blood pressure information,Blood pressure treatment from \"([^\"]*)\"$")
	public void clicked_on_links_why_is_this_asked_why_is_this_imp_why_is_this_being_asked_what_is_cardiovascular_disease_height_weight_what_is_rheumatoid_arthritis_What_is_chronic_kidney_disease_what_is_atrial_fibrillation_What_does_this_mean_Cholesterol_information_blood_pressure_information_Blood_pressure_treatment_from(String excelPath) throws Throwable {
		HA_BaseClass.initialization();
		landingPageObject = new LandingPage();
		fillFormPageObject = landingPageObject.startButtonClick();
		height_WeightPageObject= new Height_WeightPage();
		resultPageObject =height_WeightPageObject.height_WeightTest(excelPath);
		driver.quit();
	}
}
