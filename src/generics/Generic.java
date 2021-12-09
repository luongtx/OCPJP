package generics;
public class Generic<T> {
	public static void main(String[] args) {
		Generic<String> g = new Generic<>();
	}
}

class A {
}

class B extends A {
}

class C extends B {
}

class D<C> {
// INSERT CODE HERE
	// C c1 = new A();
	// C c2 = new B();
	// C c3 = new C();
}
