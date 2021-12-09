package exceptions;

import java.util.Scanner;

public class TryWithResource1Test {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String s = scan.nextLine();
			System.out.println(s);
			// Resources used in try-with-resources statement are implicitly final
			scan = null;
		}
	}
}
