import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Arrays;

public class Sorting {

    public void sort() {
        // List using `List` interface like LinkedList, ArrayList, etc. can be sorted
        // using Collections.sort() method.
        var linkedList = new LinkedList<Integer>();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(1);
        Collections.sort(linkedList);
        System.out.printf("LinkedList Sorted %s \n", linkedList);

        var arrayList = new ArrayList<Integer>();
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(1);
        Collections.sort(arrayList);
        System.out.printf("ArrayList Sorted %s \n", arrayList);

        // Arrays can be sorted using Arrays.sort() method.
        var array = new int[5];
        array[0] = 4;
        array[1] = 1;
        array[2] = 5;
        array[3] = 3;
        array[4] = 2;

        Arrays.sort(array);
        System.out.printf("Array Sorted %s \n", Arrays.toString(array));

        // Sorting a sub-array
        var fullArray = new int[] { 5, 3, 2, 1, 6, 0 };
        Arrays.sort(fullArray, 0, 4); // Only sort starting from 0 to 3rd
        System.out.println(Arrays.toString(fullArray));

    }
}
