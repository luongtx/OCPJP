package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class RelativeTest {
	public static void main(String[] args) {
		String query = "SELECT * from contact ORDER BY id";
		try (Connection con = DBConnector.connectToDb();
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

			ResultSet rs = stmt.executeQuery(query);
			/*
			 * doesn't throw any exception but keeps the cursor just before the 1st record
			 */
			rs.relative(-3);
			rs.relative(1);
			System.out.println(rs.getInt(1));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
