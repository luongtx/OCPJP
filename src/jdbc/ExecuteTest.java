package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class ExecuteTest {
	public static void main(String[] args) {
		String query = "DELETE FROM contact";
		try (Connection con = DBConnector.connectToDb(); Statement stm = con.createStatement()) {

			// return true if the first result is a ResultSet object; false if it is an
			// update count or there are no results
			System.out.println(stm.execute(query));
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
}
