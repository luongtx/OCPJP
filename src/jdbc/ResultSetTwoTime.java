package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class ResultSetTwoTime {
	public static void main(String[] args) throws SQLException {
		Connection con = DBConnector.connectToDb();
		String query = "select * from employee";
		try (Statement stm = con.createStatement()) {
			ResultSet rs = stm.executeQuery(query);
			rs = stm.executeQuery("select id from contact");
			while (rs.next()) {
				System.out.println("Contact ID: " + rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
