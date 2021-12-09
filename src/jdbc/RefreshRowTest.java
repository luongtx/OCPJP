package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class RefreshRowTest {
	public static void main(String[] args) {
		String query = "SELECT * from contact ORDER BY id";
		try (Connection con = DBConnector.connectToDb();
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
			ResultSet rs = stmt.executeQuery(query);
			rs.absolute(-5);
			rs.moveToInsertRow();
//			rs.updateInt(1, 105);
			rs.updateString(2, "Chris");
			rs.updateString(3, "Lee");
			rs.updateString(4, "Chris@gmail.com");

			/*
			 * If the cursor is at insert row and refreshRow() or updateRow() or deleteRow()
			 * method is called, then SQLException is thrown.
			 */
			rs.insertRow(); // Line n2
//			rs.updateRow();
//			rs.next();
//			rs.absolute(1);
//			rs.refreshRow(); // Line n1
			rs.moveToCurrentRow();
			System.out.println(rs.getString(2)); // Line n3
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
