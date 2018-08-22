package HA_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HA_Util.HA_BaseClass;

public class TermsAndConditionsPage extends HA_BaseClass {

	@FindBy (linkText="terms and conditions")
	WebElement tc_LinkClick;
	
	public TermsAndConditionsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ResultPage tc_LinkClick() throws InterruptedException {
		int frameSize= driver.findElements(By.tagName("iframe")).size();
		for(int i=0;i<frameSize;i++) {
			driver.switchTo().frame(i);
			Thread.sleep(2000);
			tc_LinkClick.click();
		}						
		return new ResultPage();
	}
}
