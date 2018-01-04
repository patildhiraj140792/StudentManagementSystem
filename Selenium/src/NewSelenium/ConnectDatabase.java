package NewSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mysql.jdbc.Statement;

public class ConnectDatabase {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
			System.setProperty("webdriver.firefox.marionette",
					"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
			Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Driver Loaded");
		 
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","0987QWErty");
		 System.out.println("Connected to mysql DB");

		 PreparedStatement Prestmt = con.prepareStatement("select * from seleniumuser where salary > ? and firstname = ?");
		 
		 Prestmt.setInt(1, 5000);
		 Prestmt.setString(2,"Dhiraj");
		 
		 ResultSet rs = Prestmt.executeQuery();
		 
		 System.out.println("Result is ==>"+rs);

//		 Statement stm = (Statement) con.createStatement();
//		 
//		 ResultSet rs = stm.executeQuery("select * from seleniumuser");
//		 
//		 while(rs.next())
//		 {
//			 String firstname = rs.getString("firstname");
//			 System.out.println("database record is="+firstname);
//			 
//			 String email = rs.getString("Email");
//			 System.out.println("Email==>"+email);
//		 }
	}
}
