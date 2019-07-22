package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentTest;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import utility.Reports;

public class BaseClass {
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		Reports.intiateReport("Regression");
		//
		driver = BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().getConfigProperty("url"));
	}
	
	
	@AfterTest
	public void tearDown() {
		Reports.createHTMLReport();
		BrowserFactory.closeBrowser(driver);
	
	}

}
