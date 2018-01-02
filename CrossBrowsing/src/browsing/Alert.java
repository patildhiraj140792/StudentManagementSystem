package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.NoAlertPresentException;	

public class Alert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		String base_url = "http://www.demo.guru99.com/selenium/delete_customer.php " ;

		driver.get(base_url);

		driver.manage().window().maximize();

		
		
		Alert alert = (Alert) driver.switchTo().alert();
		
		String alertmsg = driver.switchTo().alert().getText();
		
		System.out.println(alertmsg);
		
		Thread.sleep(5000);
		
		((org.openqa.selenium.Alert) alert).accept();

		
	}

}
