package HA_Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HA_Util.HA_BaseClass;
import HA_Util.Xls_Reader;

public class FillFormSectionOnePage extends HA_BaseClass {

	// ***Page Factory Initialization ***
	@FindBy(id = "dob_day")
	WebElement day;

	@FindBy(id = "dob_month")
	WebElement month;

	@FindBy(id = "dob_year")
	WebElement year;
	
	@FindBy(xpath = "//a[text()='OneYou website']")
	WebElement jsPopUpLink;

	@FindBy(xpath = "//a[@id='gender_1']")
	WebElement maleOption;

	@FindBy(id = "gender_0")
	WebElement femaleOption;

	@FindBy(id = "ethnicity")
	WebElement ethnicGroupID;

	@FindBy(id = "postcode")
	WebElement postCodeID;

	//******************************************
	@FindBy(xpath = "//a[@class='close']")
	WebElement closeLinkDialog;
	
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
	
	//**************************************************
	
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
	
	//******************************************************
	public FillFormSectionOnePage() {
		PageFactory.initElements(driver, this);
	}

//	public FillFormSectionTwoPage fillFormSectionOne(String day_M, String month_M, String year_M, String gender,
//			String ethnicGroup, String postCode) throws InterruptedException {
//
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		// *** Selecting DOB ***
//		Select itemDaySelect = new Select(day);
//		itemDaySelect.selectByValue(day_M);
//
//		Select itemMonthSelect = new Select(month);
//		itemMonthSelect.selectByValue(month_M);
//
//		Select itemYearSelect = new Select(year);
//		itemYearSelect.selectByValue(year_M);
//		int year_MIntValue = Integer.parseInt(year_M);
//		if (year_MIntValue <= year_Threshold) {
//			Thread.sleep(2000);			
//			js.executeScript("arguments[0].click();", closeLinkDialog);
//			
//		} else {
//			itemYearSelect.selectByValue(year_M);
//		}

		// *** Selecting Gender ***
//		if (gender.equalsIgnoreCase("m")) {
//			js.executeScript("arguments[0].click();", maleOption);
//		} else if (gender.equalsIgnoreCase("f")) {
//			js.executeScript("arguments[0].click();", femaleOption);
//		}
//
//		// *** Selecting Ethnicity ***
//		Select dropdownEthnicity = new Select(ethnicGroupID);
//		List<WebElement> elementCount = dropdownEthnicity.getOptions();
//		for (WebElement option : elementCount) {
//			if (option.getText().equalsIgnoreCase(ethnicGroup)) {
//				option.click();
//			}
//		}
//
//		// *** Selecting PostCode ***
//		postCodeID.clear();
//		postCodeID.sendKeys(postCode);
//
//		return new FillFormSectionTwoPage();
	
	public FillFormSectionTwoPage fillFormSectionOne(String excelPath, String scenarioName) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Xls_Reader reader = new Xls_Reader(excelPath);
		
		// *** Selecting DOB ***
		String dayFromExcel= reader.getCellData("Testcases", "Day", 2);
		Select itemDaySelect = new Select(day);
		itemDaySelect.selectByVisibleText(dayFromExcel);
		
		String month_M =reader.getCellData("Testcases", "Month", 2);
		Select itemMonthSelect = new Select(month);
		itemMonthSelect.selectByVisibleText(month_M);
		
		String year_M =reader.getCellData("Testcases", "Year", 2);
		Select itemYearSelect = new Select(year);
		itemYearSelect.selectByVisibleText(year_M);
		
		// *** Selecting Gender ***
		String gender = reader.getCellData("Testcases", "Gender", 2);
		if (gender.equalsIgnoreCase("m")) {
			js.executeScript("arguments[0].click();", maleOption);
		} else if (gender.equalsIgnoreCase("f")) {
			js.executeScript("arguments[0].click();", femaleOption);
		}

		// *** Selecting Ethnicity ***
		String ethnicGroup = reader.getCellData("Testcases", "EthnicGroup", 2);
		Select dropdownEthnicity = new Select(ethnicGroupID);
		List<WebElement> elementCount = dropdownEthnicity.getOptions();
		for (WebElement option : elementCount) {
			if (option.getText().equalsIgnoreCase(ethnicGroup)) {
				option.click();
			}
		}
		
		// *** Selecting PostCode ***
		String postCode = reader.getCellData("Testcases", "PostCode", 2);
		postCodeID.clear();
		postCodeID.sendKeys(postCode);
		
		// *** Page Scroll Down ***
		js.executeScript("scroll(0, 250);");
		
		// *** Cardio Selection ***
		String card_disease = reader.getCellData("Testcases", "Do you have Cardiovacular Disease?", 2);
		System.out.println(card_disease);
		if (card_disease.equalsIgnoreCase("no")) {
			js.executeScript("arguments[0].click();", cardioNoSelect);
		} else if (card_disease.equalsIgnoreCase("yes")) {
			js.executeScript("arguments[0].click();", cardioYesSelect);
		}
		
		// *** Smoke Selection ***
		String smoke = reader.getCellData("Testcases", "Do you Smoke?", 2);
		Select dropdownSmoke = new Select(smokeID);
		List<WebElement> element_Count = dropdownSmoke.getOptions();
		for (WebElement option : element_Count) {
			if (option.getText().equalsIgnoreCase(smoke)) {
				option.click();
			}
		}	

		// *** Height Selection ***
		String height = reader.getCellData("Testcases", "Height", 2);
		String[] feetAndInches = height.split("'");
		String feetValue = feetAndInches[0];
		String inchesValue = feetAndInches[1];
		feetID.clear();
		feetID.sendKeys(feetValue);

		inchesID.clear();
		inchesID.sendKeys(inchesValue);

		// *** Weight Stone Selection ***
		String weightStone = reader.getCellData("Testcases", "WeightStone", 2);
		stoneID.clear();
		stoneID.sendKeys(weightStone);
		

		// *** Weight Pound Selection ***
		String weightPound = reader.getCellData("Testcases", "Weight Pounds", 2);
		poundsID.clear();
		poundsID.sendKeys(weightPound);

		// *** Diabetes Selection ***
		String diabetes = reader.getCellData("Testcases", "	Do you have diabetes?", 2);
		if (diabetes.equalsIgnoreCase("no")) {
			js.executeScript("arguments[0].click();", diabetesNoSelect);
		} else if (diabetes.equalsIgnoreCase("yes")) {
			js.executeScript("arguments[0].click();", diabetesYesSelect);
		}

		// *** Arthritis Selection ***
		String arthritis = reader.getCellData("Testcases", "Do you have rheumatoid arthritis?", 2);
		if (arthritis.equalsIgnoreCase("no")) {			
			js.executeScript("arguments[0].click();", arthritisNoSelect);
		} else if (arthritis.equalsIgnoreCase("yes")) {
			js.executeScript("arguments[0].click();", arthritisYesSelect);
		}

		// *** Kidney Selection *** 
		String kidney = reader.getCellData("Testcases", "Do you have chronic kidney disease?", 2);
		if (kidney.equalsIgnoreCase("no")) {
			js.executeScript("arguments[0].click();", kidneyNoSelect);
		} else if (kidney.equalsIgnoreCase("yes")) {
			js.executeScript("arguments[0].click();", kidneyYesSelect);
		}

		// *** Atrial Fibrillation Selection ***
		String atrial = reader.getCellData("Testcases", "Have you had atrial fibrilation?", 2);
		if (atrial.equalsIgnoreCase("no")) {
			js.executeScript("arguments[0].click();", atrialNoSelect);
		} else if (atrial.equalsIgnoreCase("yes")) {
			js.executeScript("arguments[0].click();", atrialYesSelect);
		}
		return new FillFormSectionTwoPage();
	}
}
