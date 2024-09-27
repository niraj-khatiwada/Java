
import java.util.*;

class Main {

    public static void main(String[] args) {

        var map = new TreeMap<Integer, Integer>();
        map.put(10, 20);
        map.put(20, 30);
        map.put(30, 40);
        System.out.println(map.floorKey(25));
        System.out.println(map.ceilingKey(25));
    }

}
