package pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	
	static String prodTitleExpected = null;
	static By productClass = By.xpath("//div[contains(@class,'product-category group')]");
	static By productLink = By.xpath("//a[contains(text(),'iPhone 5')]");
	static By productTitle = By.xpath("//h2[@class='prodtitle']/a");
	
	public static boolean isproductsListDisplayed(WebDriver driver)
	{
		boolean flag;
		if((driver.findElements(productClass).size())>0)
		{
			flag = true;
			System.out.println("Number of products :" + driver.findElements(productClass).size() );
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
		System.out.println("Inside Products page : Product Title :" +prodTitleExpected );
		return prodTitleExpected;
	}
	
	public static void clickOnProductTitle(WebDriver driver)
	{
		firstProductTitle(driver).click();
	}

}
