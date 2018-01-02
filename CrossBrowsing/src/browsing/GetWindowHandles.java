package browsing;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException, Exception {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		String base_url = "http://demo.guru99.com/popup.php";

		driver.get(base_url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		String Main_window = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String child_win = i1.next();

			if (!Main_window.equalsIgnoreCase(child_win)) {
				driver.switchTo().window(child_win);

				driver.findElement(By.name("emailid")).sendKeys("patil.dhiraj1407@gmail.com");
		

				Thread.sleep(2000);

				driver.findElement(By.name("btnLogin")).click();

				Thread.sleep(2000);

				TakesScreenshot ts = (TakesScreenshot) driver;

				File source = ts.getScreenshotAs(OutputType.FILE);

				FileUtils.copyFile(source, new File("./ScreenShot/IDs.png"));

				System.out.println("Screenshot Taken");

				driver.close();
			}
		}
		driver.switchTo().window(Main_window);
	}

}
