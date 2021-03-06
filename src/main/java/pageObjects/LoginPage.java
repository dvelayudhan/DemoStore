package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Log;
import util.PageWait;



public class LoginPage
{


	static By textboxUsername = By.id("log");
	static By textboxPassword = By.id("pwd");
	static By loginButton = By.id("login");
	static By loginSection = By.xpath("//div[@id='content']");
	
	
	public static WebElement textboxUsername(WebDriver driver)
	{
		return driver.findElement(textboxUsername);
		 		
	}
	
	public static WebElement textboxPassword(WebDriver driver)
	{
		return  driver.findElement(textboxPassword);
		
	}
	
	public static WebElement buttonLogIn(WebDriver driver)
	{
		return driver.findElement(loginButton);
		
	}
	
	public static WebElement loginSection(WebDriver driver)
	{
		return PageWait.waitForElementPresence(driver, loginSection, 10);
		
	}
	
	public static void enterUsername(WebDriver driver ,String username)
	{
	    textboxUsername(driver).sendKeys(username);
	    
	}
	
	public static void enterPassword(WebDriver driver ,String password)
	{
		textboxPassword(driver).sendKeys(password);
		
	}
	
	public static void clickLoginButton(WebDriver driver)
	{
		buttonLogIn(driver).click();
		
		
	}
	public static boolean isLoginSectionDisplayed(WebDriver driver)
	{
		
		return loginSection(driver).isDisplayed();
	}
	
}

