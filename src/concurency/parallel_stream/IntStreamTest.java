package concurency.parallel_stream;
import java.util.stream.IntStream;
 
public class IntStreamTest {
    public static void main(String[] args) {
	int res = IntStream.rangeClosed(1, 1000).parallel()
                .filter( i -> i > 50).findFirst().getAsInt();
        System.out.println(res);
    }
    /*
     * base stream is sequential ordered IntStream (it has specific Encounter Order), 
     * hence findFirst() method will always return 51 regardless of whether the stream is sequential or parallel. 
     */
}
