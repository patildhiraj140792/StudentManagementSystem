package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multicheck {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Java+Selenium\\chromedriver_win32.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriver driver1 = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio' and  @name='lang']"));
		for(int i=0;i<radio.size();i++)
		{
			WebElement radio_check = radio.get(i);
			String value = radio_check.getAttribute("value");
			System.out.println("Radio Button " +value);
			if(value.equalsIgnoreCase("Python"))
			{
				radio_check.click();
			}
		}
		
		Thread.sleep(2000);
		
//		List<WebElement>check = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(int j=0;j<check.size();j++)
//		{
//			WebElement check_Box = check.get(j);
//			String value1 = check_Box.getAttribute("id");
//			System.out.println("Check Boxes  "+value1);
//			if(value1.equalsIgnoreCase("male"))
//			{
//				check_Box.click();
//			}
//		}
		

	}

}
