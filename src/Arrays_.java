import java.lang.String;
import java.util.Arrays;

class Arrays_ {
    public static void main(String[] args) {
        int[] list = new int[2];
        list[0] = 1;
        list[1] = 2;

        System.out.println(Arrays.toString(list));
        System.out.println(list.length);

        for (int i = 0; i < list.length; i++) {
            System.out.println(i);
        }

        int[] list2 = { 2, 1, 3 };
        System.out.println(Arrays.toString(list2));

        Arrays.sort(list2); // Mutates original value
        System.out.println(Arrays.toString(list2));

        // 2D Arrays
        int[][] list2D = new int[2][2];

        list2D[0][0] = 1;
        list2D[0][1] = 2;
        list2D[1][0] = 3;
        list2D[1][1] = 4;

        for (int i = 0; i < list2D.length; i++) {
            System.out.println(Arrays.toString(list2D[i]));
        }

        int[][] list2DInitialized = { { 1, 2 }, { 2 }, { 3 } };
        System.out.println(list2DInitialized);

    }
}