package HA_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HA_Util.HA_BaseClass;
import HA_Util.Xls_Reader;

public class Height_WeightPage extends HA_BaseClass {

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

	@FindBy(id = "cardio_no")
	WebElement cardioNoSelect;

	@FindBy(id = "cardio_yes")
	WebElement cardioYesSelect;

	@FindBy(id = "smoke")
	WebElement smokeID;

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

	@FindBy(id = "h_cm")
	WebElement height_cm;

	@FindBy(id = "w_kg")
	WebElement weight_kg;

	@FindBy(id = "get_results")
	WebElement getResultClick;

	@FindBy(id = "restart")
	WebElement startAgainClick;

	@FindBy(id = "start")
	WebElement clickStart;

	public Height_WeightPage() {
		PageFactory.initElements(driver, this);
	}

	public ResultPage height_WeightTest(String excelPath) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Xls_Reader reader = new Xls_Reader(excelPath);

		int row_Count = reader.getRowCount("Testcases");
		System.out.println(row_Count);	
		
		for (int rowNum = 2; rowNum <= row_Count; rowNum++) {

			String dayFromExcel = reader.getCellData("Testcases", "Day", rowNum);
			Select itemDaySelect = new Select(day);
			itemDaySelect.selectByVisibleText(dayFromExcel);

			String month_M = reader.getCellData("Testcases", "Month", rowNum);
			Select itemMonthSelect = new Select(month);
			itemMonthSelect.selectByVisibleText(month_M);

			String year_M = reader.getCellData("Testcases", "Year", rowNum);
			Select itemYearSelect = new Select(year);
			itemYearSelect.selectByVisibleText(year_M);

			// *** Selecting Gender ***
			String gender = reader.getCellData("Testcases", "Gender", rowNum);
			if (gender.equalsIgnoreCase("m")) {
				js.executeScript("arguments[0].click();", maleOption);
			} else if (gender.equalsIgnoreCase("f")) {
				js.executeScript("arguments[0].click();", femaleOption);
			}

			// *** Selecting Ethnicity ***
			String ethnicGroup = reader.getCellData("Testcases", "EthnicGroup", rowNum);
			Select dropdownEthnicity = new Select(ethnicGroupID);
			List<WebElement> elementCount = dropdownEthnicity.getOptions();
			for (WebElement option : elementCount) {
				if (option.getText().equalsIgnoreCase(ethnicGroup)) {
					option.click();
				}
			}

			// *** Selecting PostCode ***
			String postCode = reader.getCellData("Testcases", "PostCode", rowNum);
			postCodeID.clear();
			postCodeID.sendKeys(postCode);

			// *** Page Scroll Down ***
			js.executeScript("scroll(0, 250);");

			// *** Cardio Selection ***
			String card_disease = reader.getCellData("Testcases", "Do you have Cardiovacular Disease?", rowNum);
			if (card_disease.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", cardioNoSelect);
			} else if (card_disease.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", cardioYesSelect);
			}

			// *** Smoke Selection ***
			String smoke = reader.getCellData("Testcases", "Do you Smoke?", rowNum);
			Select dropdownSmoke = new Select(smokeID);
			List<WebElement> element_Count = dropdownSmoke.getOptions();
			for (WebElement option : element_Count) {
				if (option.getText().equalsIgnoreCase(smoke)) {
					option.click();
				}
			}

			List<WebElement> list_ht_wt = driver.findElements(By.xpath("//a[text()='Switch to metric']"));
			// *** Height in Cms Selection ***
			String height = reader.getCellData("Testcases", "Height(cms)", rowNum);
			if (list_ht_wt.get(0) != null) {
				js.executeScript("arguments[0].click();", list_ht_wt.get(0));
				height_cm.clear();
				height_cm.sendKeys(height);
			}

			// *** Weight in Kg selection ***
			String weight = reader.getCellData("Testcases", "Weight(Kg)", rowNum);
			if (list_ht_wt.get(1) != null) {
				list_ht_wt.get(1).click();
				weight_kg.clear();
				weight_kg.sendKeys(weight);
			}

			// *** Diabetes Selection ***
			String diabetes = reader.getCellData("Testcases", "Do you have diabetes?", rowNum);
			if (diabetes.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", diabetesNoSelect);
			} else if (diabetes.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", diabetesYesSelect);
			}

			// *** Arthritis Selection ***
			String arthritis = reader.getCellData("Testcases", "Do you have rheumatoid arthritis?", rowNum);
			if (arthritis.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", arthritisNoSelect);
			} else if (arthritis.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", arthritisYesSelect);
			}

			// *** Kidney Selection ***
			String kidney = reader.getCellData("Testcases", "Do you have chronic kidney disease?", rowNum);
			if (kidney.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", kidneyNoSelect);
			} else if (kidney.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", kidneyYesSelect);
			}

			// *** Atrial Fibrillation Selection ***
			String atrial = reader.getCellData("Testcases", "Have you had atrial fibrilation?", rowNum);
			if (atrial.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", atrialNoSelect);
			} else if (atrial.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", atrialYesSelect);
			}

			// *** Relative_Cardio Selection ***
			String relative_cardio = reader.getCellData("Testcases",
					"Has a close relative under 60 been told they have cardiovascular disease?", rowNum);
			if (relative_cardio.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", rel_cardioNoSelect);
			} else if (relative_cardio.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", rel_cardioYesSelect);
			}

			// *** Cholesterol Selection ***
			String cholesterol = reader.getCellData("Testcases", "Do you know your cholesterol?", rowNum);
			if (cholesterol.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", cholesterolNoSelect);
			} else if (cholesterol.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", cholesterolYesSelect);
			}

			// *** BP Selection ***
			String bp = reader.getCellData("Testcases", "Do you know your blood pressure? (mmHg)", rowNum);
			if (bp.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", bpNoSelect);
			} else if (bp.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", bpYesSelect);
			}

			// *** BP Treatment Selection ***
			String bpt = reader.getCellData("Testcases", "Have you ever received blood pressure treatment?", rowNum);
			if (bpt.equalsIgnoreCase("no")) {
				js.executeScript("arguments[0].click();", bptNoSelect);
			} else if (bpt.equalsIgnoreCase("yes")) {
				js.executeScript("arguments[0].click();", bptYesSelect);
			}

			js.executeScript("arguments[0].click();", getResultClick);
			js.executeScript("arguments[0].click();", startAgainClick);
			js.executeScript("arguments[0].click();", clickStart);
		}
		return new ResultPage();

	}
}
