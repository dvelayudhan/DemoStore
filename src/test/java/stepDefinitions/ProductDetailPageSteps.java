package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import pageObjects.ProductDetailPage;
import util.DriverFactory;
import util.Log;
import util.PageWait;

public class ProductDetailPageSteps extends DriverFactory{
	
	
	
	@Then("^I can see the product Details$")
	public void i_can_see_the_product_Details() throws Throwable {
		Log.startTestStep("I can see the product Details : code running");
		String firstProductTitleInList =ProductDetailPage.getprodTitleExpValue();
		String productTitleOnPage = ProductDetailPage.prodTitle(driver).getText();
		Log.info("Expected product is : " +firstProductTitleInList);
		Log.info("Displayed product is : " +productTitleOnPage);
		Assert.assertEquals("Assert for product details page : fail", firstProductTitleInList, productTitleOnPage);
		Log.info("Details are displayed as expected");
		BasePage.clickOnHomeTab(driver);
		Log.endTestStep();
		
	}
	
	@When("^I click on Add To Cart option$")
	public void i_click_on_Add_To_Cart_option() throws Throwable {
	    Log.startTestStep("I click on Add To Cart option : code running");
		ProductDetailPage.clickOnAddToCartButton(driver);
		Log.info("Clicked on Add To Cart button");
		PageWait.waitTillPageLoad(driver);
		Log.endTestStep();
	}
	
	@Then("^I can see the success message$")
	public void i_can_see_the_success_message() throws Throwable {
		Log.startTestStep("I can see the success message : code running");
		WebElement popUp = ProductDetailPage.popUpDialogueBox(driver);
		Assert.assertTrue("Assertion failed : Popup is not displayed", popUp.isDisplayed());
		Log.info("Pop up is displayed");
		if(popUp.isDisplayed())
			{
			
			String popUpMessage = ProductDetailPage.popUpMessage(driver);
			String prodTitle = ProductDetailPage.getprodTitleExpValue();
			Assert.assertTrue("Popup message has product name : Assert failed", popUpMessage.contains(prodTitle));
			if(popUpMessage.contains(prodTitle))
			Log.info("Correct popup message displayed");
			ProductDetailPage.clickOnContinueShoppingLink(driver);
			Log.info("Clicked on Continue shopping link");
			}
		else
			Log.error("Pop up not identified");
		BasePage.clickOnHomeTab(driver);
		Log.endTestStep();
		
	}

}
