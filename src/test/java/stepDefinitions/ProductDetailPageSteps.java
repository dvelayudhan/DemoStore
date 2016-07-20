package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import pageObjects.ProductDetailPage;
import util.DriverFactory;
import util.PageWait;

public class ProductDetailPageSteps extends DriverFactory{
	
	
	
	@Then("^I can see the product Details$")
	public void i_can_see_the_product_Details() throws Throwable {
		System.out.println("I can see the product Details : code running");
		String firstProductTitleInList =ProductDetailPage.getprodTitleExpValue();
		String productTitleOnPage = ProductDetailPage.prodTitle(driver).getText();
		System.out.println("expecteds :" +firstProductTitleInList);
		System.out.println("actuals :" +productTitleOnPage);
		Assert.assertEquals("Assert for product details page : fail", firstProductTitleInList, productTitleOnPage);
		BasePage.clickOnHomeTab(driver);
		System.out.println("End of step");
		
	}
	
	@When("^I click on Add To Cart option$")
	public void i_click_on_Add_To_Cart_option() throws Throwable {
		System.out.println("I click on Add To Cart option : code running");
		ProductDetailPage.clickOnAddToCartButton(driver);
		PageWait.waitTillPageLoad(driver);
		System.out.println("End of step");
	}
	
	@Then("^I can see the success message$")
	public void i_can_see_the_success_message() throws Throwable {
		System.out.println("I can see the success message : code running");
		WebElement popUp = ProductDetailPage.popUpDialogueBox(driver);
		Assert.assertTrue("Assertion failed : Popup is not displayed", popUp.isDisplayed());
		if(popUp.isDisplayed())
			{
			
			String popUpMessage = ProductDetailPage.popUpMessage(driver);
			String prodTitle = ProductDetailPage.getprodTitleExpValue();
			Assert.assertTrue("Popup message has product name : Assert failed", popUpMessage.contains(prodTitle));
			if(popUpMessage.contains(prodTitle))
			System.out.println("Correct popup message");
			ProductDetailPage.clickOnContinueShoppingLink(driver);
			System.out.println("Clicked on Continue shopping link");
			}
		else
			System.out.println("Pop up not identified");
		BasePage.clickOnHomeTab(driver);
		System.out.println("End of step");
		
	}

}
