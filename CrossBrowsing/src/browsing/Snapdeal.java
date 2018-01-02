package browsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {

	public String baseurl = "http://www.snapdeal.com";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;

	@Test
	public void f() {
		System.out.println("Launching Browser");

		System.setProperty("webdriver.firefox.marionette", driverpath);

		driver = new FirefoxDriver();

		Reporter.log("Browser Opened");

		driver.get(baseurl);
		
		WebElement login = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		login.click();
		
		WebElement user_name = driver.findElement(By.xpath("//input[@id='userName' AND @name='username']"));
		user_name.sendKeys("dgdhdhfhfthn");
		
		if(user_name.isDisplayed())
		{
			System.out.println("Element is Displayed");
		}
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='checkUser' AND @class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
		submit.click();
		
	}
}
