package browsing;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;


public class SampleTestNg {
 
	public String baseurl = "http://www.google.com";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;
	
	@Test
  public void f() {
		
		System.out.println("Launching Browser");
		
		
		System.setProperty("webdriver.firefox.marionette",driverpath);
		
		driver = new FirefoxDriver();
		
		Reporter.log("Browser Opened");
		
		driver.get(baseurl);
		
		Reporter.log("Browser Opened....");
		
		String expectedtitle = "Google";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
		
		
		
  }
 

 

}
