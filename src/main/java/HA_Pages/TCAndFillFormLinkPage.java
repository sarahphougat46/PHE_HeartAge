package HA_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HA_Util.HA_BaseClass;
import HA_Util.Xls_Reader;

public class TCAndFillFormLinkPage extends HA_BaseClass {

	// ***Page Factory Initialization ***
	@FindBy(linkText = "terms and conditions")
	WebElement tc_LinkClick;

	@FindBy(linkText = "Why is this asked?")
	WebElement genderLinkClick;

	@FindBy(xpath = "//a[@class='close']")
	WebElement closeLinkDialog;

	@FindBy(linkText = "Why is this important?")
	WebElement ethnicLinkClick;

	@FindBy(linkText = "Why is this being asked?")
	WebElement postcodeLinkClick;

	@FindBy(linkText = "What is cardiovascular disease?")
	WebElement cardiovascularLinkClick;

	@FindBy(id = "h_cm")
	WebElement height_cm;

	@FindBy(id = "w_kg")
	WebElement weight_kg;

	@FindBy(linkText = "What is rheumatoid arthritis?")
	WebElement arthritisLinkClick;

	@FindBy(linkText = "What is chronic kidney disease?")
	WebElement kidneyLinkClick;

	@FindBy(linkText = "What is atrial fibrillation?")
	WebElement atrialLinkClick;

	@FindBy(linkText = "What does this mean?")
	WebElement meanLinkClick;

	@FindBy(linkText = "Cholesterol information")
	WebElement chol_infoLinkClick;

	@FindBy(linkText = "Blood pressure information")
	WebElement bp_infoLinkClick;

	@FindBy(linkText = "Blood pressure treatment")
	WebElement bpt_infoLinkClick;
	
	@FindBy(id = "get_results")
	WebElement getResultClick;

	@FindBy(id = "restart")
	WebElement startAgainClick;

	@FindBy(id = "start")
	WebElement clickStart;

	public TCAndFillFormLinkPage() {
		PageFactory.initElements(driver, this);
	}

	public ResultPage tc_LinkClick() throws InterruptedException {

		// *** Terms and Conditions check ***
		int frameSize = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < frameSize; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			tc_LinkClick.click();
		}
		return new ResultPage();
	}

	public ResultPage form_LinkClick() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// *** Gender Link Click Event ***
		js.executeScript("arguments[0].click();", genderLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Ethnic Group Link Click Event ***
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", ethnicLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** PostCode Link Click Event ***
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", postcodeLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Cardiovascular Link Click Event ***
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", cardiovascularLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Rheumatoid arthritis Link Click Event ***
		js.executeScript("arguments[0].click();", arthritisLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Chronic Kidney Disease Link Click Event ***
		// kidneyLinkClick.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", kidneyLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Atrial Fibrillation Link Click Event ***
		js.executeScript("arguments[0].click();", atrialLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** What does this mean Link Click Event ***
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", meanLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Cholesterol Information Link Click Event ***
		js.executeScript("arguments[0].click();", chol_infoLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** BP Information Link Click Event ***
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", bp_infoLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** BP Treatment Link Click Event ***
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", bpt_infoLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		return new ResultPage();
	}

}
