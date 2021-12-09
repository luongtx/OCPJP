package lambda;

interface Operator<T> {
	public abstract T operation(T t1, T t2);
}

public class GenericLambdaTest {
	public static void main(String[] args) {
		System.out.println(new Operator<String>() {
			public String operation(String s1, String s2) {
				return s1 + s2;
			}
		});

		System.out.println((String s1, String s2) -> s1 + s2); // no target type
	}
}