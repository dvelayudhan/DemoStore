package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import util.DriverFactory;
import util.Log;

public class HomePageSteps  extends DriverFactory{

	
	
	@When("^I navigate to Login page$")
	public void I_navigate_to_Login_page() throws Throwable {	
		Log.startTestStep("I navigate to Login page : code running");
		 HomePage.clickOnLinkMyAccount(driver);
		 Log.info("Clicked on MyAccount link");
		 Log.endTestStep();
	   	}
	
	
	
}
