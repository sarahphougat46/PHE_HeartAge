package HA_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HA_Util.HA_BaseClass;

public class ResultLinkPage extends HA_BaseClass {

	// ***Page Factory Initialization ***
	@FindBy(id = "about_calc_dialog")
	WebElement abtYourCal;

	@FindBy(xpath = "//a[@class='close']")
	WebElement closeLinkDialog;

	@FindBy(id = "int_info-smoke_cat")
	WebElement infoQuitsmoking;

	@FindBy(id = "int_info-rati")
	WebElement infoLowCal;

	@FindBy(id = "int_info-sbp")
	WebElement infoLowBP;

	@FindBy(id = "intsw-smoke_cat")
	WebElement sliderQuitSmoking;

	@FindBy(id = "intsw-rati")
	WebElement sliderLowCal;

	@FindBy(id = "intsw-sbp")
	WebElement sliderLowBP;

	public ResultLinkPage() {
		PageFactory.initElements(driver, this);
	}

	public ResultPage resultPageTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// *** About your Calculation Click ***
		js.executeScript("arguments[0].click();", abtYourCal);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Quit Smoking Slider Information ***
		js.executeScript("arguments[0].click();", sliderQuitSmoking);

		// *** Cholesterol Slider Information ***
		js.executeScript("arguments[0].click();", sliderLowCal);

		// *** BP Slider Information ***
		js.executeScript("arguments[0].click();", sliderLowBP);

		// *** About Quit Smoking Information ***
		js.executeScript("arguments[0].click();", infoQuitsmoking);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** About Low Cholesterol Information ***
		js.executeScript("arguments[0].click();", infoLowCal);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** About Low BP Information ***
		js.executeScript("arguments[0].click();", infoLowBP);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		return new ResultPage();

	}
}
