package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Deposit {
	WebDriver driver;
	
	public Deposit(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[text()='Amount Deposit Form']") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='accountno']") WebElement AccountNo;
	@FindBy(xpath="//*[@name='balance']") WebElement amount;
	@FindBy(xpath="//*[@name='desc']") WebElement description;
	@FindBy(xpath="//*[@name='AccSubmit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='res']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='home']") WebElement home;
	@FindBy(xpath="//*[contains(text(),'Transaction details of Deposit for Account')]") WebElement successMessage;
	
	public void inputDescription(String descr) {
		description.sendKeys(descr);
	}
	
	public void inputAmount(String paisa) {
		amount.sendKeys(paisa);
	}
	
	public void inputAccNo(String accNo) {
		AccountNo.sendKeys(accNo);
	}
	
	
	public boolean func_verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Amount Deposit Form")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	
	public boolean func_verifyMessage() {
		if(!successMessage.getText().contains("Transaction details of Deposit for Account")) {
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
