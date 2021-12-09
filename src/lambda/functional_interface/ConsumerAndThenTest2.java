package lambda.functional_interface;

import java.util.function.Consumer;

class Counter {
    static int count = 5;
}

public class ConsumerAndThenTest2 {
	public static void main(String[] args) {
        Consumer<Integer> add = i -> Counter.count += i;
        Consumer<Integer> print = System.out::println;
        add.andThen(print).accept(10); //Line 10
	}
}
