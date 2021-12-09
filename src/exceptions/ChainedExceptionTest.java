package exceptions;

public class ChainedExceptionTest {
	public static void foo() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException oob) {
			RuntimeException re = new RuntimeException(oob);
			/*This method can be called at most once.  It is generally called from
		     * within the constructor, or immediately after creating the
		     * throwable
		     */
			re.initCause(oob);
			throw re;
		}
	}

	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception re) {
			System.out.println(re.getClass());
		}
	}
}
