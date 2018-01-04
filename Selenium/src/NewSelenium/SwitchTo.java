package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.selenesedriver.FindElement;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement navbar = driver.findElement(By.id("navbar"));
		
		
		navbar.findElement(By.id("twotabsearchtextbox")).sendKeys("Adidas shoes");
		Thread.sleep(3000);
		
		navbar.findElement(By.id("nav-search-submit-text")).click();
		
		driver.findElement(By.id("result_0")).findElement(By.tagName("a")).click();
		
		driver.findElement(By.id("submit.add-to-cart")).findElement(By.tagName("i")).click();
		// driver.getWindowHandle().
		
}

}
