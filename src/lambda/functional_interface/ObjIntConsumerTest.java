package lambda.functional_interface;

import java.util.function.ObjIntConsumer;

public class ObjIntConsumerTest {
	public static void main(String[] args) {
		ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i); // #1
		System.out.println(charAt.accept("java", 2));

	}
}
