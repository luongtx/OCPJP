package exceptions;

class Res1 implements AutoCloseable {
	public void m1() throws Exception {
		System.out.print("A");
		throw new Exception("B");
	}

	public void close() {
		System.out.print("C");
	}
}

class Res2 implements AutoCloseable {
	public void m2() {
		System.out.print("D");
	}

	public void close() throws Exception {
		System.out.print("E");
	}
}

public class ResourceOrder {
	public static void main(String[] args) {
		
		/* r1.m1(); prints 'A' on to the console. 
		An exception (with message 'B') is thrown so close methods are invoked. 
		*/ 
		try (Res1 r1 = new Res1(); Res2 r2 = new Res2()) {
			r1.m1();
			r2.m2();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
