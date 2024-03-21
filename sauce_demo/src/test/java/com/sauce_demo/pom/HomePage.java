package com.sauce_demo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce_demo.utilities.BaseUtility;

public class HomePage extends BaseUtility {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "react-burger-menu-btn")
	private WebElement mainMenuButton;

	@FindBy(linkText = "All Items")
	private WebElement allItemsFields;

	@FindBy(linkText = "About")
	private WebElement aboutField;

	@FindBy(linkText = "Logout")
	private WebElement logoutField;

	@FindBy(linkText = "Reset App State")
	private WebElement resetAppStateField;

	@FindBy(id = "react-burger-cross-btn")
	private WebElement closeMenuButton;

	public WebElement getMainMenuButton() {
		return mainMenuButton;
	}

	public WebElement getAllItemsFields() {
		return allItemsFields;
	}

	public WebElement getAboutField() {
		return aboutField;
	}

	public WebElement getLogoutField() {
		return logoutField;
	}

	public WebElement getResetAppStateField() {
		return resetAppStateField;
	}
	
	public void logoutFromApp() {
		clickOnElement(mainMenuButton);
		clickOnElement(logoutField);
	}
}
