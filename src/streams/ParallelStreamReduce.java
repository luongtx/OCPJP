package streams;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamReduce {
	public static void main(String[] args) {
		List<String> nums = Arrays.asList("EE", "SE");
		String ans = nums.parallelStream().reduce("Java ", (a, b) -> a.concat(b));
		System.out.println(ans);
	}
	/*
	 * note: Encounter order
	 */
}
