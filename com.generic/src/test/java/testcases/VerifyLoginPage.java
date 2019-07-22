package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.LoginPage;
import utility.CaptureScreenshot;
import utility.Reports;

public class VerifyLoginPage {
	
	ExtentTest logger;
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		Reports.intiateReport("Regression");
		logger = Reports.generateReport("VerifyLoginPage");
		
		driver = BrowserFactory.getBrowser("chrome");
		driver.get(DataProviderFactory.getConfig().getConfigProperty("url"));
	}
	@Test
	public void verifyTitle() {
		
		String className= "VerifyLoginPage.verifyTitle";
		logger.log(Status.INFO, className);
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		//fetch Login Title
		String title = login.getTitle();
		
		Assert.assertTrue(title.contains("Guru"));
		//System.out.println("Web Title of current page is: "+title);
		logger.log(Status.INFO,  "Verifying Title of LoginPage");
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS); //why not waiting
		
		
	}
	@Test
	public void Login() throws IOException {
		String methodName= "VerifyLoginPage.Login";
		
		LoginPage login =PageFactory.initElements(driver, LoginPage.class);
		//yaha par har step ka status kaise pata kare and then uske hisaab se pass ,fail status kaise de
		
		//logger.log(Status.INFO, );
				//(CaptureScreenshot.func_captureScreenshot(driver, "Srep")));
		
		logger.fail("Maa chdi padi jai").addScreenCaptureFromPath(CaptureScreenshot.func_captureScreenshot(driver, "step"));
		//addScreenCaptureFromBase64String();
		//logger.log(Status.INFO, );
		login.inputUserId(DataProviderFactory.getExcel().getData("Sheet1", methodName, "UserName"));
		
		logger.log(Status.PASS, "Input UserName");
		login.inputPassword(DataProviderFactory.getExcel().getData("Sheet1", methodName, "Password"));
		
		logger.log(Status.PASS, "Input Password");
		login.clickLogin();
	}
	@AfterTest
	public void tearDown() {
		Reports.createHTMLReport();
		BrowserFactory.closeBrowser(driver);
	}

}
