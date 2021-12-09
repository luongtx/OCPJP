package collections.map;

import java.util.Map;
import java.util.TreeMap;
 
public class TreeMapTest2 {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        
        /*
         * TreeMap cannot contain null keys. Hence, 'map.put(null, "null");' throws NullPointerException.
         */
        map.put(null, "null");
        map.forEach((key, value) -> System.out.println("{" + key + ": " + value + "}"));
    }
} 
