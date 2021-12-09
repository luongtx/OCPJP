package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class SetMaxRowsTest {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnector.connectToDb();
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT * FROM contact");
			st.setMaxRows(1);
			ResultSet rs = st.getResultSet();
			rs.absolute(3);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
		} catch (SQLException ex) {
			System.out.print("SQLException is thrown.");
		}
	}
}
