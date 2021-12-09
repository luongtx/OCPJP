package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class DBInsert {
	public static void main(String[] args) {
		try (Connection connection = DBConnector.connectToDb();
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement.executeQuery("SELECT * FROM contact WHERE firstName=\"Michael\"")) {
			// first fetch the data and display it before the insert operation
			System.out.println("Before the insert");
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t" + resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}
			//inserting
			resultSet.moveToInsertRow();
			resultSet.updateString("firstName", "John");
			resultSet.updateString("lastName", "K.");
			resultSet.updateString("email", "john@abc.com");
			resultSet.updateString("phoneNo", "+19753186420");
			resultSet.insertRow();
			
			//after insert
			System.out.println("After the insert");
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			resultSet.beforeFirst();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t" + resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
