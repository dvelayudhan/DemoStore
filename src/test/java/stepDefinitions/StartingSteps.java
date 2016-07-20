package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import util.DataReader;
import util.DriverFactory;
import util.PropertyReader;

public class StartingSteps extends DriverFactory {
	
		
	@Before ("@Setup")
	@Given("^I load the website url$")
	public void i_load_the_website_url() throws Throwable
	{
		System.out.println("I load the website url : code running");
		System.out.println("Print url :" + DataReader.readUrl());
		DriverFactory.initialiseDriver();
		driver.get(DataReader.readUrl());	
		driver.manage().window().maximize();
		DOMConfigurator.configure("log4j.xml");
		System.out.println("Opened the site");	 
		System.out.println("End of step");
	}
	
	@After ("@Teardown")
	public void teardown()
	{
		driver.quit();
	}
	
}
