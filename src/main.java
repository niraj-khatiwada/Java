
import java.util.*;

class Main {

    public static void main(String[] args) {
        var s = new Comparators();
        s.doubleSorting();

        // Sorting a sub-array
        var fullArray = new int[] { 5, 3, 2, 1, 6, 0 };
        Arrays.sort(fullArray, 0, 4); // Only sort starting from 0 to 3rd i.e [5, 3, 2, 1]. The end index is
                                      // exclusive.
        System.out.println(Arrays.toString(fullArray));
    }

}
