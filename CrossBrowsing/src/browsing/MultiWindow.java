package browsing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultiWindow {
	WebDriver driver;

	@Test
	public void MultiWin() throws Exception {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String parent_window = driver.getWindowHandle();
		
		WebElement TextBox = driver.findElement(By.id("twotabsearchtextbox"));
		TextBox.sendKeys("sony head set");
		
		Thread.sleep(2000);
		
		WebElement Search = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		Search.click();
		
		Thread.sleep(2000);
		
		WebElement click_product = driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		click_product.click();
		
		Thread.sleep(2000);
		
		Set<String> S1 = driver.getWindowHandles();
		
		Iterator<String> I1 = S1.iterator();
		
		while(I1.hasNext())
		{
			String Child_window = I1.next();
			
			if(!parent_window.equalsIgnoreCase(Child_window))
			{
				driver.switchTo().window(Child_window);
				Thread.sleep(2000);
			}
			driver.close();
		}
		driver.switchTo().window(parent_window);
		Thread.sleep(2000);
		

	}
}
