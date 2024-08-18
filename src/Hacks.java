import java.util.*;

public class Hacks {
    public void main() {
        // Array copy and slicing
        // Only works for Arrays
        int[] array = new int[] { 1, 2, 3 };
        System.out.println(Arrays.toString(Arrays.copyOf(array, 1)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 1, 3)));

        // Collection Slicing. ^^^ This does not create a copy unlike Arrays^^^^
        // Can be used for LinkedList, ArrayList, etc.
        List<Integer> collections = new ArrayList<>();
        collections.add(1);
        collections.add(2);
        collections.add(3);
        var slice = collections.subList(0, 2);
        System.out.println(slice); // [1, 2]
        slice.add(4); // This will change the original collection
        System.out.println(slice); // [1, 2, 4]
        System.out.println(collections); // [1,2, 4, 3]
        // Never add value in slice. It'll be confusing. So just create a new collection
        // and mutate it instead.

        // To create a copy from a collection, you need to create a new collection from
        // old one.
        List<Integer> collectionCopy = new ArrayList<>(collections);
        System.out.println(collectionCopy);

    }
}
