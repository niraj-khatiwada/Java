
import java.util.*;

class Set {

    public static void main(String[] args) {
        // UPDATE: Actually, we don't need this, we can use normal HashSet for
        // uniqueness of Array, Collections

        var hashSet = new HashSet<ArrayList<Integer>>();

        var l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        hashSet.add(l1);

        var l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        hashSet.add(l2);

        System.out.println(hashSet);

        var list = new ArrayList<ArrayList<Integer>>();
        list.addAll(hashSet);

        // UPDATE: TREESET NOT REQUIRED
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
