package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {
	public static void main(String[] args) {
		Locale currentLocale = new Locale("vi", "VN");
		System.out.println(currentLocale);
		ResourceBundle resBundle = ResourceBundle.getBundle("ResourceBundle", currentLocale);
		System.out.printf(resBundle.getString("locale"));
	}
}
