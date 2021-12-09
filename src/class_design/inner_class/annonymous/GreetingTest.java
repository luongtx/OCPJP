package class_design.inner_class.annonymous;

class Greetings {
	String greeting = "aa";

	void greet(String s) {

	}

	void greet() {
		System.out.println(greeting);
	}
}

public class GreetingTest {
	public static void main(String[] args) {
		Greetings obj = new Greetings() {
			void greet(String s) {
				System.out.println(greeting);
//				greet();
			}
		};
		obj.greet("Happy New Year!");
	}
}