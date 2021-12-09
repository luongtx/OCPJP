package generics;

class BoxPrinter<T> {
	private T val;

	public BoxPrinter(T arg) {
		val = arg;
	}

	public String toString() {
		return "[" + val + "]";
	}
}

class BoxPrinterTest {
	public static void main(String[] args) {
		BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(10);
		System.out.println(value1);
	}
}
