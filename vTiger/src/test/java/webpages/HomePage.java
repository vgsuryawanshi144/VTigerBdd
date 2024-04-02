package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class HomePage extends SeleniumUtility {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div > a > span.fa.fa-user")
	private WebElement profileMenu;

	@FindBy(linkText = "Sign Out")
	private WebElement logoutButton;

	@FindBy(css = "div > a > img")
	private WebElement logoToRedirectHome;

	private WebElement taskManagementButton;
	private WebElement reports;

	@FindBy(css = "#search-links-container > div > input")
	private WebElement searchBox;

	@FindBy(css = "#appnavigator > div > span")
	private WebElement menuOption;

	@FindBy(css = "#app-menu > div > div.app-list.row > div.menu-item.app-item.dropdown-toggle > div > span.app-name.textOverflowEllipsis")
	private WebElement dashBoard;

	@FindBy(css = "#MARKETING_modules_dropdownMenu > div")
	private WebElement marketing;

	private WebElement marketingCampaigns;

	@FindBy(css = "#mCSB_71_container > li:nth-child(2) > a")
	private WebElement marketingLeads;

	private WebElement marketingContact;
	private WebElement marketingOrgnizations;

	private WebElement sales;
	private WebElement salesOperthunities;
	private WebElement salesQuotes;
	private WebElement salesProducts;
	private WebElement salesServices;
	private WebElement salessmsManager;
	private WebElement salesContacts;
	private WebElement salesOrgnizations;

	private WebElement inventory;
	private WebElement inventoryProducts;
	private WebElement inventoryServoces;
	private WebElement inventoryPriceBooks;
	private WebElement inventoryInvoices;
	private WebElement inventorySalesOrder;
	private WebElement inventoryPurchaseOrder;
	private WebElement inventoryVendors;
	private WebElement inventoryContacts;
	private WebElement inventoryOrgnizations;

	private WebElement support;
	private WebElement supportTickets;
	private WebElement supportFAQ;
	private WebElement supportServiceContracts;
	private WebElement supportAssets;
	private WebElement supportSMSNotifier;
	private WebElement supportContacts;
	private WebElement supportOrgnizations;

	private WebElement project;
	private WebElement projectOfProjects;
	private WebElement projectPojectsTask;
	private WebElement projectProjectMilestones;
	private WebElement projectContacts;
	private WebElement projectOrgnizations;

	private WebElement tools;
	private WebElement toolsEmailTemplets;
	private WebElement toolsRss;
	private WebElement toolsOutSites;
	private WebElement toolsRecycleBin;
	private WebElement toolsPBXManager;

	public WebElement getProfileMenu() {
		return profileMenu;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getLogoToRedirectHome() {
		return logoToRedirectHome;
	}

	public WebElement getTaskManagementButton() {
		return taskManagementButton;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getMenuOption() {
		return menuOption;
	}

	public WebElement getDashBoard() {
		return dashBoard;
	}

	public WebElement getMarketing() {
		return marketing;
	}

	public WebElement getMarketingCampaigns() {
		return marketingCampaigns;
	}

	public WebElement getMarketingLeads() {
		return marketingLeads;
	}

	public WebElement getMarketingContact() {
		return marketingContact;
	}

	public WebElement getMarketingOrgnizations() {
		return marketingOrgnizations;
	}

	public WebElement getSales() {
		return sales;
	}

	public WebElement getSalesOperthunities() {
		return salesOperthunities;
	}

	public WebElement getSalesQuotes() {
		return salesQuotes;
	}

	public WebElement getSalesProducts() {
		return salesProducts;
	}

	public WebElement getSalesServices() {
		return salesServices;
	}

	public WebElement getSalessmsManager() {
		return salessmsManager;
	}

	public WebElement getSalesContacts() {
		return salesContacts;
	}

	public WebElement getSalesOrgnizations() {
		return salesOrgnizations;
	}

	public WebElement getInventory() {
		return inventory;
	}

	public WebElement getInventoryProducts() {
		return inventoryProducts;
	}

	public WebElement getInventoryServoces() {
		return inventoryServoces;
	}

	public WebElement getInventoryPriceBooks() {
		return inventoryPriceBooks;
	}

	public WebElement getInventoryInvoices() {
		return inventoryInvoices;
	}

	public WebElement getInventorySalesOrder() {
		return inventorySalesOrder;
	}

	public WebElement getInventoryPurchaseOrder() {
		return inventoryPurchaseOrder;
	}

	public WebElement getInventoryVendors() {
		return inventoryVendors;
	}

	public WebElement getInventoryContacts() {
		return inventoryContacts;
	}

	public WebElement getInventoryOrgnizations() {
		return inventoryOrgnizations;
	}

	public WebElement getSupport() {
		return support;
	}

	public WebElement getSupportTickets() {
		return supportTickets;
	}

	public WebElement getSupportFAQ() {
		return supportFAQ;
	}

	public WebElement getSupportServiceContracts() {
		return supportServiceContracts;
	}

	public WebElement getSupportAssets() {
		return supportAssets;
	}

	public WebElement getSupportSMSNotifier() {
		return supportSMSNotifier;
	}

	public WebElement getSupportContacts() {
		return supportContacts;
	}

	public WebElement getSupportOrgnizations() {
		return supportOrgnizations;
	}

	public WebElement getProject() {
		return project;
	}

	public WebElement getProjectOfProjects() {
		return projectOfProjects;
	}

	public WebElement getProjectPojectsTask() {
		return projectPojectsTask;
	}

	public WebElement getProjectProjectMilestones() {
		return projectProjectMilestones;
	}

	public WebElement getProjectContacts() {
		return projectContacts;
	}

	public WebElement getProjectOrgnizations() {
		return projectOrgnizations;
	}

	public WebElement getTools() {
		return tools;
	}

	public WebElement getToolsEmailTemplets() {
		return toolsEmailTemplets;
	}

	public WebElement getToolsRss() {
		return toolsRss;
	}

	public WebElement getToolsOutSites() {
		return toolsOutSites;
	}

	public WebElement getToolsRecycleBin() {
		return toolsRecycleBin;
	}

	public WebElement getToolsPBXManager() {
		return toolsPBXManager;
	}

	public void moveTocreateLead() {
		clickOnElement(menuOption);
		clickOnElement(marketing);
		clickOnElement(marketingLeads);

	}
	
	public void logoutFromApp() {
		clickOnElement(profileMenu);
		clickOnElement(logoutButton);
	}
}
