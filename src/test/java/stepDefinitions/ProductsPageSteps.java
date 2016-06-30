package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ProductDetailPage;
import pageObjects.ProductsPage;
import util.DriverFactory;
import util.PageWait;

public class ProductsPageSteps extends DriverFactory {
	
	

	@Then("^I can see a list of Products$")
	public void i_can_see_a_list_of_Products() throws Throwable {
		System.out.println("I can see a list of Products : Code running");
		Assert.assertTrue("Assert pass", ProductsPage.isproductsListDisplayed(driver));
		System.out.println("product list is displayed");
		System.out.println("End of step");
		
	}
	
	@When("^I click on item name to see details$")
	public void i_click_on_item_name_to_see_details() throws Throwable {
		System.out.println("I click on item name to see details : Code running");
		//firstProductTitleInList = ProductsPage.firstProductTitle(driver).getText();
		ProductsPage.setprodTitleExpValue(driver);
		ProductsPage.clickOnProductTitle(driver);
		PageWait.waitTillPageLoad(driver);		
		System.out.println("End of step");
	}
	
	
}
