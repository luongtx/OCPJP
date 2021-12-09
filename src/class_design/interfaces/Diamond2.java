package class_design.interfaces;

class BaseClass {
	public void foo() {
		System.out.println("BaseClass's foo");
	}
}

interface BaseInterface {
	default public void foo() {
		System.out.println("BaseInterface's foo");
	}
}

public class Diamond2 extends BaseClass implements BaseInterface {
	public static void main(String[] args) {
		new Diamond2().foo();
	}
}
