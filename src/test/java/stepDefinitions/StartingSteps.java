package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import util.DataReader;
import util.DriverFactory;
import util.Log;
import util.PropertyReader;

public class StartingSteps extends DriverFactory {
	
		
	@Before ("@Setup")
	@Given("^I load the website url$")
	public void i_load_the_website_url() throws Throwable
	{
		DOMConfigurator.configure("log4j.xml");
		Log.startTestStep("I load the website url : code running");
		Log.info("Load url :" + DataReader.readUrl());
		DriverFactory.initialiseDriver();
		Log.info("Driver intialised");
		driver.get(DataReader.readUrl());	
		driver.manage().window().maximize();		
		Log.info("Opened the site");	 
		Log.endTestStep();
	}
	
	@After ("@Teardown")
	public void teardown()
	{
		Log.info("Quiting driver");
		driver.quit();
	}
	
}
