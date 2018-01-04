package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWbsite {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.Amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Adidas shoes");
		
		driver.findElement(By.id("issDiv0")).click();
		
		driver.findElement(By.xpath(".//*[@id='result_1']/div/div[3]/div[1]/a/h2")).click();
		
		driver.findElement(By.xpath(".//*[@id='recommendations']/ul/li[2]/span/div[1]/a/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='nav-subnav']/a[3]/span[1]")).click();
		
		driver.findElement(By.xpath(".//*[@id='contentGrid_102226']/div/div[3]/div[4]/div/div/a/img")).click();
		
		
		
		
		
	}

}
