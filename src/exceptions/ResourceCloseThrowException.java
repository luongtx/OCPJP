package exceptions;

class Resource1 implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Resource1");
	}

	public void m1() throws Exception {
		System.out.print("A");
		throw new Exception("B");
	}
}

class Resource2 implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Resource2");
	}

	public void m2() {
		System.out.print("D");
	}
}

public class ResourceCloseThrowException {
	public static void main(String[] args) {
		try (Resource1 r1 = new Resource1();) {
			System.out.println("Test");
		}
	}
}
