package stepDefinitions;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import pageObjects.MyHomePage;
import pageObjects.ProfilePage;
import util.DriverFactory;
import util.PageWait;

public class ProfilePageSteps extends DriverFactory {
	
	static String firstname=null;
	static String lastname=null;
	
	@Given("^I have my personal info stored in my profile$")
	public void i_have_my_personal_info_stored_in_my_profile() throws Throwable {
		System.out.println("I have my personal info stored in my profile : code running");
		MyHomePage.clickOnHowdyTab(driver);
		PageWait.waitTillPageLoad(driver);
		firstname=ProfilePage.firstNameValue(driver);
		lastname=ProfilePage.lastNameValue(driver);
		Assert.assertTrue("Assertion failed : Firstname field is empty", firstname.length()>0);
		Assert.assertTrue("Assertion failed : Lastname field is empty", lastname.length()>0);		
		ProfilePage.clickOnlineStoreTab(driver);
		PageWait.waitTillPageLoad(driver);
	}

}
