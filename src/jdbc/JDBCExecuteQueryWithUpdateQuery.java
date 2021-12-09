package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecuteQueryWithUpdateQuery {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "password";
		String query = "DELETE FROM MESSAGES";
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			rs.next();
			System.out.println(rs.getInt(1));
		}
		/*
		 * executeQuery can't accept update, delete, insert query
		 */
	}
}
