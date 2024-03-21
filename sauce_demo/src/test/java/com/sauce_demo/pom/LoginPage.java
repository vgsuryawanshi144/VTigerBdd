package com.sauce_demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce_demo.utilities.BaseUtility;

public class LoginPage extends BaseUtility {
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(id = "user-name")
	private WebElement userNameField;

	@FindBy(id = "password")
	private WebElement passwordField;
	
	@FindBy(id = "login-button")
	private WebElement loginButton;

	public WebElement getUserName() {
		return userNameField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	public void loginToSwagLab(String userName, String password) {
		typeInput(userNameField, userName);
		typeInput(passwordField, password);
		clickOnElement(loginButton);
	}
	
}
