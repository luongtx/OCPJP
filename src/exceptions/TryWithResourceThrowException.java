package exceptions;

import java.io.IOException;

class MyResource2 implements AutoCloseable {
	public void execute() {
		System.out.println("Executing");
	}

	@Override
	public void close() throws IOException {
		System.out.println("Closing");
	}
}

public class TryWithResourceThrowException {
	public static void main(String[] args) {
		try (MyResource2 resource = new MyResource2()) {
			resource.execute();
		}
	}
}
