package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[@href='addcustomerpage.php']") WebElement NewCustomer;
	@FindBy(xpath="//a[@href='Managerhomepage.php']") WebElement ManagerHomePage;
	@FindBy(xpath="//a[text()='Edit Customer']") WebElement EditCustomer;
	@FindBy(xpath="//a[text()='New Account']") WebElement NewAccount;
	@FindBy(xpath="//a[text()='Delete Customer']") WebElement DeleteCustomer;
	@FindBy(linkText="Edit Account") WebElement EditAccount;
	@FindBy(xpath="//a[text()='Delete Account']") WebElement DeleteAccount;
	@FindBy(xpath="//a[text()='Deposit']") WebElement Deposit;
	@FindBy(xpath="//a[text()='Withdrawal']") WebElement Withdrawal;
	@FindBy(xpath="//a[text()='Fund Transfer']") WebElement FundTransfer;
	@FindBy(xpath="//a[text()='Change Password']") WebElement ChangePassword;
	@FindBy(xpath="//a[text()='Balance Enquiry']") WebElement BalanceEnquiry;
	@FindBy(xpath="//a[text()='Mini Statement']") WebElement MiniStatement;
	@FindBy(xpath="//a[text()='Customised Statement']") WebElement CustomisedStatement;
	@FindBy(xpath="//a[text()='Log out']") WebElement LogOut;
	
	public void clickNewCustomer() {
		NewCustomer.click();
	}
	public void clickManager() {
		ManagerHomePage.click();
	}
	public boolean verifyTitle(String str) {
		String title = driver.getTitle()+"rt";
		System.out.println("Title of the page is: "+title);
		if(!str.equalsIgnoreCase(title)) {
			return false;
		}
		return true;
		
	}
	public void clickEditCustomer() {
		EditCustomer.click();
	}
	
	public void clickNewAccount() {
		NewAccount.click();
	}
	
	public void clickDeleteCustomer() {
		DeleteCustomer.click();
	}
	
	public void clickEditAccount() {
		EditAccount.click();
	}
	
	public void clickDeleteAccount() {
		DeleteAccount.click();
	}
	
	public void clickDeposit() {
		Deposit.click();
	}
	
	public void clickWithdrawal() {
		Withdrawal.click();
	}
	
	public void clickFundTransfer() {
		FundTransfer.click();
	}
	
	public void clickChangePassword() {
		ChangePassword.click();
	}
	
	public void clickBalanceEnquiry() {
		BalanceEnquiry.click();
	}
	
	public void clickMiniStatement() {
		MiniStatement.click();
	}
	
	public void clickCustomisedStatment() {
		CustomisedStatement.click();
	}
	
	public void clickLogOut() {
		LogOut.click();
	}
}
