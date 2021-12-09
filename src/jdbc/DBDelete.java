package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class DBDelete {
	public static void main(String[] args) {
		try (Connection connection = DBConnector.connectToDb();
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet1 = statement.executeQuery("SELECT * FROM contact WHERE firstName=\"John\"")) {
			if (resultSet1.next()) {
				// delete the first row
				resultSet1.deleteRow();
			}
			resultSet1.close();
			// now fetch again from the database
			try (ResultSet resultSet2 = statement.executeQuery("SELECT * FROM contact")) {
				System.out.println("After the deletion");
				System.out.println("id \tfName \tlName \temail \t\tphoneNo");
				while (resultSet2.next()) {
					System.out.println(resultSet2.getInt("id") + "\t" + resultSet2.getString("firstName") + "\t"
							+ resultSet2.getString("lastName") + "\t" + resultSet2.getString("email") + "\t"
							+ resultSet2.getString("phoneNo"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
