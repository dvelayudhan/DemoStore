package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import pageObjects.CheckOutPage;
import pageObjects.TransactionResultsPage;
import util.DriverFactory;

public class TransactionResultsPageSteps extends DriverFactory {
	
	@Then("^I complete the transaction$")
	public void i_complete_the_transaction() throws Throwable {
		System.out.println("I complete the transaction : code running");
		Assert.assertTrue("Assertion failed : Transaction header title not displayed", TransactionResultsPage.isTransactionHeaderDisplayed(driver));
		Assert.assertTrue("Assertion failed : Product title is not as expected ", TransactionResultsPage.isProductTitleAsExpected(driver));
		Assert.assertTrue("Assertion failed : Product price is not as expected ", TransactionResultsPage.isProductPriceAsExpected(driver));
		Assert.assertTrue("Assertion failed : Product quantity is not as expected ", TransactionResultsPage.isProductQuantityAsExpected(driver));
		Assert.assertTrue("Assertion failed : Total product price is not as expected ", TransactionResultsPage.isTotalProductPriceAsExpected(driver));
		System.out.println("All assertions passed : Details are as expected");		
	}

}
