package HA_StepDefinitions;

import HA_Pages.FillFormSectionOnePage;
import HA_Pages.FillFormSectionTwoPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FillFormSectionOnePageSteps extends HA_BaseClass {

//	FillFormSectionOnePage fillFormSectionOnePageObject;
//	FillFormSectionTwoPage fillFormSectionTwoPageObject;

//	@Then("^If not scroll down then enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//	public void if_not_scroll_down_then_enter(String day, String month, String year, String gender, String ethnicGroup,
//			String postCode) throws Throwable {
//
//		fillFormSectionOnePageObject = new FillFormSectionOnePage();
//		fillFormSectionTwoPageObject = fillFormSectionOnePageObject.fillFormSectionOne(day, month, year, gender, ethnicGroup, postCode);
//	}
	//**********************************************************************
	
	
	FillFormSectionOnePage fillFormSectionOnePageObject;
	FillFormSectionTwoPage fillFormSectionTwoPageObject;
	@Given("^Enter details from excel \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_details_from_excel_and(String excelFilePath, String scenarioName) throws Throwable {
	   
		fillFormSectionOnePageObject=new FillFormSectionOnePage();
		fillFormSectionTwoPageObject = fillFormSectionOnePageObject.fillFormSectionOne(excelFilePath, scenarioName);
	}
	
}
