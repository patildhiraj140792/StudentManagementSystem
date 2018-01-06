package NewSelenium;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CheckMultipleBoxces 
{
	@BeforeTest
	public void setproperty() 
	{
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
	}
	@Test
	public void checkbox() throws InterruptedException, IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement First_name = driver.findElement(By.xpath("//input[@name='firstname']"));
		First_name.sendKeys("Dhiraj");

		WebElement Last_name = driver.findElement(By.xpath("//input[@name='lastname']"));
		Last_name.sendKeys("Patil");

		List<WebElement> Gender = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio button in a webpage is=" + Gender.size());

		for (int j = 0; j < Gender.size(); j++) 
		{
			WebElement local_radio = Gender.get(j);
			String value = local_radio.getAttribute("value");
			if (value.equalsIgnoreCase("Male")) 
			{
				local_radio.click();
			} 
			else if (value.equalsIgnoreCase("2")) 
			{
				local_radio.click();
			}
		}

		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("05/01/2018");

		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,930)");

		List<WebElement> chk_box = driver.findElements(By.xpath("//input[@type='checkbox']"));
		// System.out.println("Total checkboxes in a webpage
		// is="+chk_box.size());

		for (int i = 0; i < chk_box.size(); i++) 
		{
			WebElement total = chk_box.get(i);
			String value = total.getAttribute("value");
			if (value.equalsIgnoreCase("Manual Tester")) 
			{
				total.click();
			} 
			else if (value.equalsIgnoreCase("Selenium Webdriver")) 
			{
				total.click();
			}
		}
		
		Select continents = new Select(driver.findElement(By.name("continents")));
		continents.selectByIndex(1);
		
		
		WebElement browser = driver.findElement(By.xpath("//input[@class='input-file']"));
		browser.click();
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\AutoIT\\image.exe");
		
		
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("window.scrollBy(0,930)");
		
		List<WebElement> Commands = driver.findElements(By.xpath("//select[@name='selenium_commands']"));
		
		for(int l=0;l<Commands.size();l++)
		{
			WebElement comm = Commands.get(l);
			String local_comm = comm.getAttribute("name");
			if(local_comm.equalsIgnoreCase("Navigation Commands"))
			{
				comm.click();
			}
		}
		
		
	}
}
