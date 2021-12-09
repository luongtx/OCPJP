package concurency.parallel_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ForEachOrderedTest {
	public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        IntStream stream = IntStream.rangeClosed(1, 7);
        stream.parallel().map(x -> {
            list.add(x); //Line 13
            return x;
        }).forEachOrdered(System.out::print); //Line 15
        System.out.println();
        list.forEach(System.out::print); //Line 17
	}
}
