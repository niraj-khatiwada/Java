
import java.util.*;

class Main {

    public static void main(String[] args) {

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
    }

}
