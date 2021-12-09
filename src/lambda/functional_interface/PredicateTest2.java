package lambda.functional_interface;

import java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args) {
		Predicate<String> notNull = ((Predicate<String>) (arg -> arg == null)).negate(); // #1
		System.out.println(notNull.test(null));

	}

}
