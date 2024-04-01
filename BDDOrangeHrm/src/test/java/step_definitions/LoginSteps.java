package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtilities;
import web_pages.LoginPage;

public class LoginSteps extends SeleniumUtilities {
	 WebDriver driver;
	    LoginPage loginPage;
	    String appUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	    @Given("user is on LoginPage")
	    public void user_is_on_login_page() {
	        driver = setUp("CHROME", appUrl);
	        loginPage = new LoginPage(driver);
	    }

	    @When("user enters valid username and password and clicks on LoginButton")
	    public void user_enters_valid_username_and_password_and_clicks_on_login_button() {
	        loginPage.loginToOrangeHrm("Admin", "admin123");
	    }

	    @Then("verify the title of the HomePage")
	    public void verify_the_title_of_the_home_page() {
	        String actualTitle = driver.getTitle();
	        String expectedTitle = "OrangeHRM";
	        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch: You are not on the home page.");
	    }

	    @And("verify the presence of Welcome message")
	    public void verify_the_presence_of_welcome_message() {
	        WebElement welcomeMessageElement = driver.findElement(By.id("welcome"));
	        Assert.assertTrue(welcomeMessageElement.isDisplayed(), "Welcome message not displayed.");
	        String welcomeMessage = welcomeMessageElement.getText();
	        Assert.assertTrue(welcomeMessage.contains("Welcome"), "Welcome message does not contain 'Welcome'.");
	    }

	    @And("close the browser")
	    public void close_the_browser() {
	        tearDown();
	    }
	}

