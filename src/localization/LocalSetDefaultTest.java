package localization;

import java.util.Locale;

public class LocalSetDefaultTest {
	public static void main(String[] args) {
        Locale loc = new Locale("it", "IT"); //Line 7
        loc.setDefault(loc); //Line 8
        System.out.println(Locale.getDefault());
	}
}
