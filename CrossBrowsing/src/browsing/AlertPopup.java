package browsing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		
		// Alert Message handling
		
		String base_url = "http://demo.guru99.com/selenium/delete_customer.php";
		
		driver.get(base_url);
		driver.manage().window().maximize();
		
		WebElement cust_id = driver.findElement(By.name("cusid"));
		cust_id.sendKeys("53920");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		
		 // Switching to Alert 
		
		Alert alert = driver.switchTo().alert();
		
		
		 // Switching to Alert 
		
		String alrt_msg = driver.switchTo().alert().getText();
		
		// Displaying alert message
		
		System.out.println(alrt_msg);
		Thread.sleep(2000);
		
		
		// Accepting alert	
		
		alert.accept();
	}

}
