package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtilities;

public class EmployeeListPage extends SeleniumUtilities {
	WebDriver driver;

	public EmployeeListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = " div > div:nth-child(2) > div > div:nth-child(2) > input")
	private WebElement empIdSearchBox;

	@FindBy(css = "div.oxd-form-actions > button.oxd-button--secondary")
	private WebElement searchButton;

	@FindBy(css = "div.orangehrm-header-container > button")
	private WebElement addEmpButton;

	@FindBy(css = "div > div:nth-child(9) > div > button:nth-child(2) > i")
	private WebElement EditButton;

	@FindBy(css = "div > div:nth-child(9) > div > button:nth-child(1) > i")
	private WebElement deleteButton;

	public WebElement getEmpIdSearchBox() {
		return empIdSearchBox;
	}

	public WebElement getAddEmpButton() {
		return addEmpButton;
	}

	public void searchEmployee(String empId) {
		typeInput(empIdSearchBox, empId);
		clickOnElement(searchButton);
		setSleepTime(2000);
		clickOnElement(EditButton);
	}

	public void navigateToAddEmp() {
		clickOnElement(addEmpButton);
	}

	public void deleteEmployee(String empId) {
		typeInput(empIdSearchBox, empId);
		clickOnElement(searchButton);
		setSleepTime(2000);
		clickOnElement(deleteButton);
	}
}
