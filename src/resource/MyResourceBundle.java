package resource;

import java.util.ListResourceBundle;

public class MyResourceBundle extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		Object[][] arr = { { "surprise", "SURPRISE!" } };
		return arr;
	}
}
