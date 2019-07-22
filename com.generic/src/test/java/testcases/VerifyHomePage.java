package testcases;

//import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import factory.DataProviderFactory;
import pages.LoginPage;
import utility.Reports;


public class VerifyHomePage extends BaseClass {
	
	@Test
	public void verifyTitle() {
		logger = Reports.generateReport("VerifyHomePage");
		String testName= "VerifyHomePage.verifyTitle";
		
		Reports.logs(driver, "info", "Start Test", "Step1");
		LoginPage login =PageFactory.initElements(driver, LoginPage.class);
		
		
		Reports.logs(driver, "info", "Input UserName", "Step2");
		login.inputUserId(DataProviderFactory.getExcel().getData("Sheet1", testName, "UserName"));
		Reports.logs(driver, "Pass", "Valid Username entered", "Step3");
		login.inputPassword(DataProviderFactory.getExcel().getData("Sheet1", testName, "Password"));
		Reports.logs(driver, "Pass", "Input Password", "Step4");
		login.clickLogin();
		Reports.logs(driver, "Pass", "Click Login", "Step5");
	}
	
	


}
