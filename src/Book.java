import java.lang.reflect.Field;
import java.util.Arrays;

enum Tweedle {
	DEE, DUM
}

public class Book {
	private long chapters = 0;
	private String[] characters = { "Alice", "White Rabbit" };
	private Tweedle twin = Tweedle.DEE;

	public static void main(String... args) {
		Book book = new Book();
		String fmt = "%6S:  %-12s = %s%n";

		try {
			Class<?> c = book.getClass();

			Field chap = c.getDeclaredField("chapters");
			System.out.format(fmt, "before", "chapters", book.chapters);
			chap.setLong(book, 12);
			System.out.format(fmt, "after", "chapters", chap.getLong(book));

			Field chars = c.getDeclaredField("characters");
			System.out.format(fmt, "before", "characters", Arrays.asList(book.characters));
			String[] newChars = { "Queen", "King" };
			chars.set(book, newChars);
			System.out.format(fmt, "after", "characters", Arrays.asList(book.characters));

			Field t = c.getDeclaredField("twin");
			System.out.format(fmt, "before", "twin", book.twin);
			t.set(book, Tweedle.DUM);
			System.out.format(fmt, "after", "twin", t.get(book));

			// production code should handle these exceptions more gracefully
		} catch (NoSuchFieldException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		}
	}
}