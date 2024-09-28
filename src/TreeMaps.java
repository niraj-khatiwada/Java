import java.util.Comparator;
import java.util.TreeMap;

public class TreeMaps {
    public void main() {
        // Integer as Key
        var map = new TreeMap<Integer, String>();
        map.put(20, "Twenty");
        map.put(10, "Ten");
        map.put(30, "Thirty");

        // First and last entry
        System.out.println("First= " + map.firstEntry());
        System.out.println("Last= " + map.lastEntry());

        // Floor and ceiling entry
        System.out.println("Floor= " + map.floorEntry(20));
        System.out.println("Ceil= " + map.ceilingEntry(25));

        // Get entries less than 20
        // HeadMap are exclusive. They will not include the entry of key(toKey) provided
        // i.e. 20 will not be included. If you want to include 20, just pass 21.
        var viewlt20 = map.headMap(20); // This will not return copy but window of view of the same tree map
        System.out.println(viewlt20);

        // Get entries greater than 20
        // TailMap are inclusive, they will include the entry of key(toKey) provided
        // i.e. 20 will be included. If you want to exclude 20, just pass 21.
        var viewgt20 = map.tailMap(20); // This will not return copy but window of view of the same tree map
        System.out.println(viewgt20);

        // String as Key
        var map2 = new TreeMap<String, Integer>();
        map2.put("Niraj", 1);
        map2.put("Apple", 2);
        map2.put("Kathmandu", 3);

        System.out.println(map2);

        // Reverse Order
        var mapReverse = new TreeMap<Integer, String>(Comparator.reverseOrder());
        mapReverse.put(1, "One");
        mapReverse.put(3, "Three");
        mapReverse.put(2, "Two");
        System.out.println(mapReverse);
    }
}
