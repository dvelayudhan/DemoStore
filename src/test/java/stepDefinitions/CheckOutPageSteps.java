package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import pageObjects.CheckOutPage;
import pageObjects.ProfilePage;
import util.DriverFactory;
import util.Log;
import util.PageWait;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckOutPageSteps extends DriverFactory {
	
	private int numberOfRowsInProductsTable=0;
	private String firstname = null;
	private String lastname = null;
	
	@Then("^I can see the item\\(s\\) in my cart$")
	public void i_can_see_the_item_s_in_my_cart() throws Throwable {
		Log.startTestStep("I can see the item\\(s\\) in my cart : code running");
		Assert.assertTrue("Assertion failed : Checkout Progress Bar is not displayed", CheckOutPage.checkoutProgressBar(driver).isDisplayed());
		if(CheckOutPage.checkoutProgressBar(driver).isDisplayed())
		{
			Log.info("Checkout progress bar is displayed");
			Assert.assertTrue("Assertion failed : Items table is not displayed", CheckOutPage.productsTableHeader(driver).isDisplayed());
			numberOfRowsInProductsTable = CheckOutPage.productsRows(driver).size();
			Assert.assertTrue("Assertion failed : No products displayed in Products table", (numberOfRowsInProductsTable>0));
			Log.info("Number of rows in products table :" +numberOfRowsInProductsTable);
		}
		BasePage.clickOnHomeTab(driver);
		
		
	}
	
	@When("^I click on Continue button$")
	public void i_click_on_Continue_button() throws Exception {
		try{
		Log.startTestStep("I click on Continue button : Code running");
		CheckOutPage.setProductQuantity(driver);
		CheckOutPage.setProductPrice(driver);
		CheckOutPage.setPriceTotal(driver);
		CheckOutPage.clickOnContinueButton(driver);
		}catch(Exception e)
		{
			Log.error("Error at step : I click on Continue button");
			throw e;
		}
		Log.endTestStep();
		
	}
	
	@Then("^I can see my info autopopulated$")
	public void i_can_see_my_info_autopopulated() throws Throwable {
		System.out.println("I can see my info autopopulated : running");
		boolean flag=false;
		firstname= ProfilePage.getFirstName();
		lastname= ProfilePage.getLastName();
		Assert.assertTrue("Assertion failed : Info Section is not displayed", CheckOutPage.checkInfoSlideIsDisplayed(driver));
				if(CheckOutPage.checkInfoSlideIsDisplayed(driver))
				{
					Log.info("Infoelement is displayed.");
					if(CheckOutPage.firstname(driver).equals(firstname))
					{
						Log.info("Firstname is autopupulated correctly : " + CheckOutPage.firstname(driver) );
						if(CheckOutPage.lastname(driver).equals(lastname))
						{
							Log.info("Lastname is autopupulated correctly : " + CheckOutPage.lastname(driver));
							flag=true;
						}
						else
							flag=false;
					}
					else
						flag= false;
				}
				else
				{
					Log.error("Infoelement is not displayed");
				}
					if(flag)
					{
						Log.info("Details are populated correctly");
					}
		Log.endTestStep();
		BasePage.clickOnHomeTab(driver);
		
	}
	
	@When("^I click on Purchase button$")
	public void i_click_on_Purchase_button() throws Throwable {
		Log.startTestStep("I click on Purchase button : code running");
		Assert.assertTrue("Assertion failed : CheckOut info section is not displayed" ,CheckOutPage.checkInfoSlideIsDisplayed(driver));
		Log.info("Info Slid is displayed");
		CheckOutPage.setShippingCost(driver);
		CheckOutPage.setCheckoutTotal(driver);
		CheckOutPage.clickOnPurchaseButton(driver);
		Log.info("Clicked on Purchase button");
		PageWait.waitTillPageLoad(driver);
		Log.endTestStep();
	}

}
