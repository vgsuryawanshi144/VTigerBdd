package com.sauce_demo.test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce_demo.pom.CartPage;
import com.sauce_demo.pom.CheckoutAddress;
import com.sauce_demo.pom.CheckoutSuccess;
import com.sauce_demo.pom.HomePage;
import com.sauce_demo.pom.LoginPage;
import com.sauce_demo.pom.ProductListingPage;
import com.sauce_demo.pom.ReviewOrderFinal;
import com.sauce_demo.utilities.BaseUtility;

public class TestSwagLabs extends BaseUtility {
	LoginPage loginPage;
	HomePage homePage;
	ProductListingPage productListingPage;
	CartPage cartPage;
	CheckoutAddress checkoutAddress;
	ReviewOrderFinal reviewfinal;
	CheckoutSuccess checkoutSuccess;

	@BeforeMethod
	public void loginToApp() {
		WebDriver driver = setUp("Chrome", "https://www.saucedemo.com/");
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		productListingPage = new ProductListingPage(driver);
		cartPage = new CartPage(driver);
		checkoutAddress = new CheckoutAddress(driver);
		reviewfinal = new ReviewOrderFinal(driver);
		checkoutSuccess = new CheckoutSuccess(driver);

		loginPage.loginToSwagLab("standard_user", "secret_sauce");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Logged in Successfuly");
	}

	@Test
	public void tc_001() {
		productListingPage.addProductToCart();
		cartPage.proceedToCheckout();
		checkoutAddress.continueWithAddress("Gaurav", "Suryawanshi", "411028");
		reviewfinal.finshShopping();
		String expectedMsg = "Thank you for your order!";
		String actaulMsg = checkoutSuccess.verifyMsg();
		Assert.assertEquals(actaulMsg, expectedMsg);
		checkoutSuccess.goTOHome();
	}

	@Test(dependsOnMethods = "tc_001")
	public void tc_002() {
		homePage.logoutFromApp();
	}

	@AfterMethod
	public void studDown() {
		tearDown();
	}
}
