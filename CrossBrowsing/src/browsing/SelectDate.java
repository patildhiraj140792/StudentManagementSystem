package browsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectDate {
@BeforeTest

public void Connections()
{
	System.setProperty("webdriver.firefox.marionette",
			"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.redbus.in");
	driver.manage().window().maximize();
}
	@Test
  public void f() {
	
	
	
	
	}
}
