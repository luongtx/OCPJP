package class_design.inner_class.member;

public class TwoLevelNested {
	private int a = 10;

	class A {
		private int x = 10;

		class B {
			private int x = 20;
//			private int x1 = 30;

			class C {
				private int x = 30;

				public void allTheX() {
					System.out.println(x);
//					System.out.println(x1);
					System.out.println(this.x);
					System.out.println(B.this.x);
					System.out.println(A.this.x);
				}
			}
		}
	}

	void modA() {
		a = 5;
	}

	public static void main(String[] args) {
		TwoLevelNested t = new TwoLevelNested();
		A a = t.new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.allTheX();
	}
}
