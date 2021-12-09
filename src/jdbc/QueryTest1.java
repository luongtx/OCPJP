package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class QueryTest1 {
	public static void main(String[] args) {
		try (Connection connection = DBConnector.connectToDb();
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = statement.executeQuery("SELECT firstName as name, lastName as name FROM contact")) {
			rs.relative(1);
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("name"));
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
