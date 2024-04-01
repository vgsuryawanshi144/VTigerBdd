package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtilities;

public class LoginPage extends SeleniumUtilities {
	WebDriver drievr;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement userNameField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	@FindBy(css = ".oxd-text.oxd-text--p.orangehrm-login-forgot-header")
	private WebElement forgotPwdLink;
	
	

	public WebElement getUserNameField() {
		return userNameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPwdLink() {
		return forgotPwdLink;
	}


	public void loginToOrangeHrm(String uname, String password) {
		typeInput(userNameField, uname);
		typeInput(passwordField, password);
		clickOnElement(loginButton);
	}

	public void forgotpassword() {
		clickOnElement(forgotPwdLink);
	}
}
