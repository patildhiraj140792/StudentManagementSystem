package NewSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium12 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		
		
		
	}

}
