package exceptions;
import java.io.IOException;
import java.sql.SQLException;

class MyResource implements AutoCloseable {
	@Override
	public void close() throws IOException {
		System.out.println("close1");
		throw new IOException("IOException1");
	}

	public void execute() throws SQLException {
		System.out.println("execute1");
		throw new SQLException("SQLException1");
	}
}

public class ExceptionGetSuppressed {
	public static void main(String[] args) {
		try (MyResource resource = new MyResource()) {
			resource.execute();
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println(e.getSuppressed()[0].getMessage());
//			System.out.println(e.getMessage());
		}
	}
}