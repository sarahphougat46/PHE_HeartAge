package HA_Pages;

import org.openqa.selenium.JavascriptExecutor;
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

	public ResultLinkPage fillFormSectionFour(String relative_cardio, String cholesterol, String bp, String bp_treatment) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// *** Relative_Cardio Selection ***
		if (relative_cardio.equalsIgnoreCase("n")) {
			js.executeScript("arguments[0].click();", rel_cardioNoSelect);
		} else if (relative_cardio.equalsIgnoreCase("y")) {
			js.executeScript("arguments[0].click();", rel_cardioYesSelect);
		}

		// *** Cholesterol Selection ***
		if (cholesterol.equalsIgnoreCase("n")) {
			js.executeScript("arguments[0].click();", cholesterolNoSelect);
		} else if (cholesterol.equalsIgnoreCase("y")) {
			js.executeScript("arguments[0].click();", cholesterolYesSelect);
		}

		// *** BP Selection ***
		if (bp.equalsIgnoreCase("n")) {
			js.executeScript("arguments[0].click();", bpNoSelect);
		} else if (bp.equalsIgnoreCase("y")) {
			js.executeScript("arguments[0].click();", bpYesSelect);
		}

		// *** BP Treatment Selection ***
		if (bp.equalsIgnoreCase("n")) {
			js.executeScript("arguments[0].click();", bptNoSelect);
		} else if (bp.equalsIgnoreCase("y")) {
			js.executeScript("arguments[0].click();", bptYesSelect);
		}
		
		// *** Get Result Click ***
		//getResultClick.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", getResultClick);
		
		return new ResultLinkPage();
	}
}
