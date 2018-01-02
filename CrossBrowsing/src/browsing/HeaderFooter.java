package browsing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderFooter {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/admin/Desktop/file11.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath(".//*[@id='my-file']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\Java+Selenium\\AutoIT\\Scripts folder\\file11.exe");
		
	}

}
