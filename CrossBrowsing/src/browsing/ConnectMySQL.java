package browsing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.testng.annotations.Test;

public class ConnectMySQL {
	
		@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
			System.setProperty("webdriver.firefox.marionette",
					"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
			Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Driver Loaded");
		 
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","0987QWErty");
		 System.out.println("Connected to mysql DB");
	}
}
