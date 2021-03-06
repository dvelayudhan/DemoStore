package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyHomePage;
import util.DataReader;
import util.DriverFactory;
import util.Log;

public class LogInPageSteps extends DriverFactory {


	@When("^I enter valid username$")
	public void i_enter_valid_username() throws Throwable {
		Log.startTestStep("I enter valid username");
		LoginPage.enterUsername(driver,DataReader.readUsername());
	    Log.info("Entered username");
	    Log.endTestStep();
	}

	@When("^I enter valid password$")
	public void i_enter_valid_password() throws Throwable {
		Log.startTestStep("I enter valid password");
	    LoginPage.enterPassword(driver,DataReader.readPassword());
	    Log.info("Entered password");
	    Log.endTestStep();
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
	   Log.startTestStep("I click on Login button");
	   LoginPage.clickLoginButton(driver);
	   Log.info("Clicked on Login button");
	   Log.endTestStep();
	}

	@Then("^I go to LoginPage$") //for logout
	public void i_go_to_LoginPage() throws Throwable {
	   Log.startTestStep("I go to LoginPage : code running");
	   Assert.assertTrue(LoginPage.isLoginSectionDisplayed(driver));
	   Log.info("Navigated to login page");
	   Log.endTestStep();
	}

}
