package com.sauce_demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce_demo.utilities.BaseUtility;

public class ProductListingPage extends BaseUtility {
	public ProductListingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement productBagpack;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement productBikelight;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement productBoltTShirt;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement productFleeceJacket;

	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	private WebElement productOnesie;

	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement productRedTShirt;

	@FindBy(id = "shopping_cart_container")
	private WebElement cartButton;

	
	public WebElement getProductBagpack() {
		return productBagpack;
	}

	public WebElement getProductBikelight() {
		return productBikelight;
	}

	public WebElement getProductBoltTShirt() {
		return productBoltTShirt;
	}

	public WebElement getProductFleeceJacket() {
		return productFleeceJacket;
	}

	public WebElement getProductOnesie() {
		return productOnesie;
	}

	public WebElement getProductRedTShirt() {
		return productRedTShirt;
	}

	public WebElement getCartButton() {
		return cartButton;
	}

	public void addProductToCart() {
		clickOnElement(productBagpack);
		clickOnElement(productBoltTShirt);
		clickOnElement(cartButton);

	}
}
