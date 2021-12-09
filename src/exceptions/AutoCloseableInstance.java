package exceptions;
class MyClass implements AutoCloseable {
	int test;

	public void close() throws Exception {
		System.out.println("closed");
	}

	public void print() {
		System.out.println("luong");
	}
}

public class AutoCloseableInstance {
	public static void main(String[] args) throws Exception {

		MyClass obj = null;
		try (MyClass obj1 = new MyClass()) {
			obj1.test = 100;
			obj = obj1;
		}
		obj.close();
		System.out.println(obj.test);
		obj.print();
	}
}
