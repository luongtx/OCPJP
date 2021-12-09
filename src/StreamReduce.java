import java.util.Arrays;

public class StreamReduce {
	public static void main(String[] args) {
		String s1 = Arrays.asList("A", "E", "I", "O", "U").stream().reduce("", String::concat);
//		String s1 = Arrays.asList("A", "E", "I", "O", "U").stream().reduce("a", String::concat);
		String s2 = Arrays.asList("A", "E", "I", "O", "U").parallelStream().reduce("", String::concat);
//		String s2 = Arrays.asList("A", "E", "I", "O", "U").parallelStream().reduce("a", String::concat);
		System.out.println(s1.equals(s2));
	}
}
