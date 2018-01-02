package browsing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getdomainname {

	public static void main(String[]args)
	{
	
	System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
	WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.seleniumsnap.blogspot.in/");
	  driver.manage().window().maximize();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  String domain = (String) js.executeScript("return document.domain");
	  System.out.println("domain  : " + domain);
	 driver.quit();
}
}
