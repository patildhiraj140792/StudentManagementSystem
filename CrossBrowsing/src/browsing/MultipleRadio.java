package browsing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleRadio {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement>radio= driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		
		for(int i=0;i<radio.size();i++)
		{
			WebElement local_radio = radio.get(i);
			
			String value= local_radio.getAttribute("value");
			
			System.out.println("Values from radio button======>>>>"+value);
			
			
			if(value.equalsIgnoreCase("Java"))
			{
				local_radio.click();
			}
			
//			else if(value.equalsIgnoreCase("C#"))
//			{
//				local_radio.click();
//			}
//			else if(value.equalsIgnoreCase("Python"))
//			{
//				local_radio.click();
//			}
//			else if(value.equalsIgnoreCase("Ruby"))
//			{
//				local_radio.click();
//			}
			
			else
			{
				System.out.println("Error");
			}
		}
		
		
		
		
	}

}
