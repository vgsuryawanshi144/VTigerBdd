package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LeadsPage extends SeleniumUtility {
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#Leads_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addLeads;
	
	@FindBy(css = "#Leads_basicAction_LBL_IMPORT")
	private WebElement importsLeads;
	
	@FindBy(css = "td > div > a:nth-child(1)")
	private WebElement createLeads;
	
	@FindBy(css = "#mCSB_8_container > ul:nth-child(2) > li")
	private WebElement moveToLeadsPage;

	public WebElement getAddLeads() {
		return addLeads;
	}

	public WebElement getImportsLeads() {
		return importsLeads;
	}

	public WebElement getCreateLeads() {
		return createLeads;
	}

	public WebElement getMoveToLeadsPage() {
		return moveToLeadsPage;
	}

	public void addLead() {
		clickOnElement(addLeads);
	}
	
	public void createLead() {
		clickOnElement(createLeads);
	}
	public void importLeads() {
		clickOnElement(importsLeads);
	}
}
