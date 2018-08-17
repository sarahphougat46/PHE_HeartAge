package HA_Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HA_BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public HA_BaseClass() {
		
		try {
		prop= new Properties();
		FileInputStream file = new FileInputStream("C:\\Automation\\BDD_PHE_HeartAge\\src\\main\\java\\HA_Config\\config.properties");
		prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();		
		}else if(browserName.equals("firefox")) {
			System.setProperty("", "");
			
		}	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));		
	}

}	
	