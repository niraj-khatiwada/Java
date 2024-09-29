
import java.util.*;

class Main {

    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length)
                .thenComparing(String::compareTo);
        var customMap = new TreeMap<String, Integer>(comparator);
        customMap.put("code", 1);
        customMap.put("for", 2);
        customMap.put("real", 2);
        customMap.put("hahah", 2);
        System.out.println(customMap);

    }

}
