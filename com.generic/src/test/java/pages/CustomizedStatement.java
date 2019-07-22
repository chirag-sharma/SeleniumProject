package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomizedStatement {
	WebDriver driver;
	
	public CustomizedStatement(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[text()='Customized Statement Form']") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='AccSubmit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='res']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='home']") WebElement home;
	@FindBy(xpath="//*[@name='accountno']") WebElement AccountNo;
	@FindBy(xpath="//*[@name='fdate']") WebElement fromDate;
	@FindBy(xpath="//*[@name='tdate']") WebElement toDate;
	@FindBy(xpath="//*[@name='amountlowerlimit']") WebElement LowerAmount;
	@FindBy(xpath="//*[@name='numtransaction']") WebElement NumberTxn;
	@FindBy(xpath="//*[contains(text(),'Transaction Details for Account No:')]") WebElement successMessage;

	public boolean func_verifyMessage() {
		if(!successMessage.getText().contains("Transaction Details for Account No:")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	public void inputFromDate(String date) {
		fromDate.sendKeys(date);
	}
	
	public void inputToDate(String tdate) {
		toDate.sendKeys(tdate);
	}
	
	public void inputLowerAmount(String lamount) {
		LowerAmount.sendKeys(lamount);
	}
	public void inputNumberTxn(String numbertxn) {
		NumberTxn.sendKeys(numbertxn);
	}
	
	
	public boolean func_verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Customized Statement Form")) {
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
