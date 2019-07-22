package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomer {
	WebDriver driver;
	public NewCustomer(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@name='name']") WebElement CustomerName;
	@FindBy(xpath="//*[@value='m']") WebElement GenderMale;
	@FindBy(xpath="//*[@value='f']") WebElement GenderFemale;
	@FindBy(xpath="//*[@id='dob']") WebElement DOB;
	@FindBy(xpath="//*[@name='addr']") WebElement Address;
	@FindBy(xpath="//input[@name='city']") WebElement City;
	@FindBy(xpath="//input[@name='state']") WebElement State;
	@FindBy(xpath="//input[@name='pinno']") WebElement PinNo;
	@FindBy(xpath="//input[@name='telephoneno']") WebElement MobileNo;
	@FindBy(xpath="//input[@name='emailid']") WebElement EmailID;
	@FindBy(xpath="//input[@name='password']") WebElement Password;
	@FindBy(xpath="//*[text()='Add New Customer']") WebElement Heading;
	@FindBy(xpath="//*[@value='Submit']") WebElement Submit;
	@FindBy(xpath="//*[@value='Reset']") WebElement Reset;
	@FindBy(xpath="//*[text()='Customer Registered Successfully!!!']") WebElement SuccessMessage;
	@FindBy(xpath="//*[text()='Continue']") WebElement continues;
	
	
	public void clickContinue() {
		continues.click();
	}
	public void clickSubmit() {
		Submit.click();
	}
	
	public boolean verifySuccessMessage() {
		if(!SuccessMessage.getText().equalsIgnoreCase("Customer Registered Successfully!!!")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	
	
	
	public void clickReset() {
		Reset.click();
	}
	public void inputPassword(String pswd) {
		Password.sendKeys(pswd);
	}
	public void inputEmailId(String emailid) {
		EmailID.sendKeys(emailid);
	}
	public void inputMobileNo(String mobileNo) {
		MobileNo.sendKeys(mobileNo);
	}
	public void inputPinNo(String pinno) {
		PinNo.sendKeys(pinno);
	}
	public void inputState(String state) {
		State.sendKeys(state);
	}
	public void inputCity(String city) {
		City.sendKeys(city);
	}
	
	public void inputAddress(String adrs) {
		Address.sendKeys(adrs);
	}
	
	public void inputDOB(String dob) {
		DOB.sendKeys(dob);
	}
	public void selectGender(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			GenderMale.click();
		}
		else {
			GenderFemale.click();
		}
	}
	
	public void inputCustomerName(String custName) {
		CustomerName.sendKeys(custName);
	}
	
	public boolean verifyPage() {
		String str=Heading.getText();
		if(!str.equalsIgnoreCase("Add New Customer")) {
			return false;
		}
		return true;
	}
	
	

}
