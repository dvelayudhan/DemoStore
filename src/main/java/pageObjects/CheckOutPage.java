package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Log;
import util.PageWait;

public class CheckOutPage {
	
	
	static int productquantityvalue=0;
	static String priceValue=null;
	static String priceTotalValue=null;
	static String shippingCostValue=null;
	static String checkoutTotalValue=null;
	static By checkoutProgressBar = By.xpath("//div[@class='progress_bar']");
	static By productsTableHeader = By.xpath("//tr[@class='header']/th[1]") ; // only displayed on page if there are items added in cart
	static By productsRows = By.xpath("//tr[contains(@class,'product_row product_row')]") ; //to see the number of rows 
	static By productQuantity = By.xpath("//td[@class='wpsc_product_quantity wpsc_product_quantity_0']/form/input[@name='quantity']");
	static By productPrice = By.xpath("//tr[@class='product_row product_row_0 alt']/td[4]/span");
	static By priceTotal= By.xpath("//tr[@class='product_row product_row_0 alt']/td[5]/span/span");
	static By continueButton = By.xpath("//a[@class='step2']");
	static By infoSlideLocator = By.xpath("//div[@class='slide2'] ");
	static By firstname = By.id("wpsc_checkout_form_2");
	static By lastname = By.id("wpsc_checkout_form_3");
	static By purchaseButton = By.xpath("//input[@value='Purchase']");
	static By shippingCost = By.xpath("//table[@class='wpsc_checkout_table table-4']/tbody/tr[2]/td[2]/span/span");
	static By checkoutTotal= By.xpath("//span[@id='checkout_total']/span");
	

	public static WebElement checkoutProgressBar(WebDriver driver)
	{
		return PageWait.waitForElementPresence(driver, checkoutProgressBar, 10);
	}
	
	public static WebElement productsTableHeader(WebDriver driver)
	{
		return driver.findElement(productsTableHeader);
	}
	
	public static WebElement purchaseButton(WebDriver driver)
	{
		return driver.findElement(purchaseButton);
	}
	
	public static List<WebElement> productsRows(WebDriver driver)
	{	
		return driver.findElements(productsRows);
	}
	
	public static String productPrice(WebDriver driver)
	{
		return driver.findElement(productPrice).getText();
	}
	
	
	
	public static void setProductPrice(WebDriver driver)
	{
		priceValue = productPrice(driver);
	}
	
	public static String getProductPrice()
	{
		return priceValue;
	}
	
	public static String priceTotal(WebDriver driver)
	{	
		
		return driver.findElement(priceTotal).getText();
	}
	
	
	public static void setPriceTotal(WebDriver driver)
	{
		priceTotalValue = priceTotal(driver);
	}
	
	public static String getPriceTotal()
	{
		return priceTotalValue;
	}
	
	public static String shippingCost(WebDriver driver)
	{	
		
		return driver.findElement(shippingCost).getText();
	}
	
	
	public static void setShippingCost(WebDriver driver)
	{
		shippingCostValue = shippingCost(driver);
	}
	
	public static String getShippingCost()
	{
		return shippingCostValue;
	}
	
	public static String checkoutTotal(WebDriver driver)
	{	
		
		return driver.findElement(checkoutTotal).getText();
	}
	
	
	public static void setCheckoutTotal(WebDriver driver)
	{
		checkoutTotalValue = checkoutTotal(driver);
	}
	
	public static String getCheckoutTotal()
	{
		return checkoutTotalValue;
	}
	
	public static WebElement productQuantity(WebDriver driver)
	{	
		return driver.findElement(productQuantity);
	}
	
	
	public static WebElement infoSlideLocator(WebDriver driver)
	{
		return driver.findElement(infoSlideLocator);
	}
	
	public static WebElement continueButton(WebDriver driver)
	{
		return driver.findElement(continueButton);
	}
	
	public static String firstname(WebDriver driver)
	{
		return driver.findElement(firstname).getAttribute("value");
	}
	
	public static String lastname(WebDriver driver)
	{
		return driver.findElement(lastname).getAttribute("value");
	}
	
	public static void productQuantityValue(WebDriver driver)
	{	
		productquantityvalue = Integer.parseInt(productQuantity(driver).getAttribute("value"));
		Log.info("Setting product quantity value as : " + productquantityvalue );
	}
	
	public static void setProductQuantity(WebDriver driver)
	{
		productQuantityValue(driver);
	}
	
	public static int getProductQuantity()
	{
		return productquantityvalue;
	}
	
	
	public static void clickOnContinueButton(WebDriver driver)
	{
		continueButton(driver).click();
	}
	
	public static void clickOnPurchaseButton(WebDriver driver)
	{
		purchaseButton(driver).click();
	}
	
	public static boolean checkInfoSlideIsDisplayed(WebDriver driver)
	{
		PageWait.waitTillAttributeStateChange(driver , infoSlideLocator, "style", "display: block;" , 20);
		return infoSlideLocator(driver).isDisplayed();
	}
	

}
