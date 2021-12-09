package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class UpdateRow {
	public static void main(String[] args) throws SQLException {
		String query = "SELECT firstName as name, lastName as name FROM contact";
		try (Connection con = DBConnector.connectToDb();
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = stmt.executeQuery(query);) {
			rs.afterLast();
			rs.relative(1);
//			rs.updateString(2, "luong");
			rs.updateRow();
		}
	}
}
