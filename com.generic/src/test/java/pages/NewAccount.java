package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {
	WebDriver driver;
	public NewAccount(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[text()='Add new account form']") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='cusid']") WebElement customerID;
	@FindBy(xpath="//*[@name='selaccount']") WebElement selectAcct;
	@FindBy(xpath="//*[@name='inideposit']") WebElement initDeposit;
	@FindBy(xpath="//*[@value='submit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='reset']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='home']") WebElement home;
	@FindBy(xpath="//*[text()='Account Generated Successfully!!!']") WebElement SuccessMessage;
	@FindBy(xpath="//*[text()='Continue']") WebElement continues;
	
	
	public boolean verifySuccessMessage() {
		if(!SuccessMessage.getText().equalsIgnoreCase("Account Generated Successfully!!!")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	
	public void clickContinue() {
		continues.click();
	}
	
	
	public boolean verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Add new account form")) {
			System.out.println("Verification Fail");
			return false;
		}
		else
			return true;
	}
	public void inputCustomerID(String custID) {
		customerID.sendKeys(custID);
	}
	
	public void selectAccount(String type) {
		Select sel =new Select(selectAcct);
		sel.selectByVisibleText(type);
	}
	
	public void inputInitialDeposit(String money) {
		initDeposit.sendKeys(money);
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
