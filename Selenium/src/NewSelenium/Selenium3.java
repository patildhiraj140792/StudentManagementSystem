package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium3 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("Leonardo DeCaprio");
		
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).submit();
		
		
		
		//driver.quit();
	}

}
