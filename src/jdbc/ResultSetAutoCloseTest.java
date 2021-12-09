package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.utils.DBConnector;

public class ResultSetAutoCloseTest {
	public static void main(String[] args) throws SQLException {
		String query = "SELECT * from contact ORDER BY id";
		try (Connection con = DBConnector.connectToDb();
				Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {

			ResultSet res1 = stmt.executeQuery("SELECT * FROM contact ORDER BY ID");
			//res1 will get closed after 2nd executeQuery method is executed.
			ResultSet res2 = stmt.executeQuery("SELECT * FROM contact ORDER BY ID DESC");
			
			res1.next();
			System.out.println(res1.getInt(1));
			res2.next();
			System.out.println(res2.getInt(1));
		}
	}
}
