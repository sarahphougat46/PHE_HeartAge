package HA_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HA_Util.HA_BaseClass;

public class FillFormSectionThreePage extends HA_BaseClass {

	// ***Page Factory Initialization ***
	@FindBy(id = "diabetes_no")
	WebElement diabetesNoSelect;

	@FindBy(id = "diabetes_yes")
	WebElement diabetesYesSelect;

	@FindBy(id = "arthritis_no")
	WebElement arthritisNoSelect;

	@FindBy(id = "arthritis_yes")
	WebElement arthritisYesSelect;

	@FindBy(id = "kidney_no")
	WebElement kidneyNoSelect;

	@FindBy(id = "kidney_yes")
	WebElement kidneyYesSelect;

	@FindBy(id = "af_no")
	WebElement atrialNoSelect;

	@FindBy(id = "af_yes")
	WebElement atrialYesSelect;

	public FillFormSectionThreePage() {
		PageFactory.initElements(driver, this);
	}

	public FillFormSectionFourPage fillFormSectionThree(String diabetes, String arthritis, String kidney,
			String atrial) {

		// *** Diabetes Selection ***
		if (diabetes.equalsIgnoreCase("n")) {
			diabetesNoSelect.click();
		} else if (diabetes.equalsIgnoreCase("y")) {
			diabetesYesSelect.click();
		}

		// *** Arthritis Selection ***
		if (arthritis.equalsIgnoreCase("n")) {
			arthritisNoSelect.click();
		} else if (arthritis.equalsIgnoreCase("y")) {
			arthritisYesSelect.click();
		}

		// *** Kidney Selection ***
		if (kidney.equalsIgnoreCase("n")) {
			kidneyNoSelect.click();
		} else if (kidney.equalsIgnoreCase("y")) {
			kidneyYesSelect.click();
		}

		// *** Atrial Fibrillation Selection ***
		if (atrial.equalsIgnoreCase("n")) {
			atrialNoSelect.click();
		} else if (atrial.equalsIgnoreCase("y")) {
			atrialYesSelect.click();
		}
		
		return new FillFormSectionFourPage();
	}
}
