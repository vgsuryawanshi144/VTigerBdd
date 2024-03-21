package com.sauce_demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce_demo.utilities.BaseUtility;

public class CheckoutSuccess extends BaseUtility {

	public CheckoutSuccess(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "back-to-products")
	private WebElement backButton;

	@FindBy(css = ".complete-header")
	private WebElement msg;

	
	public WebElement getBackButton() {
		return backButton;
	}

	public WebElement getMsg() {
		return msg;
	}

	public String verifyMsg() {
		String msgValue = msg.getText();
		return msgValue;
	}
	
	public void goTOHome() {
		clickOnElement(backButton);	
	}
}
