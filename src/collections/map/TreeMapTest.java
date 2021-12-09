package collections.map;

import java.util.Map;
import java.util.TreeMap;

enum TrafficLight {
    RED, YELLOW, GREEN
}
 
public class TreeMapTest {
    public static void main(String[] args) {
        Map<TrafficLight, String> map = new TreeMap<>();
        map.put(TrafficLight.GREEN, "GO");
        map.put(TrafficLight.RED, "STOP");
        map.put(TrafficLight.YELLOW, "STOP IN 3 Seconds");
        map.put(TrafficLight.YELLOW, "READY TO STOP");
 
        //The natural order for enum elements is the sequence in which they are defined.
        for(String msg : map.values()) {
            System.out.println(msg);
        }
    }
}
