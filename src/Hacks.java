import java.util.*;

public class Hacks {
    public void main() {
        // Array Slicing
        // Only works for Arrays
        int[] array = new int[] { 1, 2, 3 };
        var slice = Arrays.copyOfRange(array, 1, 3);
        System.out.println(Arrays.toString(slice));

        // Collection Slicing
        // Can be used for LinkedList, ArrayList, etc.
        List<Integer> collections = new ArrayList<>();
        collections.add(1);
        collections.add(2);
        collections.add(3);
        System.out.println(collections.subList(0, 0));

    }
}
