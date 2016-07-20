package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Log;
import util.PageWait;

public class TransactionResultsPage {
	static By transactionHeader = By.xpath("//h1[@class='entry-title']");
	static By productTitle = By.xpath("//table[@class='wpsc-purchase-log-transaction-results']/tbody/tr/td[1]");
	static By productPrice= By.xpath("//table[@class='wpsc-purchase-log-transaction-results']/tbody/tr/td[2]");
	static By productQuantity=  By.xpath("//table[@class='wpsc-purchase-log-transaction-results']/tbody/tr/td[3]");
	static By priceTotal = By.xpath("//table[@class='wpsc-purchase-log-transaction-results']/tbody/tr/td[4]");
	
	public static WebElement transactionHeader(WebDriver driver)
	{
		return PageWait.waitForElementPresence(driver, transactionHeader, 15);
	}
	
	public static WebElement productTitle(WebDriver driver)
	{
		return driver.findElement(productTitle);
	}
	
	public static WebElement productPrice(WebDriver driver)
	{
		return driver.findElement(productPrice);
	}
	
	public static WebElement productQuantity(WebDriver driver)
	{
		return driver.findElement(productQuantity);
	}
	
	public static WebElement priceTotal(WebDriver driver)
	{
		return driver.findElement(priceTotal);
	}
	
	public static boolean isTransactionHeaderDisplayed(WebDriver driver)
	{
		boolean flag=transactionHeader(driver).isDisplayed();
		String transactionHeaderTitle = transactionHeader(driver).getText();
		if(flag)
		{
			Log.info("Transaction Header title is :" + transactionHeaderTitle);
		}		
		return flag;
	}
	
	public static boolean isProductTitleAsExpected(WebDriver driver)
	{
		
		String actual = productTitle(driver).getText();
		String expected = ProductsPage.getprodTitleExpValue();
		boolean flag = expected.equals(actual);
		if(flag)
		{			
			Log.info("Product title actual value : " + actual);
			Log.info("Product title expected value " + expected);
		}
		return flag;
	}
	
	public static boolean isProductPriceAsExpected(WebDriver driver)
	{
		String actual = productPrice(driver).getText();
		String expected = CheckOutPage.getProductPrice();
		boolean flag = expected.equals(actual);
		if(flag)
		{			
			Log.info("Product price actual value : " + actual);
			Log.info("Product price expected value : " + expected);
		}
		return flag;
	}
	
	public static boolean isProductQuantityAsExpected(WebDriver driver)
	{
		boolean flag =false ;
		int actual =Integer.parseInt(productQuantity(driver).getText());
		int expected = CheckOutPage.getProductQuantity();
		if(expected == actual)
			flag=true;
		if(flag)
		{			
			Log.info("Product quantity actual value : " + actual);
			Log.info("Product quantity expected value : " + expected);
		}
		return flag;
	}
	
	public static boolean isTotalProductPriceAsExpected(WebDriver driver)
	{
		String actual = priceTotal(driver).getText();
		String expected = CheckOutPage.getPriceTotal();
		boolean flag = expected.equals(actual);
		if(flag)
		{			
			Log.info("Total price actual value : " + actual);
			Log.info("Total price expected value : " + expected);
		}
		return flag;
	}

}
