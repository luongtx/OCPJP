package exceptions;

import java.sql.SQLException;

public class ThrowNullExample {
    private static void m() throws SQLException {
//        try {
//            throw new SQLException();
//        } catch (Exception e) {
//            throw null; //Line 10
//        }
    	throw null;
    }
 
    public static void main(String[] args) {
        try {
            m(); //Line 16
        } catch(SQLException e) {
            System.out.println("Caught Successfully.");
        }
    }
}
