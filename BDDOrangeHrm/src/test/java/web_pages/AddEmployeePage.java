package web_pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtilities;

public class AddEmployeePage extends SeleniumUtilities {
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name = "firstName")
	private WebElement firstNameInputField;
	
	@FindBy(name = "lastName")
	private WebElement lastNameInputField;
	
	@FindBy(xpath = "//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement epmloyeeIdInputField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButtonOnAddEmployeePage;

	
	public void createEmployee(String firstName, String lastName, int empId) {
		typeInput(firstNameInputField, firstName);
		typeInput(lastNameInputField, lastName);
		setSleepTime(2000);
		getActiveElementFromUI().sendKeys(Keys.TAB, Keys.BACK_SPACE);
		waitForElementDisplayed(epmloyeeIdInputField);
		typeInput(epmloyeeIdInputField, String.valueOf(empId));
		setSleepTime(2000);
		
	}
	
	public void saveEmpDetails() {
		clickOnElement(saveButtonOnAddEmployeePage);
	}
}
