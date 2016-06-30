package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.PageWait;

public class ProfilePage  {
	
	static String firstname=null;;
	static String lastname=null;
	static By firstName = By.id("first_name");
	static By lastName = By.id("last_name");
	static By onlineStoreTab = By.xpath("//a[contains(text(),'ONLINE STORE')]");
	
	
	public static WebElement firstName(WebDriver driver)
	{
		return driver.findElement(firstName);
	}
	
	public static WebElement lastName(WebDriver driver)
	{
		return driver.findElement(lastName);
	}
	
	public static WebElement onlineStoreTab(WebDriver driver)
	{
		return driver.findElement(onlineStoreTab);
	}
	
	public static String firstNameValue(WebDriver driver)
	{
		firstname = firstName(driver).getAttribute("value");
		return firstname;
	}
	
	public static String lastNameValue(WebDriver driver)
	{
		lastname= lastName(driver).getAttribute("value");
		return lastname;
	}
	
	public static String getFirstName()
	{
		return firstname;
	}
	
	public static String getLastName()
	{
		return lastname;
	}
	
	public static void clickOnlineStoreTab(WebDriver driver)
	{
	    onlineStoreTab(driver).click();
	}
	
}
