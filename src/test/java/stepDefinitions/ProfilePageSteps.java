package stepDefinitions;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import pageObjects.MyHomePage;
import pageObjects.ProfilePage;
import util.DriverFactory;
import util.Log;
import util.PageWait;

public class ProfilePageSteps extends DriverFactory {
	
	static String firstname=null;
	static String lastname=null;
	
	@Given("^I have my personal info stored in my profile$")
	public void i_have_my_personal_info_stored_in_my_profile() throws Throwable {
		Log.startTestStep("I have my personal info stored in my profile : code running");
		MyHomePage.clickOnHowdyTab(driver);
		Log.info("Clicked on Howdy tab");
		PageWait.waitTillPageLoad(driver);
		firstname=ProfilePage.firstNameValue(driver);
		lastname=ProfilePage.lastNameValue(driver);
		Assert.assertTrue("Assertion failed : Firstname field is empty", firstname.length()>0);
		Assert.assertTrue("Assertion failed : Lastname field is empty", lastname.length()>0);	
		Log.info("Validated that ersonal info is store in profile");
		ProfilePage.clickOnlineStoreTab(driver);
		Log.info("Clicked on OnlineStore tab");
		PageWait.waitTillPageLoad(driver);
		Log.endTestStep();
	}

}
