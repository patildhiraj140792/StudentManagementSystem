package com.pack.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBaseSetup {

	private WebDriver driver;
	static String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";

	public WebDriver getdriver() {
		return driver;
	}

	@Test
	
	private void setDriver(String browserType, String appURL) {

		switch (browserType) {

		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(appURL);
		return driver;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass

	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);
		} catch (Exception e) {
			System.out.println("Error" + e.getStackTrace());
		}

	}

	@AfterClass

	public void tearDown() {
		driver.close();
	}
}
