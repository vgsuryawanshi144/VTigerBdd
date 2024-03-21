package com.sauce_demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce_demo.utilities.BaseUtility;

public class CheckoutAddress extends BaseUtility {

	public CheckoutAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first-name")
	private WebElement firstName;

	@FindBy(id = "last-name")
	private WebElement lastName;

	@FindBy(id = "postal-code")
	private WebElement zipCode;

	@FindBy(id = "cancel")
	private WebElement canelButton;

	@FindBy(id = "continue")
	private WebElement CheckoutAddress;

	public void cancelOrder() {
		clickOnElement(canelButton);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getCanelButton() {
		return canelButton;
	}

	public WebElement getCheckoutAddress() {
		return CheckoutAddress;
	}

	public void continueWithAddress(String uName, String pass, String postCode) {
		typeInput(firstName, uName);
		typeInput(lastName, pass);
		typeInput(zipCode, postCode);
		clickOnElement(CheckoutAddress);
	}

}
