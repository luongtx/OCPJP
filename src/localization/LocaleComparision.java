package localization;
import java.util.Locale;

public class LocaleComparision {
	public static void main(String[] args) {
		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale l2 = Locale.US;
		Locale l3 = new Locale("en");
		Locale l4 = new Locale("EN", "US");

//		System.out.println(l1);
//		System.out.println(l2);
//		System.out.println(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l2.equals(l3));
		System.out.println(l2.equals(l4));
	}
}
