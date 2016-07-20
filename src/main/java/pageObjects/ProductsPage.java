package pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import util.Log;
import util.PageWait;

public class ProductsPage {
	
	static String prodTitleExpected = null;
	static By productClass = By.xpath("//div[contains(@class,'product-category group')]");
	static By productLink = By.xpath("//a[contains(text(),'iPhone 5')]");
	static By productTitle = By.xpath("//h2[@class='prodtitle']/a");
	static By homeTab= By.xpath("//nav[@id='main-nav']/ul/li/a");
	
	public static WebElement homeTab(WebDriver driver)
	{
		return driver.findElement(homeTab);
	}
	
	public static void clickOnHomeTab(WebDriver driver)
	{
		try{
			PageWait.waitForElementToBeClickable(driver, homeTab, 10).click();	
		}
		catch(WebDriverException e)
		{
			// The page can be fully loaded, and completely within the viewport, but Chromedriver will refuse to click it when the element to be clicked is wrapped inside a div or span, where the webdriver for FF and IE have no issue.
		    //So a workaround for this is to use SendKeys(Keys.RETURN) instead of click()
			Log.error("WebDriverException caught");
			driver.findElement(homeTab).sendKeys(Keys.RETURN);		
			PageWait.waitTillPageLoad(driver);
			
		}
	}
	
	public static boolean isproductsListDisplayed(WebDriver driver)
	{
		boolean flag;
		if((driver.findElements(productClass).size())>0)
		{
			flag = true;
			Log.info("Number of products :" + driver.findElements(productClass).size() );
		}
		else
		flag=false;
		return flag;
	}
	
	public static WebElement firstProductTitle(WebDriver driver)
	{
		List<WebElement> productTitleList = driver.findElements(productTitle);
		Iterator<WebElement> itr=productTitleList.iterator();
		return itr.next();
	}
	
	public static String firstProductTitleText(WebDriver driver)
	{
		
		return firstProductTitle(driver).getText();
	}
	
	public static void setprodTitleExpValue(WebDriver driver)
	{
		prodTitleExpected= firstProductTitleText(driver);
	}

	public static String getprodTitleExpValue()
	{
		Log.info("Inside Products page : Product Title :" +prodTitleExpected );
		return prodTitleExpected;
	}
	
	public static void clickOnProductTitle(WebDriver driver)
	{
		firstProductTitle(driver).click();
	}

}
