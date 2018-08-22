package HA_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HA_Util.HA_BaseClass;

public class FillFormLinkPage extends HA_BaseClass {

	// ***Page Factory Initialization ***
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

	public FillFormLinkPage() {
		PageFactory.initElements(driver, this);
	}

	public ResultPage linksClickCheck(String height, String weight) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// *** Gender Link Click Event ***
		genderLinkClick.click();
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Ethnic Group Link Click Event ***
		Thread.sleep(1000);
		ethnicLinkClick.click();
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** PostCode Link Click Event ***
		Thread.sleep(1000);
		postcodeLinkClick.click();
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Cardiovascular Link Click Event ***
		Thread.sleep(1000);
		cardiovascularLinkClick.click();
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Height and Weight Switch to Metric Link Click Event ***
		List<WebElement> list_ht_wt = driver.findElements(By.xpath("//a[text()='Switch to metric']"));

		if (list_ht_wt.get(0) != null) {
			//list_ht_wt.get(0).click();
			js.executeScript("arguments[0].click();", list_ht_wt.get(0));
			height_cm.clear();
			height_cm.sendKeys(height);
		}

		if (list_ht_wt.get(1) != null) {
			list_ht_wt.get(1).click();
			weight_kg.clear();
			weight_kg.sendKeys(weight);
		}

		// *** Rheumatoid arthritis Link Click Event ***
		arthritisLinkClick.click();
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Chronic Kidney Disease Link Click Event ***
		//kidneyLinkClick.click();
		js.executeScript("arguments[0].click();", kidneyLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Atrial Fibrillation Link Click Event ***
		js.executeScript("arguments[0].click();", atrialLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** What does this mean Link Click Event ***
		js.executeScript("arguments[0].click();", meanLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** Cholesterol Information Link Click Event ***
		js.executeScript("arguments[0].click();", chol_infoLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** BP Information Link Click Event ***
		js.executeScript("arguments[0].click();", bp_infoLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		// *** BP Treatment Link Click Event ***
		js.executeScript("arguments[0].click();", bpt_infoLinkClick);
		js.executeScript("arguments[0].click();", closeLinkDialog);

		return new ResultPage();

	}
}
