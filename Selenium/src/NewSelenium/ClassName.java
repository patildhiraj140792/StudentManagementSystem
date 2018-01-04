package NewSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.amazon.in/s/ref=nb_sb_ss_i_6_7?url=search-alias%3Daps&field-keywords=adidas+shoes&sprefix=adidas+%2Caps%2C363&crid=3EXMAMJZOG2HS");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String parent_window=driver.getWindowHandle();
		
		
		System.out.println("Before Switching="+driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div[3]/div[1]/a/h2")).click();
		
		Set <String> s1 = driver.getWindowHandles();
		
		Iterator<String>i1 = s1.iterator();
		
		
		while(i1.hasNext())
		{
			String child_window = i1.next();
			
			if(!parent_window.equalsIgnoreCase(child_window))
			{
				
				driver.switchTo().window(child_window);
				
				Thread.sleep(1000);
				
				System.out.println("After Switching="+driver.getTitle());
				
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parent_window);
		
		System.out.println("Back To Parent Window="+driver.getTitle());

	}

}
