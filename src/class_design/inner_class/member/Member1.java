package class_design.inner_class.member;

public class Member1 {
	class X {
		class Y {
			private void m() {
				System.out.println("INNER");
			}
		}

		public void invokeInner() {
			Y obj = new Y(); // Line 9
			obj.m(); // Line 10
		}
	}

	public static void main(String[] args) {
		new Member1().new X().invokeInner();
	}
}
