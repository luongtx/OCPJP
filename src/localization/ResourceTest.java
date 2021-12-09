package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceTest {
	public static void main(String[] args) {
//		Locale.setDefault(new Locale("fr", "IT"));
//		Locale loc = new Locale("en", "US");
		Locale loc = new Locale("vi", "VN");
		ResourceBundle rb = ResourceBundle.getBundle("resource.MyResourceBundle", loc);
		System.out.println(rb.getObject("surprise"));
	}
}
