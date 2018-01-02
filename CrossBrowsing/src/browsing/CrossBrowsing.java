package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowsing {

	WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * 
	 * @param browser
	 * @throws Exception
	 */
	@Parameters("browser")
	@BeforeTest
	
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.marionette",
					"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\Desktop\\Java+Selenium\\chromedriver_win32.exe");
		} else {
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterwithXML() {
		driver.get("http://demo.guru99.com/V4/");
		WebElement username = driver.findElement(By.xpath("//input[@type='text' and @name='uid']"));
		username.sendKeys("guru99");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("guru99");

	}

}
