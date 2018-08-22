package HA_Pages;

import org.openqa.selenium.JavascriptExecutor;
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

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// *** Diabetes Selection ***
		if (diabetes.equalsIgnoreCase("n")) {
			js.executeScript("arguments[0].click();", diabetesNoSelect);
		} else if (diabetes.equalsIgnoreCase("y")) {
			js.executeScript("arguments[0].click();", diabetesYesSelect);
		}

		// *** Arthritis Selection ***
		if (arthritis.equalsIgnoreCase("n")) {			
			js.executeScript("arguments[0].click();", arthritisNoSelect);
		} else if (arthritis.equalsIgnoreCase("y")) {
			js.executeScript("arguments[0].click();", arthritisYesSelect);
		}

		// *** Kidney Selection ***
		if (kidney.equalsIgnoreCase("n")) {
			js.executeScript("arguments[0].click();", kidneyNoSelect);
		} else if (kidney.equalsIgnoreCase("y")) {
			js.executeScript("arguments[0].click();", kidneyYesSelect);
		}

		// *** Atrial Fibrillation Selection ***
		if (atrial.equalsIgnoreCase("n")) {
			js.executeScript("arguments[0].click();", atrialNoSelect);
		} else if (atrial.equalsIgnoreCase("y")) {
			js.executeScript("arguments[0].click();", atrialYesSelect);
		}
		
		return new FillFormSectionFourPage();
	}
}
