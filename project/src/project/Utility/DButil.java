package project.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author Shubham
 *@see DButil class is regarding to make the connection between sts and mysql database
 */

public class DButil {
/**
 * The provideConnection method provide us the connections by using jdbc driver and username and password of mysql database
 * @return Connection
 */
public static Connection provideConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url= "jdbc:mysql://localhost:3306/web20";
		
		try {
			conn = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}
}
