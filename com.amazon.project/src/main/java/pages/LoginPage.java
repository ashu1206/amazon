package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
//	@FindBy(xpath="//div//span[contains(text(),'Account & Lists')]")
//	WebElement account;
//	
//	@FindBy(xpath="//div//div[@id='nav-flyout-ya-signin']/a/span[contains(text(),'Sign in')]")
//	WebElement signIn;
	
	@FindBy(xpath="//div//a[contains(text(),'Sign in securely')]")
	WebElement signIn;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement conti;
	
	@FindBy(id="ap_password")
	WebElement passWord;
	
	@FindBy(id="signInSubmit")
	WebElement loginIn;
	
	
	public void clickSignIn() {
		
		signIn.click();
	}
	
	public void enterEmail(String mobile) {
		
		email.sendKeys(mobile);
	}
	
	public void clickOnContinue() {
		
		conti.click();
	}
	
	public void enterPassword(String password) {
		
		passWord.sendKeys(password);
	}
	
	public void clickOnLogin() {
		
		loginIn.click();
	}
	
	
	
	
	
	
	
	
	

}
