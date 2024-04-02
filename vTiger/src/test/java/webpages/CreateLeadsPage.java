package webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class CreateLeadsPage extends SeleniumUtility {
	public CreateLeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Leads entities
	@FindBy(id = "s2id_autogen1")
	private WebElement nameConviction;

	@FindBy(css = "#Leads_editView_fieldName_firstname")
	private WebElement firstNameFields;

	@FindBy(css = "#Leads_editView_fieldName_lastname")
	private WebElement lastNameFields;

	@FindBy(css = "#Leads_editView_fieldName_phone")
	private WebElement primaryPhoneFields;

	@FindBy(css = "#Leads_editView_fieldName_mobile")
	private WebElement MobileNumberField;

	@FindBy(css = "#Leads_editView_fieldName_company")
	private WebElement companyField;

	@FindBy(css = "#Leads_editView_fieldName_designation")
	private WebElement designationField;

	@FindBy(css = "#s2id_autogen3 > a")
	private WebElement leadSourcefield;

	@FindBy(css = "#s2id_autogen4_search")
	private WebElement leadSourceDropDown;

	@FindBy(css = "#s2id_autogen6_search")
	private WebElement industryDropDown;

	@FindBy(css = "#s2id_autogen8_search")
	private WebElement leadStatusDropdown;

	@FindBy(css = "#s2id_autogen10_search")
	private WebElement ratingDropDown;

	@FindBy(css = "#s2id_autogen12_search")
	private WebElement assignedToDropDown;

	@FindBy(css = "#Leads_editView_fieldName_emailoptout")
	private WebElement emailOptOutCheckBox;

	@FindBy(css = "#Leads_editView_fieldName_fax")
	private WebElement faxField;

	@FindBy(css = "#Leads_editView_fieldName_email)")
	private WebElement primarayMailFields;

	@FindBy(css = "#Leads_editView_fieldName_website")
	private WebElement websiteField;

	@FindBy(css = "#Leads_editView_fieldName_annualrevenue")
	private WebElement anualRevenueFields;

	@FindBy(css = "#Leads_editView_fieldName_noofemployees")
	private WebElement numberOfEmpField;

	@FindBy(css = "#Leads_editView_fieldName_secondaryemail")
	private WebElement secondaryEmail;

	// Address Details Entities
	@FindBy(css = "#Leads_editView_fieldName_lane")
	private WebElement addressStreet;

	@FindBy(css = "#Leads_editView_fieldName_pobox")
	private WebElement poBoxField;

	@FindBy(css = "#Leads_editView_fieldName_code")
	private WebElement postalCodeField;

	@FindBy(css = "#Leads_editView_fieldName_country")
	private WebElement countryField;

	@FindBy(css = "#Leads_editView_fieldName_city")
	private WebElement cityField;

	@FindBy(css = "#Leads_editView_fieldName_state")
	private WebElement stateField;

	@FindBy(css = "#Leads_editView_fieldName_description")
	private WebElement descriptionField;

	@FindBy(css = "#EditView > div.modal-overlay-footer.clearfix > div > div > button")
	private WebElement saveButton;

	@FindBy(css = "#EditView > div.modal-overlay-footer.clearfix > div > div > a")
	private WebElement cancelButton;

	public WebElement getNameConviction() {
		return nameConviction;
	}

	public WebElement getFirstNameFields() {
		return firstNameFields;
	}

	public WebElement getLastNameFields() {
		return lastNameFields;
	}

	public WebElement getPrimaryPhoneFields() {
		return primaryPhoneFields;
	}

	public WebElement getMobileNumberField() {
		return MobileNumberField;
	}

	public WebElement getCompanyField() {
		return companyField;
	}

	public WebElement getDesignationField() {
		return designationField;
	}

	public WebElement getLeadSourceDropDown() {
		return leadSourceDropDown;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	public WebElement getLeadStatusDropdown() {
		return leadStatusDropdown;
	}

	public WebElement getRatingDropDown() {
		return ratingDropDown;
	}

	public WebElement getAssignedToDropDown() {
		return assignedToDropDown;
	}

	public WebElement getEmailOptOutCheckBox() {
		return emailOptOutCheckBox;
	}

	public WebElement getFaxField() {
		return faxField;
	}

	public WebElement getPrimarayMailFields() {
		return primarayMailFields;
	}

	public WebElement getWebsiteField() {
		return websiteField;
	}

	public WebElement getAnualRevenueFields() {
		return anualRevenueFields;
	}

	public WebElement getNumberOfEmpField() {
		return numberOfEmpField;
	}

	public WebElement getSecondaryEmail() {
		return secondaryEmail;
	}

	public WebElement getAddressStreet() {
		return addressStreet;
	}

	public WebElement getPoBoxField() {
		return poBoxField;
	}

	public WebElement getPostalCodeField() {
		return postalCodeField;
	}

	public WebElement getCountryField() {
		return countryField;
	}

	public WebElement getCityField() {
		return cityField;
	}

	public WebElement getStateField() {
		return stateField;
	}

	public WebElement getDescriptionField() {
		return descriptionField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public void setConvications(String text) {
		Select dropdown = new Select(nameConviction);
		dropdown.selectByVisibleText(text);
	}

	public void setName(String fName, String lName) {
		typeInput(firstNameFields, fName);
		typeInput(lastNameFields, lName);
	}

	public void addMobileNumber(String primaryNo, String MoNumber) {
		typeInput(primaryPhoneFields, primaryNo);
		typeInput(MobileNumberField, MoNumber);
	}

	public void addCompanyAndDesignation(String company, String designation) {
		typeInput(companyField, company);
		typeInput(designationField, designation);
	}

	public void addFaxWebsiteAndEmail(String fax, String mail, String website) {
		typeInput(faxField, fax);
		typeInput(primarayMailFields, mail);
		typeInput(websiteField, website);
	}

	public void selectLeadSource(String leadSourse) {
		clickOnElement(leadSourcefield);
		leadSourceDropDown.sendKeys(leadSourse);
		leadSourceDropDown.sendKeys(Keys.ENTER);
//		typeInput(MobileNumberField, filePath);
//		Select dropdown = new Select(leadSourceDropDown);
//		dropdown.selectByIndex(n);
	}

	public void selectIndustryType(String indusrty) {
		driver.findElement(By.cssSelector("#s2id_autogen5")).click();
		typeInput(industryDropDown, indusrty);
		industryDropDown.sendKeys(Keys.ENTER);
	}

	public void leadStatus(String status) {
		driver.findElement(By.cssSelector("#s2id_autogen7 > a")).click();
		typeInput(leadStatusDropdown, status);
		leadStatusDropdown.sendKeys(Keys.ENTER);
	}

	public void addRating(String rating) {
		driver.findElement(By.cssSelector("#s2id_autogen9 > a")).click();
		typeInput(ratingDropDown, rating);
		ratingDropDown.sendKeys(Keys.ENTER);
	}

	public void assignedLead(String assign) {
		driver.findElement(By.cssSelector("#s2id_autogen11 > a")).click();
		assignedToDropDown.sendKeys(assign);
		assignedToDropDown.sendKeys(Keys.ENTER);
	}

	public void setAddressDetails(String street, String poBox, String postCode, String city, String country,
			String state) {
		typeInput(addressStreet, street);
		typeInput(poBoxField, poBox);
		typeInput(postalCodeField, postCode);
		typeInput(cityField, city);
		typeInput(countryField, country);
		typeInput(stateField, state);
	}

	public void setDescription(String description) {
		typeInput(descriptionField, description);
	}
}
