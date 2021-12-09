package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import jdbc.utils.DBConnector;

public class CallableStatementTest {
	public static void main(String[] args) {

		String sql = "";
		try (Connection conn = DBConnector.connectToDb(); CallableStatement cb = conn.prepareCall(sql)) {

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
