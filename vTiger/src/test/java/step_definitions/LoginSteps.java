package step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webpages.LoginPage;

public class LoginSteps extends SeleniumUtility {
	WebDriver driver;
	LoginPage loginPage;

	@Given("user in on VTiger login page")
	public void user_in_on_v_tiger_login_page() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}

	@When("user enters username and password as password in password field")
	public void user_enters_username_and_password_as_password_in_password_field() {
		loginPage.loginToVTiger("admin", "admin");
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		loginPage.clickOnLoginToMoveForword();
	}

	@Then("verify HomePage title")
	public void verify_home_page_title() {
		String expectedTitle = "Dashboard";
		String actualTitle = driver.getTitle();
		Assert.assertTrue(expectedTitle.equals(actualTitle), "Your are right page");
	}

	@And("close the browser")
	public void close_the_browser() {
		tearDown();
	}

}
