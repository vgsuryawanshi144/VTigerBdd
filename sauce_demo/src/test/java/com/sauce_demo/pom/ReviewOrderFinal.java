package com.sauce_demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce_demo.utilities.BaseUtility;

public class ReviewOrderFinal extends BaseUtility {

	public ReviewOrderFinal(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "finish")
	private WebElement finishButton;
	
	@FindBy(css = "btn.btn_secondary.back btn_medium cart_cancel_link")
	private WebElement cancelButton;
	
	public WebElement getFinishButton() {
		return finishButton;
	}
	public void setFinishButton(WebElement finishButton) {
		this.finishButton = finishButton;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	public void setCancelButton(WebElement cancelButton) {
		this.cancelButton = cancelButton;
	}

	public void finshShopping() {
		clickOnElement(finishButton);
	}
	public void cancelShopping() {
		clickOnElement(cancelButton);
	}
}
