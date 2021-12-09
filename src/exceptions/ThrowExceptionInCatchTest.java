package exceptions;

import java.sql.SQLException;

public class ThrowExceptionInCatchTest {
    private static void m1() throws SQLException {
        try {
            throw new SQLException(new SQLException(new SQLException()));
        } catch (Exception e) {
        	// compiler know that e only be SQLException
            throw e;
        }
    }
    
    private static void m2() throws SQLException {
        try {
            throw new SQLException(new SQLException(new SQLException()));
        } catch (Exception e) {
        	e = new SQLException();
        	// compiler don't know instant of e
            throw e;
        }
    }
 
    public static void main(String[] args) {
        try {
            m1();
        } catch(SQLException e) {
            System.out.println("Caught Successfully.");
        }
    }
}
