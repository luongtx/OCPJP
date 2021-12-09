package generics.methods;

class Foo<K, V> {
	private K key;
	private V value;

	public Foo(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public static <T> Foo<T, T> twice(T value) {
		return new Foo<T, T>(value, value);
	}
}

public class GenericsMethodTest {
	public static void main(String[] args) throws InterruptedException {

//    	 Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100); 
//    	 Foo<String, String> pair = Foo.<String>twice ("Hello World!"); 
		Foo<Object, Object> percentage = new Foo<String, Integer>("Steve", 100);
//    	 Foo<String, String> grade = new Foo <> ("John", "A"); 

	}
}