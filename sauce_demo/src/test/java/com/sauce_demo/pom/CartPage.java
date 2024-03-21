package com.sauce_demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce_demo.utilities.BaseUtility;

public class CartPage extends BaseUtility {
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "remove-sauce-labs-bike-light")
	private WebElement removeFirstProduct;

	@FindBy(id = "remove-sauce-labs-bolt-t-shirt")
	private WebElement removeLastProduct;

	@FindBy(id = "continue-shopping")
	private WebElement continueShopping;

	@FindBy(id = "checkout")
	private WebElement productcheckout;

	public WebElement getRemoveFirstProduct() {
		return removeFirstProduct;
	}

	public WebElement getRemoveLastProduct() {
		return removeLastProduct;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getProductcheckout() {
		return productcheckout;
	}

	public void proceedToCheckout() {
		clickOnElement(productcheckout);
	}
	public void proceedWithContinueShopping() {
		clickOnElement(continueShopping);
	}
}
