package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edit_Cust_Guru99 {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/V4/manager/DeleteCustomerInput.php");
		
		driver.manage().window().maximize();
		
		WebElement cust_id = driver.findElement(By.name("cusid"));
		cust_id.sendKeys("76487");
		
		WebElement submit = driver.findElement(By.name("AccSubmit"));
		submit.click();
		
		
	}

}
