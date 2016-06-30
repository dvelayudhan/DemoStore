package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
		System.out.println("I can see the item\\(s\\) in my cart : code running");
		Assert.assertTrue("Assertion failed : Checkout Progress Bar is not displayed", CheckOutPage.checkoutProgressBar(driver).isDisplayed());
		if(CheckOutPage.checkoutProgressBar(driver).isDisplayed())
		{
			System.out.println("Checkout progress bar is displayed");
			Assert.assertTrue("Assertion failed : Items table is not displayed", CheckOutPage.productsTableHeader(driver).isDisplayed());
			numberOfRowsInProductsTable = CheckOutPage.productsRows(driver).size();
			Assert.assertTrue("Assertion failed : No products displayed in Products table", (numberOfRowsInProductsTable>0));
			System.out.println("Number of rows in products table :" +numberOfRowsInProductsTable);
		}
		//here get the values and store them
		
		
	}
	
	@When("^I click on Continue button$")
	public void i_click_on_Continue_button() throws Exception {
		try{
		System.out.println("I click on Continue button : Code running");
		CheckOutPage.setProductQuantity(driver);
		CheckOutPage.setProductPrice(driver);
		CheckOutPage.setPriceTotal(driver);
		CheckOutPage.clickOnContinueButton(driver);
		}catch(Exception e)
		{
			Log.error("Error at step : I click on Continue button");
			throw e;
		}
		
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
					System.out.println("Infoelement is displayed.");
					if(CheckOutPage.firstname(driver).equals(firstname))
					{
						System.out.println("Firstname is autopupulated correctly : " + CheckOutPage.firstname(driver) );
						if(CheckOutPage.lastname(driver).equals(lastname))
						{
							System.out.println("Lastname is autopupulated correctly : " + CheckOutPage.lastname(driver));
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
					System.out.println("Infoelement is not displayed");
				}
					if(flag)
					{
						System.out.println("Details are populated correctly");
					}
		
		
	}
	
	@When("^I click on Purchase button$")
	public void i_click_on_Purchase_button() throws Throwable {
		System.out.println("I click on Purchase button : code running");
		Assert.assertTrue("Assertion failed : CheckOut info section is not displayed" ,CheckOutPage.checkInfoSlideIsDisplayed(driver));
		CheckOutPage.setShippingCost(driver);
		CheckOutPage.setCheckoutTotal(driver);
		CheckOutPage.clickOnPurchaseButton(driver);
		PageWait.waitTillPageLoad(driver);
	}

}
