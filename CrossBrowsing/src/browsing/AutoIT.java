package browsing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		driver.get("file:///C:/Users/admin/Desktop/fileupload.html");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\AutoIT\\Uploading.exe");
	}

}
