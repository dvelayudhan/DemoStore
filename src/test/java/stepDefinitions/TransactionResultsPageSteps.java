package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import pageObjects.BasePage;
import pageObjects.CheckOutPage;
import pageObjects.TransactionResultsPage;
import util.DriverFactory;
import util.Log;

public class TransactionResultsPageSteps extends DriverFactory {
	
	@Then("^I complete the transaction$")
	public void i_complete_the_transaction() throws Throwable {
		Log.startTestStep("I complete the transaction : code running");
		Assert.assertTrue("Assertion failed : Transaction header title not displayed", TransactionResultsPage.isTransactionHeaderDisplayed(driver));
		Log.info("Transaction header title is displayed");
		Assert.assertTrue("Assertion failed : Product title is not as expected ", TransactionResultsPage.isProductTitleAsExpected(driver));
		Log.info("Product title is as expected ");
		Assert.assertTrue("Assertion failed : Product price is not as expected ", TransactionResultsPage.isProductPriceAsExpected(driver));
		Log.info("Product price is as expected");
		Assert.assertTrue("Assertion failed : Product quantity is not as expected ", TransactionResultsPage.isProductQuantityAsExpected(driver));
		Log.info("Product quantity is as expected");
		Assert.assertTrue("Assertion failed : Total product price is not as expected ", TransactionResultsPage.isTotalProductPriceAsExpected(driver));
		Log.info("Total product price is as expected");
		Log.info("All assertions passed : Details are as expected");		
		BasePage.clickOnHomeTab(driver);
	}

}
