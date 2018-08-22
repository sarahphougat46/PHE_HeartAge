package HA_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HA_Util.HA_BaseClass;

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

	@FindBy(xpath="//a[@id='gender_1']")
	WebElement maleOption;
	
	@FindBy(id="gender_0")
	WebElement femaleOption;
	
	@FindBy(id="ethnicity")
	WebElement ethnicGroupID;
	
	@FindBy(id="postcode")
	WebElement postCodeID;
	
	public FillFormSectionOnePage() {
		PageFactory.initElements(driver, this);
	}

	public FillFormSectionTwoPage fillFormSectionOne(String day_M, String month_M, String year_M, String gender, 
			String ethnicGroup, String postCode) throws InterruptedException {

		//*** Selecting DOB ***
		Select itemDaySelect = new Select(day);
		itemDaySelect.selectByValue(day_M);

		Select itemMonthSelect = new Select(month);
		itemMonthSelect.selectByValue(month_M);

		Select itemYearSelect = new Select(year);
		itemYearSelect.selectByValue(year_M);
		
		//*** Selecting Gender ***
		if(gender.equalsIgnoreCase("m")) {
			maleOption.click();
		}else if(gender.equalsIgnoreCase("f")) {
			femaleOption.click();
		}
		
		//*** Selecting Ethnicity ***
		Select dropdownEthnicity = new Select(ethnicGroupID);
		List<WebElement> elementCount =dropdownEthnicity.getOptions();		
		for(WebElement option: elementCount) {
			if(option.getText().equalsIgnoreCase(ethnicGroup)) {
				option.click();
			}
		}
		
		//*** Selecting PostCode ***
		postCodeID.clear();
		postCodeID.sendKeys(postCode);

		return new FillFormSectionTwoPage();

	}

}
