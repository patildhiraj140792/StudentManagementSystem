package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JqueryButton {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/button/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		System.out.println(iframe.getSize());
		
		driver.switchTo().frame(iframe);
		
		WebElement button = driver.findElement(By.tagName("button"));
		System.out.println(button.getSize());
		
		List<WebElement> btn_size = driver.findElements(By.tagName("button"));
		for(int i=0;i<btn_size.size();i++)
		{
			WebElement clickbutton = btn_size.get(i);
			String button_find = clickbutton.getAttribute("value");
			if(button_find.equalsIgnoreCase("A button element"));
			{
				clickbutton.click();
			}
		}
	}

}
