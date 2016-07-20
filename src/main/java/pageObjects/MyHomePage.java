package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Log;
import util.PageWait;

public class MyHomePage {
	
	static By linkLogout = By.xpath("//div[@id='account_logout']/a");	
	static By productCategoryTab = By.linkText("Product Category");
	static By itemCountOnCart = By.xpath("//div[@id='header_cart']/a/em[@class='count']");
	static By checkOutIcon = By.xpath("//div[@id='header_cart']/a/span[@class='icon']");
    static By howdyTab= By.xpath("//a[contains(text(),'Howdy,')]");
	
	public static WebElement howdyTab(WebDriver driver)
	{
		return driver.findElement(howdyTab);
	}
	
	public static void clickOnHowdyTab(WebDriver driver)
	{
		howdyTab(driver).click();
	}
	
	public  static WebElement linkLogOut(WebDriver driver)
	{
		return PageWait.waitForElementPresence(driver, linkLogout, 10);
		
	}
	
	public static WebElement productCategoryTab(WebDriver driver)
	{
		return driver.findElement(productCategoryTab);
	}
	
	public static boolean isLogOutLinkDisplayed(WebDriver driver)
	{
		Log.info("Checking if LogOut link is displayed");
		return linkLogOut(driver).isDisplayed();
	}
	
	public static WebElement itemCountOnCart(WebDriver driver)
	{
		return driver.findElement(itemCountOnCart);
	}
	
	public static WebElement checkOutIcon(WebDriver driver)
	{
		return driver.findElement(checkOutIcon);
	}
	
	public static void clickOnCheckOutIcon(WebDriver driver)
	{
		checkOutIcon(driver).click();
	}
	
	public static void clickLogOutLink(WebDriver driver)
	{
	 linkLogOut(driver).click();
	}	
	
	public static void clickProductCategoryTab(WebDriver driver)
	{
		productCategoryTab(driver).click();
	}
	
}
