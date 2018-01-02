package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {

	WebDriver driver;

	@BeforeTest
	public void start(){
	
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		driver = new FirefoxDriver();
	}
	

	@Test
	public void Test() {
		
		 driver.get("http://www.jqueryui.com/datepicker/");
		  driver.switchTo().frame(0);
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  //Click on textbox so that datepicker will come
		  driver.findElement(By.id("datepicker")).click();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  //Click on next so that we will be in next month
		  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
		  
		  /*DatePicker is a table.So navigate to each cell 
		   * If a particular cell matches value 13 then select it
		   */
		  WebElement dateWidget = driver.findElement(By.id("ui-datepicker-div"));
		  List <WebElement>rows=dateWidget.findElements(By.tagName("tr"));
		  List <WebElement>columns=dateWidget.findElements(By.tagName("td"));
		  
		  for (WebElement cell: columns){
		   //Select 13th Date 
		   if (cell.getText().equals("13")){
		   cell.findElement(By.linkText("13")).click();
		   break;
		   }
		  } 
		 }

	}
