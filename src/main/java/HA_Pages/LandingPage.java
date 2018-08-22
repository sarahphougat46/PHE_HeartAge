package HA_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HA_Util.HA_BaseClass;

public class LandingPage extends HA_BaseClass	 {
	
	@FindBy (id="start")
	WebElement clickStart;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
		public FillFormSectionOnePage startButtonClick() throws InterruptedException {
			int frameSize= driver.findElements(By.tagName("iframe")).size();
			for(int i=0;i<frameSize;i++) {
				driver.switchTo().frame(i);
				Thread.sleep(2000);
				clickStart.click();
			}						
			return new FillFormSectionOnePage();
		}
}


