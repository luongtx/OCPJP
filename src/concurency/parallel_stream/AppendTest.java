package concurency.parallel_stream;

import java.util.Arrays;
import java.util.List;

public class AppendTest {
    private static StringBuilder RES = new StringBuilder();
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");
        list.parallelStream().forEach(RES::append);
        System.out.println(RES);
    }
}
