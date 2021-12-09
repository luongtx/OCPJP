package exceptions;

class UserException extends Exception {

}

class Parent {
	public Parent() throws UserException {

	}

	void work() {

	}
}

class Child extends Parent {
	String name;

	Child(String name) throws UserException {
		this.name = name;
	}
}

public class Test {
	public static void main(String[] args) {

	}
}
