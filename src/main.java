
import java.util.*;

class Main {

    public static void main(String[] args) {

        var set = new TreeSet<int[]>((a, b) -> Arrays.compare(a, b));
        set.add(new int[] { 1, 2, 3 });
        set.add(new int[] { 1, 2, 3 });

        System.out.println(set);
        System.out.println(set.size());

        // Collections
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
        System.out.println(hashSet.size());

        // You can add set into an array list in single line
        var list = new ArrayList<ArrayList<Integer>>();
        list.addAll(hashSet);

    }

}
