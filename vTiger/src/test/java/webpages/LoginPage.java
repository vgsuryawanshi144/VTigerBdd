package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='username']")
	private WebElement usernameField;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;

	@FindBy(css = "#loginFormDiv > form > div:nth-child(6) > button")
	private WebElement loginButton;

	@FindBy(css = "#loginFormDiv > form > div:nth-child(6) > a")
	private WebElement forgotPassLink;

	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPassLink() {
		return forgotPassLink;
	}

	public void loginToVTiger(String uname, String password) {
		typeInput(usernameField, uname);
		typeInput(passwordField, password);
	}
	
	public void clickOnLoginToMoveForword() {
		clickOnElement(loginButton);
	}
	
	public void forgotPassword() {
		clickOnElement(forgotPassLink);
	}

}
