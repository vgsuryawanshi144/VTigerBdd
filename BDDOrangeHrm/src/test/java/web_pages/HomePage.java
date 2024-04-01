package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtilities;

public class HomePage extends SeleniumUtilities {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".--active oxd-userdropdown")
	private WebElement profileMenu;

	@FindBy(linkText = "Logout")
	private WebElement logoutButton;

	@FindBy(css = "div.oxd-sidepanel-body > ul > li:nth-child(2) > a")
	private WebElement pimNavigation;

	public WebElement getProfileMenu() {
		return profileMenu;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getPimNavigation() {
		return pimNavigation;
	}

	public void logoutFromOHrm() {
		clickOnElement(profileMenu);
		clickOnElement(logoutButton);
	}

	public void navigatePIM() {
		clickOnElement(pimNavigation);
	}
}
