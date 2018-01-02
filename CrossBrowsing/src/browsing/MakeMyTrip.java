package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MakeMyTrip {

	public String Base_url = "http://www.makemytrip.com";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;

	@BeforeTest
	public void BrowserType() {

		System.out.println("Launching Amazon Page");
		System.setProperty("webdriver.firefox.marionette", driverpath);
		driver = new FirefoxDriver();
		driver.get(Base_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void f() throws InterruptedException {

		WebElement from = driver.findElement(By.id("hp-widget__sfrom"));
		from.click();
		List<WebElement> drp = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content hp-widget__sfrom' AND @id='ui-id-1']"));
		for(WebElement var:drp)
		{
			System.out.println(var.getText());
			if(var.getText().equals("New Delhi, India "));
			{
				var.click();
				break;
			}
		}
		
	}
}
