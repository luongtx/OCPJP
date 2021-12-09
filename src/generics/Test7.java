package generics;

public class Test7 {
	private static final <X extends Integer, Y extends Integer> void add(X x, Y y) {
		System.out.println(x + y);
	}

	
	public static void main(String[] args) {
		add(10, 20);
	}

}
