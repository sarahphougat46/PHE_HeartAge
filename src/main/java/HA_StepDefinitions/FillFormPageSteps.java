package HA_StepDefinitions;

import HA_Pages.FillFormPage;
import HA_Pages.ResultPage;
import HA_Util.HA_BaseClass;
import cucumber.api.java.en.Given;

public class FillFormPageSteps extends HA_BaseClass {
	
	FillFormPage fillFormPageObject;
	ResultPage resultPageObject; 
	@Given("^Enter details from excel \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_details_from_excel_and(String excelFilePath, String scenarioName) throws Throwable {
	   
		fillFormPageObject=new FillFormPage();
		resultPageObject = fillFormPageObject.fillFormSectionOne(excelFilePath, scenarioName);
		driver.quit();
	}
	
}
