package browsing;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook {
	
	public String URL = "http://www.facebook.com";
	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  System.out.println("Launching Facebook Page");
	  System.setProperty("webdriver.firefox.marionette", driverpath);
	  
	  driver = new FirefoxDriver();
	  driver.get(URL);
	  
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	 WebElement email = driver.findElement(By.id("email"));
	 email.sendKeys("dhiraj.patil.752487");
	 
	 WebElement password = driver.findElement(By.id("pass"));
	 password.sendKeys("0987QWErty");
	 
	 WebElement login = driver.findElement(By.id("u_0_2"));
	 login.click();
	  
	 
	 Thread.sleep(5000);
	 
	 WebElement logout = driver.findElement(By.id("userNavigationLabel"));
	 logout.click();
	 
	 
	  
  }
}
