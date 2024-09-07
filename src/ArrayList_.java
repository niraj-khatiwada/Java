import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayList_ {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0)); // Gets
        arrayList.set(0, 100); // Update
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.indexOf(1));
        System.out.println(arrayList.contains(1));

        // Be careful while removing the value from array list
        arrayList.remove(0); // Remove by index
        arrayList.remove(Integer.valueOf(0)); // Remove by value.

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
