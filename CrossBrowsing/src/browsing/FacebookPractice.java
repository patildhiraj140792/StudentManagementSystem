package browsing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Login Page Code
		
		WebElement sign_in = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		sign_in.click();
		
		WebElement user_name = driver.findElement(By.id("ap_email"));
		user_name.sendKeys("9503566761");
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("0987QWErty");
		
		WebElement login = driver.findElement(By.id("signInSubmit"));
		login.click();
		
		
		// HomePage Code
		
		
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("nike studs for football");
		
		WebElement proceed = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		proceed.click();
		
		//WebElement next = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		//next.click();
		
		String parent_window = driver.getWindowHandle();
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();
		
		while(I1.hasNext())
		{
			String child_window = I1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				
				WebElement click_stud = driver.findElement(By.id("add-to-cart-button"));
				click_stud.click();
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parent_window);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
