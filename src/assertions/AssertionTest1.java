package assertions;

public class AssertionTest1 {
	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		if (i < 0) {
			i = -i;
		}

		System.out.println("the value of i is: " + i);
		assert (i >= 0) : "impossible: i is negative";
//		assert (i < 0) : "i is negative";
	}
}
