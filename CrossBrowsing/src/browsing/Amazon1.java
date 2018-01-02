package browsing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amazon1 {

	public String baseurl = "http://www.amazon.in";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;

	@Test
	public void f() throws Exception {

		System.out.println("Launching Browser");
		System.setProperty("webdriver.firefox.marionette", driverpath);

		driver = new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("nike shose for men");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"))));
		
		WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		
		
		
		
		Thread.sleep(5000);
		
		String main_window = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();
		
		while(I1.hasNext())
		{
			String child_window = I1.next();
			if(!main_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println("child Window");
				driver.close();
			}
		}
		driver.switchTo().window(main_window);
		System.out.println("Return to the Main Page");
		
	}
}
