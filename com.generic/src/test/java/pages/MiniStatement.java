package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MiniStatement {
	WebDriver driver;
	public MiniStatement(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="Mini Statement Form") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='accountno']") WebElement AccountNo;
	@FindBy(xpath="//*[@name='AccSubmit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='res']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='home']") WebElement home;
	@FindBy(xpath="//*[contains(text(),'Last Five Transaction Details for Account No')]") WebElement successMessage;
	
	public boolean func_verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Balance Enquiry Form")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	
	public boolean func_verifyMessage() {
		if(!successMessage.getText().contains("Last Five Transaction Details for Account No")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	
	public void inputAccNo(String accNo) {
		AccountNo.sendKeys(accNo);
	}
	public void clickSubmit() {
		submitBtn.click();
	}
	
	public void clickReset() {
		resetBtn.click();
	}
	
	public void clickHome() {
		home.click();
	}
	
}
