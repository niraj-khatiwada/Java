
import java.util.*;

class Set {

    public static void main(String[] args) {
        // We can use TreeSet to compare arrays in Set
        TreeSet<int[]> set = new TreeSet<>((a, b) -> Arrays.compare(a, b));

        set.add(new int[] { 1, 2 });
        set.add(new int[] { 1, 2 });

        System.out.println(set.size());

        System.out.println(set.contains(new int[] { 1, 2 }));

        // If we want to use reference types like Node in Set, better to use HashMap for
        // that.

    }

}
