
import java.util.*;

class Main {

    public static void main(String[] args) {
        // LinkedHashSet = LinkedList + HashSet
        // With LinkedHashSet, the order to which the element is added is always
        // guaranteed to be the same (like LinkedList) and there would be no duplicates
        // (like HashSet).
        var linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Hello");
        linkedHashSet.add("World");
        linkedHashSet.add("unknown");
        linkedHashSet.add("Hello");
        linkedHashSet.add("World");

        linkedHashSet.remove("unknown");

        System.out.println(linkedHashSet);

        // LinkedHashMap = LinkedList + HashMap
        // With LinkedHashMap, the order to which the entry is added is always
        // guaranteed to be the same (like LinkedList) and there would be no duplicate
        // entry (like HashMap).
        var linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("name", "Hello");
        linkedHashMap.put("name", "World");
        linkedHashMap.put("unknown", "<>");
        linkedHashMap.put("age", "20");

        linkedHashMap.remove("unknown");

        System.out.println(linkedHashMap);

    }

}
