package lambda.functional_interface;

import java.util.function.Consumer;

public class ConsumerAndThenTest {
	public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::print;
        Integer i = 5;
        consumer.andThen(consumer).accept(i++); //Line 7
        
	}
}
