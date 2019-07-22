package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FundTransfer {
	WebDriver driver;
	public FundTransfer(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="Fund transfer") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='payersaccount']") WebElement payersAccountNo;
	@FindBy(xpath="//*[@name='payeeaccount']") WebElement payeeAccountNo;
	@FindBy(xpath="//*[@name='ammount']") WebElement amount;
	@FindBy(xpath="//*[@name='desc']") WebElement description;
	@FindBy(xpath="//*[@name='AccSubmit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='res']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='home']") WebElement home;
	@FindBy(xpath="//*[contains(text(),'Fund Transafer Details for Account No')]") WebElement successMessage;
	
	
	public boolean func_verifyMessage() {
		if(!successMessage.getText().contains("Fund Transafer Details for Account No")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	public void inputDescription(String descr) {
		description.sendKeys(descr);
	}
	
	public void inputAmount(String paisa) {
		amount.sendKeys(paisa);
	}
	
	public void inputpayerAccNo(String accNo) {
		payersAccountNo.sendKeys(accNo);
	}
	
	public void inputpayeeAccNo(String accNos) {
		payeeAccountNo.sendKeys(accNos);
	}
	
	public boolean func_verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Fund transfer")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
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
