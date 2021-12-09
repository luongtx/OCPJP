package class_design.inner_class.member;

public class Member2 {
	int a = 1;

	class A {
		void m() {
			System.out.println("INNER");
		}
	}

	public static void main(String[] args) {
		Member2.A a2 = new Member2().new A();
	}
}
