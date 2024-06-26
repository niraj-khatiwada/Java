import java.util.Map;
import java.util.HashMap;

class Hashmap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.remove("1");
        System.out.println(map.get("1"));
        System.out.println(map.get("0"));
        System.out.println(map.size());
        System.out.println(map.containsKey("1"));

        for (var entry : map.entrySet()) {
            System.out.printf("Entries %s = %s\n", entry.getKey(), entry.getValue());
        }

    }
}
