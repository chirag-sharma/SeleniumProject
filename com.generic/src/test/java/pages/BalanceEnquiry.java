package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BalanceEnquiry {
	WebDriver driver;
	
	public BalanceEnquiry(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="Balance Enquiry Form") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='accountno']") WebElement AccountNo;
	@FindBy(xpath="//*[@name='AccSubmit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='res']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='home']") WebElement home;
	@FindBy(xpath="//*[contains(text(),'Balance Details for Account')]") WebElement successMessage;
	
	public boolean func_verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Balance Enquiry Form")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	
	public boolean func_verifyMessage() {
		if(!successMessage.getText().contains("Balance Details for Account")) {
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
