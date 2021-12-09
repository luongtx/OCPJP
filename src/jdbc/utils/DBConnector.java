package jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {
	public static Connection connectToDb() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/addressBook";
		Properties prop = new Properties();
		prop.put("user", "luong");
		prop.put("password", "luong");
		return DriverManager.getConnection(url, prop);
	}
}
