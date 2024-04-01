package web_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtilities;

public class PersonalDetailsPage extends SeleniumUtilities {
	public PersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div > div.oxd-table-body > div > div > div:nth-child(9) > div > button:nth-child(2) > i")
	private WebElement editButton;
	// Job Link
	@FindBy(xpath = "//a[text()='Job']")
	private WebElement jobTab;

	@FindBy(css = "form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div > div.oxd-select-text-input")
	private WebElement jobListField;

	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	private WebElement middleNameField;

	@FindBy(css = " div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div.oxd-form-actions > button")
	private WebElement personalDetailsSave;

	@FindBy(linkText = "Employee List")
	private WebElement empListClick;

	@FindBy(css = "div.oxd-form-actions > button")
	private WebElement saveJob;

	// Job Title Dropdown Elements
	@FindBy(css = "form > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(2) > div > div")
	private List<WebElement> listOfJobs;

	@FindBy(css = "ul > li.oxd-topbar-body-nav-tab.--visited")
	private WebElement returnToEpList;

	public WebElement getJobTab() {
		return jobTab;
	}

	public WebElement getEditButton() {
		return editButton;
	}

	public WebElement getJobListField() {
		return jobListField;
	}

	public WebElement getSaveJob() {
		return saveJob;
	}

	public List<WebElement> getListOfJobs() {
		return listOfJobs;
	}

	// Function: Update PIM
	public void updateEmp(String middleName) {
		clickOnElement(editButton);
		clickOnElement(jobTab);
		clickOnElement(jobListField);
		typeInput(middleNameField, middleName);
		clickOnElement(personalDetailsSave);
		clickOnElement(empListClick);

	}
	
	public void backToSearchPage() {
		clickOnElement(returnToEpList);
	}
}
