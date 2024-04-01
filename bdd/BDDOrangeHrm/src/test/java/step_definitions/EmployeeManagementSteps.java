package step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtilities;
import web_pages.AddEmployeePage;
import web_pages.EmployeeListPage;
import web_pages.HomePage;
import web_pages.LoginPage;
import web_pages.PersonalDetailsPage;

public class EmployeeManagementSteps extends SeleniumUtilities {

	WebDriver driver;
	AddEmployeePage addEmployeePage;
	EmployeeListPage employeeListPage;
	HomePage homePage;
	LoginPage loginPage;
	PersonalDetailsPage detailsPage;

	@Given("user logged in as an admin")
	public void userLoggedInAsAdmin() {
	driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage.loginToOrangeHrm("Admin", "admin123");
	}

	@And("user is on PIM Page")
	public void userOnPIMPage() {
		homePage.navigatePIM();
		String pimUriPart = "pim/viewEmployeeList";
		Assert.assertTrue(driver.getCurrentUrl().contains(pimUriPart), "You are on right page");
	}

	// add record
	@When("user choose to add a new employee")
	public void chooseToAddNewEmployee() {
		employeeListPage.navigateToAddEmp();
	}

	@And("user fill in the employee details:")
	public void fillEmployeeDetails() {
		addEmployeePage.createEmployee("Gaurav", "Suryawanshi", 12345);
	}

	@Then("user is on employees details page")
	public void userOnEmployeeDetailsPage() {
		String pimUriPart = "pim/viewEmployeeList";
		Assert.assertTrue(driver.getCurrentUrl().contains(pimUriPart), "You are on right page");
	}

	// update record
	@When("user choose to edit an existing employee record")
	public void chooseToEditExistingEmployeeRecord() {
		employeeListPage.searchEmployee("12345");
	}

	@Then("user should be redirected to the personal details section for that employee")
	public void redirectToPersonalDetailsSection() {
		
	}

	@And("user can update the employee personal details")
	public void updateEmployeePersonalDetails() {
		detailsPage.updateEmp("Gorakh");
	}

	@And("user save the changes")
	public void saveChanges() {
		addEmployeePage.saveEmpDetails();
	}

	@Then("the employee details should be updated successfully")
	public void verifyDetailsUpdatedSuccessfully() {
		// Implementation for verifying employee details updated successfully
	}

	// delete record
	@When("user choose to delete an existing employee record")
	public void chooseToDeleteExistingEmployeeRecord() {
		employeeListPage.deleteEmployee("12345");
	}
}
