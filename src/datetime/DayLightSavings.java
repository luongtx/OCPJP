package datetime;

class Resource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Close-");
	}

	public void open() {
		System.out.println("Open-");
	}

}

public class DayLightSavings {
	public static void main(String[] args) {
		Resource r1;
		try(r1 = new Resource()) {
			r1.open();
		}
	}
}
