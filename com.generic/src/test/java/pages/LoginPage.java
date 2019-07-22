package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//input[@name='uid']") WebElement userID;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//input[@name='btnLogin']") WebElement Loginbtn;
	@FindBy(xpath="//input[@name='btnReset']") WebElement Resetbtn;
	
	public void inputUserId(String userid) {
		userID.sendKeys(userid);
	}
	
	public void inputPassword(String pswd) {
		password.sendKeys(pswd);
	}
	
	public void clickLogin() {
		Loginbtn.click();
	}
	
	public void clickReset() {
		Resetbtn.click();
	}
	public String getTitle() {
		return driver.getTitle(); //  getTitle();
	}
}
