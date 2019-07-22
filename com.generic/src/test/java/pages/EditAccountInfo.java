package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditAccountInfo {
	WebDriver driver;
	
	public EditAccountInfo(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[text()='Edit Account Entry Form']") WebElement verifyHeading;
	@FindBy(xpath="//*[@name='a_type']") WebElement selAccType;
	@FindBy(xpath="//*[@name='AccSubmit']") WebElement submitBtn;
	@FindBy(xpath="//*[@name='AccReset']") WebElement resetBtn;
	@FindBy(xpath="//*[text()='home']") WebElement home;
	@FindBy(xpath="//*[text()='Account details updated Successfully!!!']") WebElement SuccessMessage;
	
	
	
	public boolean verifySuccessMessage() {
		if(!SuccessMessage.getText().equalsIgnoreCase("Account details updated Successfully!!!")) {
			System.out.println("Verification Not Successful !!!");
			return false;
		}
		else
			return true;
			
	}
	public void selectAccount(String type) {
		Select sel =new Select(selAccType);
		sel.selectByVisibleText(type);
	}
	
	
	public boolean verifyHeading() {
		if(!verifyHeading.getText().equalsIgnoreCase("Edit Account Entry Form")) {
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
