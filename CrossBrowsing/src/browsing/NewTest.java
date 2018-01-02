package browsing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class NewTest {
	
	public String baseurl = "http://demo.guru99.com/selenium/newtours";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;

		
  @Test
  public void f() {
	  
	  System.out.println("Launching FireFOx browser");
	  System.setProperty("webdriver.firefox.marionette", driverpath);
	  
	  driver = new FirefoxDriver();
	  driver.get(baseurl);
	  
	  String Expected_url = "Welcome: Mercury Tours";
	  String Actual_url = driver.getTitle();
	  
	  Assert.assertEquals(Actual_url, Expected_url);
	  
  }
}
