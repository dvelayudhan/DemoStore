package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.MyHomePage;
import pageObjects.ProductDetailPage;
import util.DataReader;
import util.DriverFactory;
import util.Log;
import util.PageWait;

public class MyHomePageSteps extends DriverFactory {
	
	private int itemCount=0 ;
	
	@Given("^I am on Home page$")
	public void i_am_on_homepage() throws Throwable {
	   Log.startTestStep("I am on Home page : code running");
	   Assert.assertTrue("Assertion fail : Not on homepage", driver.getCurrentUrl().equals(DataReader.readUrl()));
	   Log.info("User is at home page");
	   Log.endTestStep();
	}
	
	
	@Then("^I am signed in$")
	public void I_am_signed_in() throws Throwable {
		Log.startTestStep("I am signed in");
		PageWait.waitTillPageLoad(driver);
		Assert.assertTrue(MyHomePage.isLogOutLinkDisplayed(driver));		
		BasePage.clickOnHomeTab(driver);
		Log.info("User is logged in ");
		Log.endTestStep();
		    
	}

	@When("^I navigate to Products page$")
	public void i_navigate_to_Products_page() throws Throwable{
		Log.startTestStep("I navigate to Products page : code running");
		MyHomePage.clickProductCategoryTab(driver);
		Log.info("Clicked on Product Category tab");
		Log.endTestStep();
	}
	
	@When("^I click on LogOut$")
	public void i_click_on_LogOut() throws Throwable {
		Log.startTestStep("I click on LogOut : code running");
	    MyHomePage.clickLogOutLink(driver);
	    Log.info("Clicked on log out link");
	    Log.endTestStep();
	}
	
	@Given("^I have added item\\(s\\) in my cart$")
	public void i_have_added_item_s_in_my_cart() throws Throwable {
		Log.startTestStep("I have added item\\(s\\) in my cart : code running");
		PageWait.waitTillPageLoad(driver);
		itemCount = Integer.parseInt(MyHomePage.itemCountOnCart(driver).getText());
		Assert.assertTrue("Assertion failed : Cart is empty", itemCount>0);
	    if(itemCount>0)
	    Log.info("There are items in cart : " +itemCount+ " items");
	    System.out.println("End of step");
			
	}

	@When("^I click on Checkout option$")
	public void i_click_on_Checkout_option() throws Throwable {
		Log.startTestStep("I click on Checkout option : code running");
		MyHomePage.clickOnCheckOutIcon(driver);
		Log.info("Clicked on Check Out icon");
		Log.endTestStep();
		}
	
}
