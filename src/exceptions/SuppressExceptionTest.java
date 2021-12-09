package exceptions;

import java.io.IOException;
import java.sql.SQLException;

class MyResource implements AutoCloseable {
    @Override
    public void close() throws IOException{
        throw new IOException("IOException");
    }
 
    public void execute() throws SQLException {
        throw new SQLException("SQLException");
    }
}
public class SuppressExceptionTest {
    public static void main(String[] args) {
        try(MyResource resource = new MyResource()) {
        	//SQLException is throw before IOException which get suppressed
            resource.execute();
        } catch(Exception e) {
            System.out.println(e.getSuppressed()[0].getMessage());
        }
    }
}
