package HA_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HA_Util.HA_BaseClass;

public class FillFormSectionFourPage extends HA_BaseClass {

	// ***Page Factory Initialization ***
	@FindBy(id = "rcvd_no")
	WebElement rel_cardioNoSelect;

	@FindBy(id = "rcvd_yes")
	WebElement rel_cardioYesSelect;

	@FindBy(id = "cholesterol_no")
	WebElement cholesterolNoSelect;

	@FindBy(id = "cholesterol_yes")
	WebElement cholesterolYesSelect;

	@FindBy(id = "bp_no")
	WebElement bpNoSelect;

	@FindBy(id = "bp_yes")
	WebElement bpYesSelect;
	
	@FindBy(id = "bpt_no")
	WebElement bptNoSelect;

	@FindBy(id = "bpt_yes")
	WebElement bptYesSelect;
	
	@FindBy(id = "get_results")
	WebElement getResultClick;
	
	public FillFormSectionFourPage() {
		PageFactory.initElements(driver, this);
	}

	public ResultPage fillFormSectionFour(String relative_cardio, String cholesterol, String bp, String bp_treatment) {

		// *** Relative_Cardio Selection ***
		if (relative_cardio.equalsIgnoreCase("n")) {
			rel_cardioNoSelect.click();
		} else if (relative_cardio.equalsIgnoreCase("y")) {
			rel_cardioYesSelect.click();
		}

		// *** Cholesterol Selection ***
		if (cholesterol.equalsIgnoreCase("n")) {
			cholesterolNoSelect.click();
		} else if (cholesterol.equalsIgnoreCase("y")) {
			cholesterolYesSelect.click();
		}

		// *** BP Selection ***
		if (bp.equalsIgnoreCase("n")) {
			bpNoSelect.click();
		} else if (bp.equalsIgnoreCase("y")) {
			bpYesSelect.click();
		}

		// *** BP Treatment Selection ***
		if (bp.equalsIgnoreCase("n")) {
			bptNoSelect.click();
		} else if (bp.equalsIgnoreCase("y")) {
			bptYesSelect.click();
		}
		
		// *** Get Result Click ***
		getResultClick.click();
		
		return new ResultPage();
	}
}
