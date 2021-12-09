package class_design.interfaces;

interface Interface1 {
	default public void foo() {
		System.out.println("Interface1's foo");
	}
}

interface Interface2 {
	default public void foo() {
		System.out.println("Interface2's foo");
	}
}

public class Diamond1 implements Interface1, Interface2 {

	public void foo() {
		Interface1.super.foo();
	}
	public static void main(String[] args) {
		new Diamond1().foo();
	}
}
