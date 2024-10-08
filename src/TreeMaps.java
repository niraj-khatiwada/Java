import java.util.Comparator;
import java.util.TreeMap;

public class TreeMaps {
    public void main() {
        // Integer as Key
        var map = new TreeMap<Integer, String>();
        // get(), put() and remove() all run in O(log(n))
        map.put(20, "Twenty");
        map.put(10, "Ten");
        map.put(30, "Thirty");
        map.put(40, "Forty");

        // First and last entry
        System.out.println("First= " + map.firstEntry());
        System.out.println("Last= " + map.lastEntry());

        // Lower and higher entry. These are exclusive to key provided
        System.out.println(map.lowerEntry(20));
        System.out.println(map.higherEntry(30)); // Equivalent to Upper Bound in BS

        // Floor and ceiling entry. These are inclusive to key provided
        System.out.println("Floor= " + map.floorEntry(20));
        System.out.println("Ceil= " + map.ceilingEntry(25)); // Equivalent to Lower Bound in BS

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

        // Get entries between 20 and 30
        // Just like substring(), the upper bound is exclusive for subMap as well
        System.out.println(map.subMap(20, 30));

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

        // Custom Comparator
        // Sort based on length of key
        Comparator<String> comparator = Comparator.comparingInt(String::length)
                .thenComparing(String::compareTo); // Fallback to lexicographical sorting if the length are equal. If
                                                   // you do not do this, the strings with same length will be ignored
                                                   // after you add one.
        var customMap = new TreeMap<String, Integer>(comparator);
        customMap.put("code", 1);
        customMap.put("for", 2);
        customMap.put("real", 2);
        customMap.put("hahah", 2);
        System.out.println(customMap);

    }
}
