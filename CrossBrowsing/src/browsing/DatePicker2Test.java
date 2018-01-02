package browsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker2Test {

	public String base_url = "http://www.demo.guru99.com/selenium/newtours/";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";

	public WebDriver driver;

	@BeforeTest

	public void launchBrowser() {
		System.out.println("Launching Browser.....");
		System.setProperty("webdriver.firefox.marionette", driverpath);
		driver = new FirefoxDriver();
		driver.get(base_url);

		driver.manage().window().maximize();
	}

	@Test(priority = 0)

	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();

		WebElement first_name = driver.findElement(By.name("firstName"));
		first_name.sendKeys("Mukesh");

		WebElement last_name = driver.findElement(By.name("lastName"));
		last_name.sendKeys("Patil");

		WebElement phone_no = driver.findElement(By.name("phone"));
		phone_no.sendKeys("9876543210");

		WebElement email_id = driver.findElement(By.id("userName"));
		Assert.assertTrue(email_id.isDisplayed());
		email_id.sendKeys("qwerty@gmail.com");

		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("Saint johns way, california, USA");

		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("chicago");

		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("california");

		WebElement postal_code = driver.findElement(By.name("postalCode"));
		postal_code.sendKeys("456098");

		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("UNITED STATES");

	}
}
