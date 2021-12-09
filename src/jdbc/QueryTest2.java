package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class QueryTest2 {
	public static void main(String[] args) throws SQLException {
		String query = "SELECT firstName as name, lastName as name FROM contact";
		try (Connection con = DBConnector.connectToDb();
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery(query);) {
			int colCount = rs.getMetaData().getColumnCount();
			for (int i = 1; i <= colCount; i++) {
				System.out.println(rs.getString(i));
			}
		}
	}
}
