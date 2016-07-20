package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	protected static WebDriver driver= null;;
	private String browser=null;
	
	public static void initialiseDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Devika/Files/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

}
