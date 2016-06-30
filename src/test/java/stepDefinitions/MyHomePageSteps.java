package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.MyHomePage;
import pageObjects.ProductDetailPage;
import util.DriverFactory;
import util.Log;
import util.PageWait;

public class MyHomePageSteps extends DriverFactory {
	
	private int itemCount=0 ;
	
	@Given("^I am on Home page$")
	public void i_am_on_homepage() throws Throwable {
		System.out.println("I am on Home page : code running");
	    MyHomePage.clickHomeTab(driver);
	    System.out.println("End of step");
	}
	
	
	@Then("^I am signed in$")
	public void I_am_signed_in() throws Throwable {
		Log.startTestStep("I am signed in");
		System.out.println("I am signed in : code running");
		PageWait.waitTillPageLoad(driver);
		Assert.assertTrue(MyHomePage.isLogOutLinkDisplayed(driver));		
		System.out.println("User is logged in ");
		Log.info("User is logged in successfully");
		System.out.println("End of step");
		Log.endTestStep();
		    
	}

	@When("^I navigate to Products page$")
	public void i_navigate_to_Products_page() throws Throwable{
		System.out.println("I navigate to Products page : code running");
		MyHomePage.clickProductCategoryTab(driver);
		System.out.println("End of step");
	}
	
	@When("^I click on LogOut$")
	public void i_click_on_LogOut() throws Throwable {
		System.out.println("I click on LogOut : code running");
	    MyHomePage.clickLogOutLink(driver);
	    System.out.println("End of step");
	}
	
	@Given("^I have added item\\(s\\) in my cart$")
	public void i_have_added_item_s_in_my_cart() throws Throwable {
		System.out.println("I have added item\\(s\\) in my cart : code running");
		PageWait.waitTillPageLoad(driver);
		System.out.println(MyHomePage.itemCountOnCart(driver).getText());
		itemCount = Integer.parseInt(MyHomePage.itemCountOnCart(driver).getText());
		System.out.println("The item count is " + itemCount );
		Assert.assertTrue("Assertion failed : Cart is empty", itemCount>0);
	    if(itemCount>0)
	    System.out.println("There are items in cart");
	    System.out.println("End of step");
			
	}

	@When("^I click on Checkout option$")
	public void i_click_on_Checkout_option() throws Throwable {
		System.out.println("I click on Checkout option : code running");
		MyHomePage.clickOnCheckOutIcon(driver);
		System.out.println("End of step");
	}
	
}
