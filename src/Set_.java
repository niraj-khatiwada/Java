
import java.util.*;

class Set {

    public static void main(String[] args) {
        // TREESET vs HASHSET for Array and Collections

        // We need to use TreeSet for Array comparison.
        // The Array does not implement .equals() and .hashCode() method properly so
        // HashSet cannot be used for Arrays. They can be used for Lists though.
        TreeSet<int[]> set = new TreeSet<>((a, b) -> Arrays.compare(a, b));

        set.add(new int[] { 1, 2 });
        set.add(new int[] { 1, 2 });

        System.out.println(set.size());

        System.out.println(set.contains(new int[] { 1, 2 }));

        // If we want to use reference types like Node in Set, better to use HashMap for
        // that.
        var hashSet = new HashSet<ArrayList<Integer>>();

        // We can use the HashSet for List comparison.
        // The List collection properly implements the equals() and hashCode() so we can
        // use HashSet for Lists
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

    }

}
