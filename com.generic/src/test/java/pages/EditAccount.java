package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccount {
	WebDriver driver;
	
	public EditAccount(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[text()='Edit Account Form']") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='accountno']") WebElement accountNo;
	@FindBy(xpath="//*[@name='AccSubmit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='res']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='home']") WebElement home;
	
	public void inputAccNo(String accNo) {
		accountNo.sendKeys(accNo);
	}
	
	public boolean verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Edit Account Form")) {
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
