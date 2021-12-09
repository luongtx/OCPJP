package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class DBUpdate {
	static void updateWithStatement() {
		try (Connection connection = DBConnector.connectToDb();
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				ResultSet resultSet = statement.executeQuery("SELECT * FROM contact WHERE firstName=\"Michael\"")) {
			// first fetch the data and display it before the update operation
			System.out.println("Before the update");
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t" + resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}
			// now update the resultset and display the modified data
			resultSet.absolute(1);
			resultSet.updateString("phoneNo", "+919976543210");
			// reflect those changes back to the database
			// by calling updateRow() method
			resultSet.updateRow();
			System.out.println("After the update");
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

	static void updateWithPreparedStatement() {
		try (Connection conn = DBConnector.connectToDb();
				PreparedStatement ps = conn.prepareStatement("SELECT * FROM contact WHERE firstName=?")) {
			ps.setString(1, "Michael");
			ResultSet rs = ps.executeQuery();
			System.out.println("Before the update");
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("firstName") + "\t" + rs.getString("lastName")
						+ "\t" + rs.getString("email") + "\t" + rs.getString("phoneNo"));
			}

			rs.absolute(1);
			rs.updateString(1, "+84353943399");
			rs.updateRow();
			System.out.println("After the update");
			System.out.println("id \tfName \tlName \temail \t\tphoneNo");
			
			rs.beforeFirst();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + "\t" + rs.getString("firstName") + "\t" + rs.getString("lastName")
						+ "\t" + rs.getString("email") + "\t" + rs.getString("phoneNo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		updateWithPreparedStatement();
	}

}
