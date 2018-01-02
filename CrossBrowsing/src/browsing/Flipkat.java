package browsing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Flipkat {

	public String base_url = "https://www.flipkart.com/";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;

	@BeforeTest

	public void launchbrowser() {
		System.out.println("Launch");
		System.setProperty("webdriver.firefox.marionette", driverpath);
		driver = new FirefoxDriver();
		driver.get(base_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void f() throws Exception {

		WebElement search = driver.findElement(
				By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input"));
		search.sendKeys("boxer");

		WebElement click = driver.findElement(
				By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button"));
		click.click();

		WebElement High_to_low = driver.findElement(
				By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/section/ul/li[4]"));
		High_to_low.click();

		
		//Find Range 
		
		
		Actions action = new Actions(driver);

		WebElement drag = driver.findElement(By.xpath(
				".//*[@id='container']/div/div[1]/div/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[1]/div"));
		action.clickAndHold(drag).moveByOffset(50, 0).release().build().perform();


		//Scroll Down Page
		

		WebElement element = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div[3]/div[3]/div/a[2]"));
		element.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		
		
		
//		 JavaScriptExecuter je = (JavaScriptExecuter) driver;
//		
//		 ((JavaScriptExecuter)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)", drag);
//		 
//		 WebElement click_on_product = driver.findElement(By
//		 .xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div[3]/div/a[2]"));
//		 click_on_product.click();
		
		 Thread.sleep(2000);
		
	}

}
