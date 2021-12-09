package class_design.inner_class.member;

public class NestedInterface {
	private interface Secret {
		public void shh();
	}

	private interface Disclose {
		public void dhh();
	}

	class DontTell implements Secret, Disclose {
		final static int a = 1;
		static int b = 2;

		public void shh() {
		}

		public void dhh() {

		}
	}
}
