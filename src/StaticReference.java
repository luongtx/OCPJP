import java.util.Arrays;
import java.util.List;

class Product {
	String name;
	int qty;

	@Override
	public String toString() {
		return name;
	}

	public Product(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}

	static class ProductFilter {
		public static boolean isAvalable(Product p) {
			return p.qty >= 10;
		}
	}
}

public class StaticReference {
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Math", 5), new Product("Speakder", 10));
		products.stream().filter(Product.ProductFilter::isAvalable).forEach(System.out::println);
	}
}
