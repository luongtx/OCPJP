package class_design.interfaces.functional;

@FunctionalInterface
public interface AnnotationTest {
	// int bar();
	int foo();

	//method from object class
	boolean equals(Object object);

	default void bar() {

	}

	static void far() {

	}
}

@FunctionalInterface
interface SubInterface extends AnnotationTest {
	// abstract int bar();
}
