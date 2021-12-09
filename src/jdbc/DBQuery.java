package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class DBQuery {
	public static void main(String[] args) {
// Get connection, execute query, get the result set
// and print the entries from the result rest
		try (Connection connection = DBConnector.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")) {
			System.out.println("ID \tfName \tlName \temail \t\tphoneNo");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("ID") + "\t" + resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t" + resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}
//			System.out.println(resultSet.getMetaData().getColumnCount());
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1);
		}
	}
}
