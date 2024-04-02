package step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.CreateLeadsPage;
import webpages.HomePage;
import webpages.LeadsPage;
import webpages.LoginPage;

public class AddLeadSteps extends SeleniumUtility{
	private WebDriver driver;
    private CreateLeadsPage createLeadsPage;
    private LoginPage loginPage;
    private HomePage homePage;
    private LeadsPage leadPage;

    @Given("I am on the create lead page")
    public void i_am_on_the_create_lead_page() {
    	loginPage.loginToVTiger("admin", "admin");
    	loginPage.clickOnLoginToMoveForword();
    	homePage.moveTocreateLead();
    	leadPage.createLead();
    }

    @When("I fill in lead details with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_fill_in_lead_details(String firstName, String lastName, String primaryPhone, String mobileNumber, String company, String designation, String leadSource, String industry, String leadStatus, String rating, String assignedTo, String fax, String email, String website, String addressStreet, String poBox, String postalCode, String country, String city, String state, String description) {
        createLeadsPage.setName(firstName, lastName);
        createLeadsPage.addMobileNumber(primaryPhone, mobileNumber);
        createLeadsPage.addCompanyAndDesignation(company, designation);
        createLeadsPage.selectLeadSource(leadSource);
        createLeadsPage.selectIndustryType(industry);
        createLeadsPage.leadStatus(leadStatus);
        createLeadsPage.addRating(rating);
        createLeadsPage.assignedLead(assignedTo);
        createLeadsPage.addFaxWebsiteAndEmail(fax, email, website);
        createLeadsPage.setAddressDetails(addressStreet, poBox, postalCode, country, city, state);
        createLeadsPage.setDescription(description);
    }

    @And("I save the lead")
    public void i_save_the_lead() {
        createLeadsPage.getSaveButton().click();
        setSleepTime(4000);
    }

    @Then("the lead should be successfully added")
    public void the_lead_should_be_successfully_added() {
        String expectedTitle = "Leads - Gaurav Suryawanshi";
        String actualTitle  = driver.getTitle();
        Assert.assertTrue(expectedTitle.contains(actualTitle), "Details Saved Successfuly");
    }
}