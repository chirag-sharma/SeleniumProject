package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteCustomer {
	WebDriver driver;
	public DeleteCustomer(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[text()='Delete Customer Form'") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='cusid']") WebElement customerID;
	@FindBy(xpath="//*[@namr='AccSubmit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='res']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='Home']") WebElement home;
	
	public boolean verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Delete Customer Form")) {
			System.out.println("Verification Fail");
			return false;
		}
		else
			return true;
	}
	
	public void inputCustomerID(String custID) {
		customerID.sendKeys(custID);
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
