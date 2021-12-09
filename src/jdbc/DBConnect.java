package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static void main(String[] args) {
		// URL points to JDBC protocol: mysql subprotocol;
		// localhost is the address of the server where we installed our
		// DBMS (i.e. on local machine) and 3306 is the port on which
		// we need to contact our DBMS
		String url = "jdbc:mysql://localhost:3306/";
		// we are connecting to the addressBook database we created earlier
		String database = "addressBook";
		// we login as "root" user with password "mysql123"
		String userName = "luong";
		String password = "luong";
		try (Connection connection = DriverManager.getConnection(url + database, userName, password)) {
			System.out.println("Database connection: Successful");
		} catch (Exception e) {
			System.out.println("Database connection: Failed");
			e.printStackTrace();
		}
	}
}
