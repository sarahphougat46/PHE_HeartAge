package HA_StepDefinitions;

import HA_Pages.ResultLinkPage;
import HA_Pages.ResultPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResultLinkPageSteps extends HA_BaseClass {

	ResultLinkPage resultLinkPageObject;
	ResultPage resultPageObject;
	
	@When("^click on get your results and check links about your calculation, loose_wt_info, low_chol_info, reduce_bp_info, check on improving height, cholesterol, bp by clicking on more details and read more about NHS Check$")
	public void click_on_get_your_results_and_check_links_about_your_calculation_loose_wt_info_low_chol_info_reduce_bp_info_check_on_improving_height_cholesterol_bp_by_clicking_on_more_details_and_read_more_about_NHS_Check() throws Throwable {
		resultLinkPageObject = new ResultLinkPage();
		resultPageObject= resultLinkPageObject.resultPageTest();
		
	}

	@Then("^either click on StartAgain or back$")
	public void either_click_on_StartAgain_or_back() throws Throwable {
	   
	}
}
