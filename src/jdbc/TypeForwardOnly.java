package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class TypeForwardOnly {
	public static void main(String[] args) {
		String query = "SELECT * FROM contact";
		try (Connection con = DBConnector.connectToDb();
				Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);) {
			ResultSet rs = stmt.executeQuery(query);
			int totalRows = 0;
			while (rs.next()) {
				totalRows++;
			}
			System.out.println(totalRows);
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int totRows = rsmd.getRowCount();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
