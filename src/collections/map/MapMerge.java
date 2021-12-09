package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMerge {
	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		String luong = favorites.merge("Luong", "a", mapper);
		System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
		System.out.println(jenny);
		// Bus Tour
		System.out.println(tom);

	}
}
