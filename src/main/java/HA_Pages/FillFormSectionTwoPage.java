package HA_Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HA_Util.HA_BaseClass;

public class FillFormSectionTwoPage extends HA_BaseClass {

	// ***Page Factory Initialization ***
	@FindBy(id = "cardio_no")
	WebElement cardioNoSelect;

	@FindBy(id = "cardio_yes")
	WebElement cardioYesSelect;

	@FindBy(id = "smoke")
	WebElement smokeID;

	@FindBy(id = "h_ft")
	WebElement feetID;

	@FindBy(id = "h_in")
	WebElement inchesID;

	@FindBy(id = "w_st")
	WebElement stoneID;

	@FindBy(id = "w_lb")
	WebElement poundsID;

	public FillFormSectionTwoPage() {
		PageFactory.initElements(driver, this);
	}

	public FillFormSectionThreePage fillFormSectionTwo(String card_disease, String smoke, String height, String weight)
			throws InterruptedException {

		// *** Page Scroll Down ***
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 250);");

		// *** Cardio Selection ***
		if (card_disease.equalsIgnoreCase("n")) {
			cardioNoSelect.click();
		} else if (card_disease.equalsIgnoreCase("y")) {
			cardioYesSelect.click();
		}

		// *** Smoke Selection ***
		Select dropdownSmoke = new Select(smokeID);
		List<WebElement> elementCount = dropdownSmoke.getOptions();
		for (WebElement option : elementCount) {
			if (option.getText().equalsIgnoreCase(smoke)) {
				option.click();
			}
		}

		// *** Height Selection ***

		String[] feetAndInches = height.split("'");
		String feetValue = feetAndInches[0];
		String inchesValue = feetAndInches[1];
		feetID.clear();
		feetID.sendKeys(feetValue);

		inchesID.clear();
		inchesID.sendKeys(inchesValue);

		// *** Weight Selection ***
		String[] stoneAndPounds = weight.split("-");
		String stoneValue = stoneAndPounds[0];
		String poundValue = stoneAndPounds[1];
		stoneID.clear();
		stoneID.sendKeys(stoneValue);

		poundsID.clear();
		poundsID.sendKeys(poundValue);

		return new FillFormSectionThreePage();
	}
}
