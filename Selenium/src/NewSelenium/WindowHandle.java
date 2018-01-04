package NewSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.amazon.in/s/ref=nb_sb_ss_i_6_7?url=search-alias%3Daps&field-keywords=adidas+shoes&sprefix=adidas+%2Caps%2C363&crid=3EXMAMJZOG2HS");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent_window = driver.getWindowHandle();
		
		System.out.println("Before Switching="+driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='result_2']/div/div[3]/div[1]/a/h2")).click();
		
		Set<String> S1 = driver.getWindowHandles();
		
		
		Iterator<String> I1 = S1.iterator();
		
		while(I1.hasNext())
		{
			String child_window= I1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				
				Thread.sleep(1000);
				
				System.out.println("After Switching ="+ driver.getTitle());
				
				
				Select s1= new Select(driver.findElement(By.id("native_dropdown_selected_size_name")));
				s1.selectByIndex(1);
				
				//driver.findElement(By.id("native_dropdown_selected_size_name"));
				//driver.findElement(By.xpath(".//*[@id='native_dropdown_selected_size_name']"));
				
				
				WebElement login = driver.findElement(By.id("nav-link-yourAccount"));
				login.click();
				
				WebElement email = driver.findElement(By.id("ap_email"));
				email.sendKeys("9503566761");
				
				WebElement pass = driver.findElement(By.id("ap_password"));
				pass.sendKeys("0987QWErty");
				
				WebElement submit = driver.findElement(By.id("signInSubmit"));
				submit.click();
				
				
				driver.close();
			}
		}
		
		driver.switchTo().window(parent_window);
		
		System.out.println("Back to Parent Window="+ driver.getTitle());
		//driver.quit();
	}

}