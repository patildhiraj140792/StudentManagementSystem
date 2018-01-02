package browsing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		String parent_win = driver.getWindowHandle();
		
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("adidas originals shoes for men");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		submit.click();
		
		Thread.sleep(2000);
		
		WebElement click1 = driver.findElement(By.xpath(".//*[@id='result_3']/div/div[3]/div[1]/a/h2"));
		click1.click();
		
		Thread.sleep(2000);
		
		Set<String> S1 = driver.getWindowHandles();
		
		Iterator<String> I1 = S1.iterator();
		
		while(I1.hasNext())
		{
			String Child_win = I1.next();
			
			if(!parent_win.equalsIgnoreCase(Child_win))
			{
				driver.switchTo().window(Child_win);
				Thread.sleep(2000);
			}
			
			driver.close();
		}
		
		driver.switchTo().window(parent_win);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
