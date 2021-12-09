package concurency.parallel_stream;

import java.util.ArrayList;
import java.util.List;

class Book {
	String isbn;
	double price;

	Book(String isbn, double price) {
		this.isbn = isbn;
		this.price = price;
	}

	public String toString() {
		return "Book[" + isbn + ":" + price + "]";
	}
}

public class ReduceTest3 {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("9781976704031", 9.99));
		books.add(new Book("9781976704032", 15.99));

		Book b = books.stream().reduce(new Book("9781976704033", 0.0), (b1, b2) -> {
			b1.price = b1.price + b2.price;
			return new Book(b1.isbn, b1.price);
		});

		books.add(b);
		books.parallelStream().reduce((x, y) -> x.price > y.price ? x : y).ifPresent(System.out::println);
	}
}
