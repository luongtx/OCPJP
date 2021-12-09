package exceptions;
import java.util.Scanner;

public class ResourceInTryTest {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String s = scan.nextLine();
			System.out.println(s);
			scan = null;
		}
	}
}
