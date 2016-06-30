package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage 

{
	
	static By linkMyAccount = By.xpath("//a[@title='My Account']");
	

	
	public static WebElement linkMyAccount (WebDriver driver)
	{
		return driver.findElement(linkMyAccount);
	}
		
	
	public static void clickOnLinkMyAccount(WebDriver driver)
	{
		linkMyAccount(driver).click();		
	}

}
