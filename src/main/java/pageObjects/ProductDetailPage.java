package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import util.PageWait;

public class ProductDetailPage {
	
	static String prodTitleExpected = null;	
	static By prodTitle = By.xpath("//h1[@class='prodtitle']");
	static By addToCartButton = By.xpath("//input[@name='Buy']");
	static By popUpDialogueBox = By.xpath("//div[@id='fancy_notification']"); 
	static By popupMessage= By.xpath("//div[@id='fancy_notification_content']/span"); 
	static By continueShoppingLink = By.xpath("//a[contains(text(),'Continue Shopping')]");
	
	
	public static WebElement prodTitle(WebDriver driver)
	{
		return driver.findElement(prodTitle);
	}
	
	
	public static String getprodTitleExpValue()
	{
		return ProductsPage.getprodTitleExpValue();		
	}
	
	public static WebElement addToCartButton(WebDriver driver)
	{
		return driver.findElement(addToCartButton);
	}
	
	public static WebElement popUpDialogueBox(WebDriver driver)
	{
		return driver.findElement(popUpDialogueBox);	
	}
	
	public static String popUpMessage(WebDriver driver)
	{
		return driver.findElement(popupMessage).getText();
	}
	
	public static WebElement continueShoppingLink(WebDriver driver)
	{
		return PageWait.waitForElementPresence(driver, continueShoppingLink, 10);
	}
	
	public static void clickOnContinueShoppingLink(WebDriver driver)
	{
		continueShoppingLink(driver).click();
	}
	
	public static void clickOnAddToCartButton(WebDriver driver)
	{
		addToCartButton(driver).click();
	}
	
	
}
