package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerInfo {
	WebDriver driver;
	public EditCustomerInfo(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[text()='Edit Customer']") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='addr']") WebElement Address;
	@FindBy(xpath="//input[@name='city']") WebElement City;
	@FindBy(xpath="//input[@name='state']") WebElement State;
	@FindBy(xpath="//input[@name='pinno']") WebElement PinNo;
	@FindBy(xpath="//input[@name='telephoneno']") WebElement MobileNo;
	@FindBy(xpath="//input[@name='emailid']") WebElement EmailID;
	@FindBy(xpath="//*[@value='Submit']") WebElement Submit;
	@FindBy(xpath="//*[@value='Reset']") WebElement Reset;
	@FindBy(xpath="//*[text()='Customer details updated Successfully!!!']") WebElement successMessage;
	@FindBy(xpath="//*[text()='Home']") WebElement home;
	
	
	public void clickHome() {
		home.click();
	}
	
	public void clickReset() {
		Reset.click();
	}
	
	public void inputEmailId(String emailid) {
		EmailID.clear();
		EmailID.sendKeys(emailid);
	}
	public void inputMobileNo(String mobileNo) {
		MobileNo.clear();
		MobileNo.sendKeys(mobileNo);
	}
	public void inputPinNo(String pinno) {
		PinNo.clear();
		PinNo.sendKeys(pinno);
	}
	public void inputState(String state) {
		State.clear();
		State.sendKeys(state);
	}
	public void inputCity(String city) {
		City.clear();
		City.sendKeys(city);
	}
	
	public void inputAddress(String adrs) {
		Address.clear();
		Address.sendKeys(adrs);
	}
	
	public boolean verifyMessage() {
		if(!successMessage.getText().equalsIgnoreCase("Customer details updated Successfully!!!")) 
		{
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;	
	}
	

	public void clickSubmit() {
		Submit.click();
	}
	
	public boolean verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Edit Customer")) {
			System.out.println("Verification Fail");
			return false;
		}
		else
			return true;
	}
	

}
